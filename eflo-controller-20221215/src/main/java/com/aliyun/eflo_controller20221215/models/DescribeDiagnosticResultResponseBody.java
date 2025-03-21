// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i118913031696573280136</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>2024-06-15T10:17:56</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>diag-i155363241720059671316</p>
     */
    @NameInMap("DiagnosticId")
    public String diagnosticId;

    @NameInMap("DiagnosticResults")
    public java.util.List<?> diagnosticResults;

    /**
     * <strong>example:</strong>
     * <p>Fault</p>
     */
    @NameInMap("DiagnosticState")
    public String diagnosticState;

    /**
     * <strong>example:</strong>
     * <p>CheckByAiJobLogs</p>
     */
    @NameInMap("DiagnosticType")
    public String diagnosticType;

    /**
     * <strong>example:</strong>
     * <p>2024-06-11T10:00:30</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <strong>example:</strong>
     * <p>8F065DDD-6996-5973-9691-9EC57BD0072E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticResultResponseBody self = new DescribeDiagnosticResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticResultResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDiagnosticResultResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDiagnosticResultResponseBody setDiagnosticId(String diagnosticId) {
        this.diagnosticId = diagnosticId;
        return this;
    }
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    public DescribeDiagnosticResultResponseBody setDiagnosticResults(java.util.List<?> diagnosticResults) {
        this.diagnosticResults = diagnosticResults;
        return this;
    }
    public java.util.List<?> getDiagnosticResults() {
        return this.diagnosticResults;
    }

    public DescribeDiagnosticResultResponseBody setDiagnosticState(String diagnosticState) {
        this.diagnosticState = diagnosticState;
        return this;
    }
    public String getDiagnosticState() {
        return this.diagnosticState;
    }

    public DescribeDiagnosticResultResponseBody setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
        return this;
    }
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    public DescribeDiagnosticResultResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosticResultResponseBody setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public DescribeDiagnosticResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
