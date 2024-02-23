// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallListRequest extends TeaModel {
    /**
     * <p>The call result. Valid values:</p>
     * <br>
     * <p>*   **200002**: The line is busy.</p>
     * <p>*   **200005**: The called party cannot be connected.</p>
     * <p>*   **200010**: The phone of the called party is powered off.</p>
     * <p>*   **200011**: The called party is out of service.</p>
     * <p>*   **200012**: The call is lost.</p>
     */
    @NameInMap("CallResult")
    public String callResult;

    /**
     * <p>The called number.</p>
     */
    @NameInMap("Called")
    public String called;

    /**
     * <p>The minimum number of conversation rounds in the call.</p>
     */
    @NameInMap("DialogCountFrom")
    public String dialogCountFrom;

    /**
     * <p>The maximum number of conversation rounds in the call.</p>
     */
    @NameInMap("DialogCountTo")
    public String dialogCountTo;

    /**
     * <p>The minimum call duration.</p>
     */
    @NameInMap("DurationFrom")
    public String durationFrom;

    /**
     * <p>The maximum call duration.</p>
     */
    @NameInMap("DurationTo")
    public String durationTo;

    /**
     * <p>The party who hangs up. Valid values:</p>
     * <br>
     * <p>*   **0**: the called party.</p>
     * <p>*   **1**: the robot.</p>
     */
    @NameInMap("HangupDirection")
    public String hangupDirection;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The unique ID of the robocall task. You can call the [CreateRobotTask](~~393531~~) operation to obtain the task ID.</p>
     */
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
