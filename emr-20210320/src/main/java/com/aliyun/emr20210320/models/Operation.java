// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Operation extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>创建时间。</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>结束时间。</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>操作ID。</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>操作状态。</p>
     */
    @NameInMap("OperationState")
    public String operationState;

    /**
     * <p>操作类型。</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>开始时间。</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>状态转换原因。</p>
     */
    @NameInMap("StateChangeReason")
    public OperationStateChangeReason stateChangeReason;

    public static Operation build(java.util.Map<String, ?> map) throws Exception {
        Operation self = new Operation();
        return TeaModel.build(map, self);
    }

    public Operation setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Operation setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Operation setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Operation setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Operation setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public Operation setOperationState(String operationState) {
        this.operationState = operationState;
        return this;
    }
    public String getOperationState() {
        return this.operationState;
    }

    public Operation setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public Operation setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public Operation setStateChangeReason(OperationStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }
    public OperationStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

}
