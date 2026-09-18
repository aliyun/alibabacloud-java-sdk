// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiCallTaskRequest extends TeaModel {
    /**
     * <p>The code of the agent that is already online.</p>
     * 
     * <strong>example:</strong>
     * <p>1180**************</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application code. This parameter is used when the creation source is engine.</p>
     * 
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
    public java.util.List<String> callDay;

    /**
     * <p>The expiration date of outbound call details (specific deadline).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-30 20:00:20</p>
     */
    @NameInMap("CallExpireDate")
    public String callExpireDate;

    /**
     * <p>The expiration duration of outbound call details. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallExpireMinutes")
    public Long callExpireMinutes;

    /**
     * <p>The outbound call validity type. Valid values:</p>
     * <p>0: permanently valid.
     * 1: valid for a specified duration after import.
     * 2: valid until a specified date.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallExpireType")
    public Long callExpireType;

    /**
     * <p>The retry interval. Unit: minutes. The maximum value is 720 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("CallRetryInterval")
    public Long callRetryInterval;

    /**
     * <p>The list of failure retry reasons.</p>
     */
    @NameInMap("CallRetryReason")
    public java.util.List<String> callRetryReason;

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
    public java.util.List<String> callTime;

    @NameInMap("CallableTime")
    public java.util.List<String> callableTime;

    /**
     * <p>The line encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>JILIANG_***_***_NET</p>
     */
    @NameInMap("LineEncoding")
    public String lineEncoding;

    /**
     * <p>The customer-provided line number.</p>
     * 
     * <strong>example:</strong>
     * <p>152****3120</p>
     */
    @NameInMap("LinePhoneNum")
    public String linePhoneNum;

    /**
     * <p>Specifies whether to enable retry. Valid values:</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false (default): disabled.</p>
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
     * <p>The number type. This parameter is used when the creation source is engine. Valid values:</p>
     * <ul>
     * <li><p>0: Alibaba Cloud number.</p>
     * </li>
     * <li><p>1: customer-provided line.</p>
     * </li>
     * </ul>
     * 
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
     * <p>The creation source. Valid values:</p>
     * <ul>
     * <li><p>0: created by agent.</p>
     * </li>
     * <li><p>1: created by engine.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Source")
    public Long source;

    /**
     * <p>The start mode. Valid values:</p>
     * <ul>
     * <li><p>IMMEDIATE: starts immediately.</p>
     * </li>
     * <li><p>SCHEDULE: starts at a scheduled time.</p>
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
     * <p>The task name. The name must be unique within the same account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTask</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The preset start time of the task. The value is a UNIX timestamp in milliseconds. This parameter is valid and required when the StartType parameter is set to SCHEDULE. The task automatically starts at the time specified by this parameter.</p>
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

    public static CreateAiCallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiCallTaskRequest self = new CreateAiCallTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiCallTaskRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateAiCallTaskRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public CreateAiCallTaskRequest setCallDay(java.util.List<String> callDay) {
        this.callDay = callDay;
        return this;
    }
    public java.util.List<String> getCallDay() {
        return this.callDay;
    }

    public CreateAiCallTaskRequest setCallExpireDate(String callExpireDate) {
        this.callExpireDate = callExpireDate;
        return this;
    }
    public String getCallExpireDate() {
        return this.callExpireDate;
    }

    public CreateAiCallTaskRequest setCallExpireMinutes(Long callExpireMinutes) {
        this.callExpireMinutes = callExpireMinutes;
        return this;
    }
    public Long getCallExpireMinutes() {
        return this.callExpireMinutes;
    }

    public CreateAiCallTaskRequest setCallExpireType(Long callExpireType) {
        this.callExpireType = callExpireType;
        return this;
    }
    public Long getCallExpireType() {
        return this.callExpireType;
    }

    public CreateAiCallTaskRequest setCallRetryInterval(Long callRetryInterval) {
        this.callRetryInterval = callRetryInterval;
        return this;
    }
    public Long getCallRetryInterval() {
        return this.callRetryInterval;
    }

    public CreateAiCallTaskRequest setCallRetryReason(java.util.List<String> callRetryReason) {
        this.callRetryReason = callRetryReason;
        return this;
    }
    public java.util.List<String> getCallRetryReason() {
        return this.callRetryReason;
    }

    public CreateAiCallTaskRequest setCallRetryTimes(Long callRetryTimes) {
        this.callRetryTimes = callRetryTimes;
        return this;
    }
    public Long getCallRetryTimes() {
        return this.callRetryTimes;
    }

    public CreateAiCallTaskRequest setCallTime(java.util.List<String> callTime) {
        this.callTime = callTime;
        return this;
    }
    public java.util.List<String> getCallTime() {
        return this.callTime;
    }

    public CreateAiCallTaskRequest setCallableTime(java.util.List<String> callableTime) {
        this.callableTime = callableTime;
        return this;
    }
    public java.util.List<String> getCallableTime() {
        return this.callableTime;
    }

    public CreateAiCallTaskRequest setLineEncoding(String lineEncoding) {
        this.lineEncoding = lineEncoding;
        return this;
    }
    public String getLineEncoding() {
        return this.lineEncoding;
    }

    public CreateAiCallTaskRequest setLinePhoneNum(String linePhoneNum) {
        this.linePhoneNum = linePhoneNum;
        return this;
    }
    public String getLinePhoneNum() {
        return this.linePhoneNum;
    }

    public CreateAiCallTaskRequest setMissCallRetry(Boolean missCallRetry) {
        this.missCallRetry = missCallRetry;
        return this;
    }
    public Boolean getMissCallRetry() {
        return this.missCallRetry;
    }

    public CreateAiCallTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAiCallTaskRequest setPhoneType(Long phoneType) {
        this.phoneType = phoneType;
        return this;
    }
    public Long getPhoneType() {
        return this.phoneType;
    }

    public CreateAiCallTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAiCallTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAiCallTaskRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateAiCallTaskRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public CreateAiCallTaskRequest setTaskCps(Long taskCps) {
        this.taskCps = taskCps;
        return this;
    }
    public Long getTaskCps() {
        return this.taskCps;
    }

    public CreateAiCallTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateAiCallTaskRequest setTaskStartTime(Long taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }
    public Long getTaskStartTime() {
        return this.taskStartTime;
    }

    public CreateAiCallTaskRequest setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
