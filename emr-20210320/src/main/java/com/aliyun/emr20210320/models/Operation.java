// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Operation extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("OperationState")
    public String operationState;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("StartTime")
    public Long startTime;

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
