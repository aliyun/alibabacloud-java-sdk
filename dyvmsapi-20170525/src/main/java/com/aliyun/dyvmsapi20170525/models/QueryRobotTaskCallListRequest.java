// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallListRequest extends TeaModel {
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

    public static QueryRobotTaskCallListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallListRequest self = new QueryRobotTaskCallListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallListRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public QueryRobotTaskCallListRequest setCalled(String called) {
        this.called = called;
        return this;
    }
    public String getCalled() {
        return this.called;
    }

    public QueryRobotTaskCallListRequest setDialogCountFrom(String dialogCountFrom) {
        this.dialogCountFrom = dialogCountFrom;
        return this;
    }
    public String getDialogCountFrom() {
        return this.dialogCountFrom;
    }

    public QueryRobotTaskCallListRequest setDialogCountTo(String dialogCountTo) {
        this.dialogCountTo = dialogCountTo;
        return this;
    }
    public String getDialogCountTo() {
        return this.dialogCountTo;
    }

    public QueryRobotTaskCallListRequest setDurationFrom(String durationFrom) {
        this.durationFrom = durationFrom;
        return this;
    }
    public String getDurationFrom() {
        return this.durationFrom;
    }

    public QueryRobotTaskCallListRequest setDurationTo(String durationTo) {
        this.durationTo = durationTo;
        return this;
    }
    public String getDurationTo() {
        return this.durationTo;
    }

    public QueryRobotTaskCallListRequest setHangupDirection(String hangupDirection) {
        this.hangupDirection = hangupDirection;
        return this;
    }
    public String getHangupDirection() {
        return this.hangupDirection;
    }

    public QueryRobotTaskCallListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRobotTaskCallListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRobotTaskCallListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRobotTaskCallListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRobotTaskCallListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryRobotTaskCallListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
