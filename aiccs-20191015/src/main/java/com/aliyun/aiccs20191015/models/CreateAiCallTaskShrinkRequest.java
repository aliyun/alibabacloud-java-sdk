// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiCallTaskShrinkRequest extends TeaModel {
    /**
     * <p>The ID of a published agent.</p>
     * 
     * <strong>example:</strong>
     * <p>1180**************</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>025****C98</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>The list of callable days.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallDay")
    public String callDayShrink;

    /**
     * <p>The retry interval, in minutes. The maximum value is 720.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("CallRetryInterval")
    public Long callRetryInterval;

    /**
     * <p>The failure reasons that trigger a retry.</p>
     */
    @NameInMap("CallRetryReason")
    public String callRetryReasonShrink;

    /**
     * <p>The number of retries. The maximum value is 3.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CallRetryTimes")
    public Long callRetryTimes;

    /**
     * <p>The list of callable time periods.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallTime")
    public String callTimeShrink;

    /**
     * <strong>example:</strong>
     * <p>JILIANG_***_***_NET</p>
     */
    @NameInMap("LineEncoding")
    public String lineEncoding;

    /**
     * <strong>example:</strong>
     * <p>152****3120</p>
     */
    @NameInMap("LinePhoneNum")
    public String linePhoneNum;

    /**
     * <p>Specifies whether to enable retry. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables retry.</p>
     * </li>
     * <li><p><code>false</code> (default): Disables retry.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MissCallRetry")
    public Boolean missCallRetry;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PhoneType")
    public Long phoneType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Source")
    public Long source;

    /**
     * <p>The startup mode. Valid values:</p>
     * <ul>
     * <li><p><code>IMMEDIATE</code>: Starts the task immediately.</p>
     * </li>
     * <li><p><code>SCHEDULE</code>: Starts the task at a scheduled time.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCHEDULE</p>
     */
    @NameInMap("StartType")
    public String startType;

    /**
     * <p>The task concurrency. The maximum value is 500.</p>
     * 
     * <strong>example:</strong>
     * <p>75</p>
     */
    @NameInMap("TaskCps")
    public Long taskCps;

    /**
     * <p>The name of the task. It must be unique within an account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The scheduled start time for the task, specified as a timestamp in milliseconds. This parameter is required and applies only when <code>StartType</code> is set to <code>SCHEDULE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>12313123133</p>
     */
    @NameInMap("TaskStartTime")
    public Long taskStartTime;

    /**
     * <p>The service instance used for outbound calls.</p>
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

    public CreateAiCallTaskShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
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

    public CreateAiCallTaskShrinkRequest setLineEncoding(String lineEncoding) {
        this.lineEncoding = lineEncoding;
        return this;
    }
    public String getLineEncoding() {
        return this.lineEncoding;
    }

    public CreateAiCallTaskShrinkRequest setLinePhoneNum(String linePhoneNum) {
        this.linePhoneNum = linePhoneNum;
        return this;
    }
    public String getLinePhoneNum() {
        return this.linePhoneNum;
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

    public CreateAiCallTaskShrinkRequest setPhoneType(Long phoneType) {
        this.phoneType = phoneType;
        return this;
    }
    public Long getPhoneType() {
        return this.phoneType;
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

    public CreateAiCallTaskShrinkRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateAiCallTaskShrinkRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public CreateAiCallTaskShrinkRequest setTaskCps(Long taskCps) {
        this.taskCps = taskCps;
        return this;
    }
    public Long getTaskCps() {
        return this.taskCps;
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
