// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiCallTaskShrinkRequest extends TeaModel {
    /**
     * <p>The days of the week when calls can be made.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallDay")
    public String callDayShrink;

    /**
     * <p>The retry interval in minutes. The maximum value is 120.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("CallRetryInterval")
    public Long callRetryInterval;

    /**
     * <p>The call failure statuses that trigger a retry.</p>
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
     * <p>The callable time windows.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallTime")
    public String callTimeShrink;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("LineEncoding")
    public String lineEncoding;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("LinePhoneNum")
    public String linePhoneNum;

    /**
     * <p>Specifies whether to enable retry. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Yes.</p>
     * </li>
     * <li><p><code>false</code> (default): No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MissCallRetry")
    public Boolean missCallRetry;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>53</p>
     */
    @NameInMap("PhoneType")
    public Long phoneType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("Source")
    public Long source;

    /**
     * <p>The startup method. Valid values:</p>
     * <ul>
     * <li><p><code>IMMEDIATE</code>: Start immediately.</p>
     * </li>
     * <li><p><code>SCHEDULE</code>: Start at a specified time.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMMEDIATE</p>
     */
    @NameInMap("StartType")
    public String startType;

    /**
     * <p>The number of concurrent calls per second (CPS) for the task. The maximum value is 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TaskCps")
    public Long taskCps;

    /**
     * <p>The ID of the task to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1187**************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task name. The name must be unique within an Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The scheduled start time for the task, specified as a Unix timestamp in milliseconds. This parameter is required when <code>StartType</code> is set to <code>SCHEDULE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1748923429000</p>
     */
    @NameInMap("TaskStartTime")
    public Long taskStartTime;

    /**
     * <p>The service instance used for outbound calls.</p>
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

    public UpdateAiCallTaskShrinkRequest setLineEncoding(String lineEncoding) {
        this.lineEncoding = lineEncoding;
        return this;
    }
    public String getLineEncoding() {
        return this.lineEncoding;
    }

    public UpdateAiCallTaskShrinkRequest setLinePhoneNum(String linePhoneNum) {
        this.linePhoneNum = linePhoneNum;
        return this;
    }
    public String getLinePhoneNum() {
        return this.linePhoneNum;
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

    public UpdateAiCallTaskShrinkRequest setPhoneType(Long phoneType) {
        this.phoneType = phoneType;
        return this;
    }
    public Long getPhoneType() {
        return this.phoneType;
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

    public UpdateAiCallTaskShrinkRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public UpdateAiCallTaskShrinkRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public UpdateAiCallTaskShrinkRequest setTaskCps(Long taskCps) {
        this.taskCps = taskCps;
        return this;
    }
    public Long getTaskCps() {
        return this.taskCps;
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
