// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAggTaskGroupResponseBody extends TeaModel {
    /**
     * <p>Summary of the aggregation task group configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>a54136014dc386a92c83a6ef1e97ff22</p>
     */
    @NameInMap("aggTaskGroupConfigHash")
    public String aggTaskGroupConfigHash;

    /**
     * <p>Aggregation task group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aggTaskGroup-f4b8e50525cf41c894488c0c71ec483f</p>
     */
    @NameInMap("aggTaskGroupId")
    public String aggTaskGroupId;

    /**
     * <p>Aggregation task group name.</p>
     * 
     * <strong>example:</strong>
     * <p>pipeline-aggtask-group</p>
     */
    @NameInMap("aggTaskGroupName")
    public String aggTaskGroupName;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16C0A6D6-C3E7-511D-A60B-A87FD85F5BA7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Source Prometheus instance ID of the aggregation task group.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-ecc04af14729b1a16e40a0d10068</p>
     */
    @NameInMap("sourcePrometheusId")
    public String sourcePrometheusId;

    /**
     * <p>Current status of the aggregation task group.</p>
     * 
     * <strong>example:</strong>
     * <p>Pending2Running</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateAggTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggTaskGroupResponseBody self = new CreateAggTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggTaskGroupResponseBody setAggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
        this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
        return this;
    }
    public String getAggTaskGroupConfigHash() {
        return this.aggTaskGroupConfigHash;
    }

    public CreateAggTaskGroupResponseBody setAggTaskGroupId(String aggTaskGroupId) {
        this.aggTaskGroupId = aggTaskGroupId;
        return this;
    }
    public String getAggTaskGroupId() {
        return this.aggTaskGroupId;
    }

    public CreateAggTaskGroupResponseBody setAggTaskGroupName(String aggTaskGroupName) {
        this.aggTaskGroupName = aggTaskGroupName;
        return this;
    }
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    public CreateAggTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAggTaskGroupResponseBody setSourcePrometheusId(String sourcePrometheusId) {
        this.sourcePrometheusId = sourcePrometheusId;
        return this;
    }
    public String getSourcePrometheusId() {
        return this.sourcePrometheusId;
    }

    public CreateAggTaskGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
