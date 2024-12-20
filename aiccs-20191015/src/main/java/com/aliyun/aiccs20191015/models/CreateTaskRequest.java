// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("CallString")
    public String callString;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("CallStringType")
    public String callStringType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571<strong><strong>5678,0571</strong></strong>5679</p>
     */
    @NameInMap("Caller")
    public String caller;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RetryCount")
    public Integer retryCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetryFlag")
    public Integer retryFlag;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <strong>example:</strong>
     * <p>200010,200011</p>
     */
    @NameInMap("RetryStatusCode")
    public String retryStatusCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("RobotId")
    public String robotId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SeatCount")
    public String seatCount;

    @NameInMap("StartNow")
    public Boolean startNow;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkDay")
    public String workDay;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10:00-12:00,13:00-14:00</p>
     */
    @NameInMap("WorkTimeList")
    public String workTimeList;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setCallString(String callString) {
        this.callString = callString;
        return this;
    }
    public String getCallString() {
        return this.callString;
    }

    public CreateTaskRequest setCallStringType(String callStringType) {
        this.callStringType = callStringType;
        return this;
    }
    public String getCallStringType() {
        return this.callStringType;
    }

    public CreateTaskRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public CreateTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTaskRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateTaskRequest setRetryFlag(Integer retryFlag) {
        this.retryFlag = retryFlag;
        return this;
    }
    public Integer getRetryFlag() {
        return this.retryFlag;
    }

    public CreateTaskRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateTaskRequest setRetryStatusCode(String retryStatusCode) {
        this.retryStatusCode = retryStatusCode;
        return this;
    }
    public String getRetryStatusCode() {
        return this.retryStatusCode;
    }

    public CreateTaskRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public CreateTaskRequest setSeatCount(String seatCount) {
        this.seatCount = seatCount;
        return this;
    }
    public String getSeatCount() {
        return this.seatCount;
    }

    public CreateTaskRequest setStartNow(Boolean startNow) {
        this.startNow = startNow;
        return this;
    }
    public Boolean getStartNow() {
        return this.startNow;
    }

    public CreateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateTaskRequest setWorkDay(String workDay) {
        this.workDay = workDay;
        return this;
    }
    public String getWorkDay() {
        return this.workDay;
    }

    public CreateTaskRequest setWorkTimeList(String workTimeList) {
        this.workTimeList = workTimeList;
        return this;
    }
    public String getWorkTimeList() {
        return this.workTimeList;
    }

}
