// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of items per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
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
     * <p>The robot name, which is the script name. You can view the names of scripts that have passed Review in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>机器人</p>
     */
    @NameInMap("RobotName")
    public String robotName;

    /**
     * <p>Job Status. Valid values:</p>
     * <ul>
     * <li><strong>INIT</strong>: Not started.</li>
     * <li><strong>RELEASE</strong>: Parsing.</li>
     * <li><strong>RUNNING</strong>: Executing.</li>
     * <li><strong>STOP</strong>: Paused manually.</li>
     * <li><strong>SYSTEM_STOP</strong>: Paused by the system.</li>
     * <li><strong>READY</strong>: Pending execution.</li>
     * <li><strong>CANCEL</strong>: Stopped manually.</li>
     * <li><strong>SYSTEM_CANCEL</strong>: Stopped by the system.</li>
     * <li><strong>DONE</strong>: Completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STOP</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The unique job ID of the robot calling job. You can view it in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or obtain it by using the <a href="https://help.aliyun.com/document_detail/223556.html">CreateTask</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The job name. You can view the names of created jobs in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>任务测试</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ListTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskRequest self = new ListTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTaskRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTaskRequest setRobotName(String robotName) {
        this.robotName = robotName;
        return this;
    }
    public String getRobotName() {
        return this.robotName;
    }

    public ListTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ListTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
