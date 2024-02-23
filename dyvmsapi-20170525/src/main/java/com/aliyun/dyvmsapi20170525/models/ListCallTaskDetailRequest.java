// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskDetailRequest extends TeaModel {
    /**
     * <p>The called number.</p>
     */
    @NameInMap("CalledNum")
    public String calledNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task state. Valid values:</p>
     * <br>
     * <p>*   **SUCCESS**: The task is successful.</p>
     * <p>*   **FAIL**: The task fails.</p>
     * <p>*   **INIT**: The task is not started.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ListCallTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskDetailRequest self = new ListCallTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListCallTaskDetailRequest setCalledNum(String calledNum) {
        this.calledNum = calledNum;
        return this;
    }
    public String getCalledNum() {
        return this.calledNum;
    }

    public ListCallTaskDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCallTaskDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallTaskDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallTaskDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCallTaskDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListCallTaskDetailRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCallTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
