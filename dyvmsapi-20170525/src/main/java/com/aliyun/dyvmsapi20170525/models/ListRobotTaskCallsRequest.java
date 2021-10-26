// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListRobotTaskCallsRequest extends TeaModel {
    @NameInMap("CallResult")
    public String callResult;

    @NameInMap("Called")
    public String called;

    @NameInMap("DialogCountFrom")
    public String dialogCountFrom;

    @NameInMap("DialogCountTo")
    public String dialogCountTo;

    @NameInMap("DurationFrom")
    public String durationFrom;

    @NameInMap("DurationTo")
    public String durationTo;

    @NameInMap("HangupDirection")
    public String hangupDirection;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskId")
    public String taskId;

    public static ListRobotTaskCallsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRobotTaskCallsRequest self = new ListRobotTaskCallsRequest();
        return TeaModel.build(map, self);
    }

    public ListRobotTaskCallsRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public ListRobotTaskCallsRequest setCalled(String called) {
        this.called = called;
        return this;
    }
    public String getCalled() {
        return this.called;
    }

    public ListRobotTaskCallsRequest setDialogCountFrom(String dialogCountFrom) {
        this.dialogCountFrom = dialogCountFrom;
        return this;
    }
    public String getDialogCountFrom() {
        return this.dialogCountFrom;
    }

    public ListRobotTaskCallsRequest setDialogCountTo(String dialogCountTo) {
        this.dialogCountTo = dialogCountTo;
        return this;
    }
    public String getDialogCountTo() {
        return this.dialogCountTo;
    }

    public ListRobotTaskCallsRequest setDurationFrom(String durationFrom) {
        this.durationFrom = durationFrom;
        return this;
    }
    public String getDurationFrom() {
        return this.durationFrom;
    }

    public ListRobotTaskCallsRequest setDurationTo(String durationTo) {
        this.durationTo = durationTo;
        return this;
    }
    public String getDurationTo() {
        return this.durationTo;
    }

    public ListRobotTaskCallsRequest setHangupDirection(String hangupDirection) {
        this.hangupDirection = hangupDirection;
        return this;
    }
    public String getHangupDirection() {
        return this.hangupDirection;
    }

    public ListRobotTaskCallsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListRobotTaskCallsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRobotTaskCallsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRobotTaskCallsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListRobotTaskCallsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListRobotTaskCallsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
