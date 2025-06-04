// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiCallTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallDay")
    public String callDayShrink;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("CallRetryInterval")
    public Long callRetryInterval;

    @NameInMap("CallRetryReason")
    public String callRetryReasonShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CallRetryTimes")
    public Long callRetryTimes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallTime")
    public String callTimeShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MissCallRetry")
    public Boolean missCallRetry;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMMEDIATE</p>
     */
    @NameInMap("StartType")
    public String startType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1152311212312***</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>1748923429000</p>
     */
    @NameInMap("TaskStartTime")
    public Long taskStartTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0537022*****</p>
     */
    @NameInMap("VirtualNumber")
    public String virtualNumber;

    public static UpdateAiCallTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiCallTaskShrinkRequest self = new UpdateAiCallTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiCallTaskShrinkRequest setCallDayShrink(String callDayShrink) {
        this.callDayShrink = callDayShrink;
        return this;
    }
    public String getCallDayShrink() {
        return this.callDayShrink;
    }

    public UpdateAiCallTaskShrinkRequest setCallRetryInterval(Long callRetryInterval) {
        this.callRetryInterval = callRetryInterval;
        return this;
    }
    public Long getCallRetryInterval() {
        return this.callRetryInterval;
    }

    public UpdateAiCallTaskShrinkRequest setCallRetryReasonShrink(String callRetryReasonShrink) {
        this.callRetryReasonShrink = callRetryReasonShrink;
        return this;
    }
    public String getCallRetryReasonShrink() {
        return this.callRetryReasonShrink;
    }

    public UpdateAiCallTaskShrinkRequest setCallRetryTimes(Long callRetryTimes) {
        this.callRetryTimes = callRetryTimes;
        return this;
    }
    public Long getCallRetryTimes() {
        return this.callRetryTimes;
    }

    public UpdateAiCallTaskShrinkRequest setCallTimeShrink(String callTimeShrink) {
        this.callTimeShrink = callTimeShrink;
        return this;
    }
    public String getCallTimeShrink() {
        return this.callTimeShrink;
    }

    public UpdateAiCallTaskShrinkRequest setMissCallRetry(Boolean missCallRetry) {
        this.missCallRetry = missCallRetry;
        return this;
    }
    public Boolean getMissCallRetry() {
        return this.missCallRetry;
    }

    public UpdateAiCallTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAiCallTaskShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAiCallTaskShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAiCallTaskShrinkRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public UpdateAiCallTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateAiCallTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public UpdateAiCallTaskShrinkRequest setTaskStartTime(Long taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }
    public Long getTaskStartTime() {
        return this.taskStartTime;
    }

    public UpdateAiCallTaskShrinkRequest setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
