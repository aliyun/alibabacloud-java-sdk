// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateMapRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Concurrency")
    public Long concurrency;

    /**
     * <strong>example:</strong>
     * <p>my_exec_name</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <strong>example:</strong>
     * <p>my_flow_name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <strong>example:</strong>
     * <p>c39142f1345b196d678333c41f113000</p>
     */
    @NameInMap("MapRunName")
    public String mapRunName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ToleratedFailedCount")
    public Long toleratedFailedCount;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ToleratedFailedPercentage")
    public Float toleratedFailedPercentage;

    public static UpdateMapRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMapRunResponseBody self = new UpdateMapRunResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMapRunResponseBody setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public UpdateMapRunResponseBody setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public UpdateMapRunResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public UpdateMapRunResponseBody setMapRunName(String mapRunName) {
        this.mapRunName = mapRunName;
        return this;
    }
    public String getMapRunName() {
        return this.mapRunName;
    }

    public UpdateMapRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMapRunResponseBody setToleratedFailedCount(Long toleratedFailedCount) {
        this.toleratedFailedCount = toleratedFailedCount;
        return this;
    }
    public Long getToleratedFailedCount() {
        return this.toleratedFailedCount;
    }

    public UpdateMapRunResponseBody setToleratedFailedPercentage(Float toleratedFailedPercentage) {
        this.toleratedFailedPercentage = toleratedFailedPercentage;
        return this;
    }
    public Float getToleratedFailedPercentage() {
        return this.toleratedFailedPercentage;
    }

}
