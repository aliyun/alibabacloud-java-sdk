// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiCallTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121223123123****</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallDay")
    public java.util.List<String> callDay;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("CallRetryInterval")
    public Long callRetryInterval;

    @NameInMap("CallRetryReason")
    public java.util.List<String> callRetryReason;

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
    public java.util.List<String> callTime;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MissCallRetry")
    public Boolean missCallRetry;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>54</p>
     */
    @NameInMap("PhoneType")
    public Long phoneType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("Source")
    public Long source;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCHEDULE</p>
     */
    @NameInMap("StartType")
    public String startType;

    /**
     * <strong>example:</strong>
     * <p>75</p>
     */
    @NameInMap("TaskCps")
    public Long taskCps;

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

    public CreateAiCallTaskRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateAiCallTaskRequest setCallDay(java.util.List<String> callDay) {
        this.callDay = callDay;
        return this;
    }
    public java.util.List<String> getCallDay() {
        return this.callDay;
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
