// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Operation extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The time when the operation was created. This value is a UNIX timestamp, measured in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1628589439114</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the operation ended. This value is a UNIX timestamp, measured in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1628589439114</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The operation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>op-13c37a77c505****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The operation state. Valid values:</p>
     * <ul>
     * <li><p><code>IN_PROGRESS</code>: The operation is in progress.</p>
     * </li>
     * <li><p><code>COMPLETED</code>: The operation completed.</p>
     * </li>
     * <li><p><code>HUMAN_PROCESSING</code>: The operation requires manual intervention.</p>
     * </li>
     * <li><p><code>FAILED</code>: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("OperationState")
    public String operationState;

    /**
     * <p>The operation type.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE_CLUSTER</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The time when the operation started. This value is a UNIX timestamp, measured in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1628589439114</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The reason for the state change.</p>
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
