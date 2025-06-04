// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiCallTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallDay")
    public java.util.List<String> callDay;

    /**
     * <strong>example:</strong>
     * <p>25</p>
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

    public static UpdateAiCallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiCallTaskRequest self = new UpdateAiCallTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiCallTaskRequest setCallDay(java.util.List<String> callDay) {
        this.callDay = callDay;
        return this;
    }
    public java.util.List<String> getCallDay() {
        return this.callDay;
    }

    public UpdateAiCallTaskRequest setCallRetryInterval(Long callRetryInterval) {
        this.callRetryInterval = callRetryInterval;
        return this;
    }
    public Long getCallRetryInterval() {
        return this.callRetryInterval;
    }

    public UpdateAiCallTaskRequest setCallRetryReason(java.util.List<String> callRetryReason) {
        this.callRetryReason = callRetryReason;
        return this;
    }
    public java.util.List<String> getCallRetryReason() {
        return this.callRetryReason;
    }

    public UpdateAiCallTaskRequest setCallRetryTimes(Long callRetryTimes) {
        this.callRetryTimes = callRetryTimes;
        return this;
    }
    public Long getCallRetryTimes() {
        return this.callRetryTimes;
    }

    public UpdateAiCallTaskRequest setCallTime(java.util.List<String> callTime) {
        this.callTime = callTime;
        return this;
    }
    public java.util.List<String> getCallTime() {
        return this.callTime;
    }

    public UpdateAiCallTaskRequest setMissCallRetry(Boolean missCallRetry) {
        this.missCallRetry = missCallRetry;
        return this;
    }
    public Boolean getMissCallRetry() {
        return this.missCallRetry;
    }

    public UpdateAiCallTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAiCallTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAiCallTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAiCallTaskRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public UpdateAiCallTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateAiCallTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public UpdateAiCallTaskRequest setTaskStartTime(Long taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }
    public Long getTaskStartTime() {
        return this.taskStartTime;
    }

    public UpdateAiCallTaskRequest setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
