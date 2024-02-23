// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskListRequest extends TeaModel {
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
     * <p>The task state. Valid values:</p>
     * <br>
     * <p>*   **INIT**: The task is not started.</p>
     * <p>*   **READY**: The task is ready to start.</p>
     * <p>*   **DISPATCH**: The task is being parsed.</p>
     * <p>*   **EXCUTING**: The task is being executed.</p>
     * <p>*   **MANUAL_STOP**: The task is manually suspended.</p>
     * <p>*   **SYSTEM_STOP**: The task is suspended by the system.</p>
     * <p>*   **ARREARS_STOP**: The task is suspended due to overdue payments.</p>
     * <p>*   **CANCEL**: The task is manually canceled.</p>
     * <p>*   **SYSTEM_CANCEL**: The task is canceled by the system.</p>
     * <p>*   **FINISH**: The task is complete.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task name.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The date when the task is created, in the yyyy-MM-dd format.</p>
     */
    @NameInMap("Time")
    public String time;

    public static QueryRobotTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskListRequest self = new QueryRobotTaskListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRobotTaskListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRobotTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRobotTaskListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRobotTaskListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryRobotTaskListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRobotTaskListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public QueryRobotTaskListRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
