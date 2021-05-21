// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("RobotId")
    public String robotId;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("CallString")
    public String callString;

    @NameInMap("CallStringType")
    public String callStringType;

    @NameInMap("RetryFlag")
    public Integer retryFlag;

    @NameInMap("RetryCount")
    public Integer retryCount;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("RetryStatusCode")
    public String retryStatusCode;

    @NameInMap("StartNow")
    public Boolean startNow;

    @NameInMap("WorkTimeList")
    public String workTimeList;

    @NameInMap("WorkDay")
    public String workDay;

    @NameInMap("SeatCount")
    public String seatCount;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("BizType")
    public String bizType;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
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

    public CreateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateTaskRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public CreateTaskRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
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

    public CreateTaskRequest setRetryFlag(Integer retryFlag) {
        this.retryFlag = retryFlag;
        return this;
    }
    public Integer getRetryFlag() {
        return this.retryFlag;
    }

    public CreateTaskRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
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

    public CreateTaskRequest setStartNow(Boolean startNow) {
        this.startNow = startNow;
        return this;
    }
    public Boolean getStartNow() {
        return this.startNow;
    }

    public CreateTaskRequest setWorkTimeList(String workTimeList) {
        this.workTimeList = workTimeList;
        return this;
    }
    public String getWorkTimeList() {
        return this.workTimeList;
    }

    public CreateTaskRequest setWorkDay(String workDay) {
        this.workDay = workDay;
        return this;
    }
    public String getWorkDay() {
        return this.workDay;
    }

    public CreateTaskRequest setSeatCount(String seatCount) {
        this.seatCount = seatCount;
        return this;
    }
    public String getSeatCount() {
        return this.seatCount;
    }

    public CreateTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
