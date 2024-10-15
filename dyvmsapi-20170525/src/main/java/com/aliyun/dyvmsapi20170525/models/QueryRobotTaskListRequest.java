// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task state. Valid values:</p>
     * <ul>
     * <li><strong>INIT</strong>: The task is not started.</li>
     * <li><strong>READY</strong>: The task is ready to start.</li>
     * <li><strong>DISPATCH</strong>: The task is being parsed.</li>
     * <li><strong>EXCUTING</strong>: The task is being executed.</li>
     * <li><strong>MANUAL_STOP</strong>: The task is manually suspended.</li>
     * <li><strong>SYSTEM_STOP</strong>: The task is suspended by the system.</li>
     * <li><strong>ARREARS_STOP</strong>: The task is suspended due to overdue payments.</li>
     * <li><strong>CANCEL</strong>: The task is manually canceled.</li>
     * <li><strong>SYSTEM_CANCEL</strong>: The task is canceled by the system.</li>
     * <li><strong>FINISH</strong>: The task is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EXCUTING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Template</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The date when the task is created, in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-14</p>
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
