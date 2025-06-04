// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiCallTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121223123123****</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallDay")
    public String callDayShrink;

    /**
     * <strong>example:</strong>
     * <p>32</p>
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
     * <p>false</p>
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
     * <p>SCHEDULE</p>
     */
    @NameInMap("StartType")
    public String startType;

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
     * <p>12313123133</p>
     */
    @NameInMap("TaskStartTime")
    public Long taskStartTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>032712122*****</p>
     */
    @NameInMap("VirtualNumber")
    public String virtualNumber;

    public static CreateAiCallTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiCallTaskShrinkRequest self = new CreateAiCallTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiCallTaskShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateAiCallTaskShrinkRequest setCallDayShrink(String callDayShrink) {
        this.callDayShrink = callDayShrink;
        return this;
    }
    public String getCallDayShrink() {
        return this.callDayShrink;
    }

    public CreateAiCallTaskShrinkRequest setCallRetryInterval(Long callRetryInterval) {
        this.callRetryInterval = callRetryInterval;
        return this;
    }
    public Long getCallRetryInterval() {
        return this.callRetryInterval;
    }

    public CreateAiCallTaskShrinkRequest setCallRetryReasonShrink(String callRetryReasonShrink) {
        this.callRetryReasonShrink = callRetryReasonShrink;
        return this;
    }
    public String getCallRetryReasonShrink() {
        return this.callRetryReasonShrink;
    }

    public CreateAiCallTaskShrinkRequest setCallRetryTimes(Long callRetryTimes) {
        this.callRetryTimes = callRetryTimes;
        return this;
    }
    public Long getCallRetryTimes() {
        return this.callRetryTimes;
    }

    public CreateAiCallTaskShrinkRequest setCallTimeShrink(String callTimeShrink) {
        this.callTimeShrink = callTimeShrink;
        return this;
    }
    public String getCallTimeShrink() {
        return this.callTimeShrink;
    }

    public CreateAiCallTaskShrinkRequest setMissCallRetry(Boolean missCallRetry) {
        this.missCallRetry = missCallRetry;
        return this;
    }
    public Boolean getMissCallRetry() {
        return this.missCallRetry;
    }

    public CreateAiCallTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAiCallTaskShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAiCallTaskShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAiCallTaskShrinkRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public CreateAiCallTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateAiCallTaskShrinkRequest setTaskStartTime(Long taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }
    public Long getTaskStartTime() {
        return this.taskStartTime;
    }

    public CreateAiCallTaskShrinkRequest setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
