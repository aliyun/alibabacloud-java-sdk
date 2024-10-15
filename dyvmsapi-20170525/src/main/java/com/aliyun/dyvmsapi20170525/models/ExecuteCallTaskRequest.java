// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ExecuteCallTaskRequest extends TeaModel {
    /**
     * <p>The time when the call task is executed, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <blockquote>
     * <p>You can leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-03-09 00:00:00</p>
     */
    @NameInMap("FireTime")
    public String fireTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task state. Valid values:</p>
     * <ul>
     * <li><strong>RUNNING</strong></li>
     * <li><strong>STOP</strong></li>
     * <li><strong>CANCEL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID. You can call the <a href="~~CreateCallTask~~">CreateCallTask</a> operation to obtain the task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2256****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ExecuteCallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCallTaskRequest self = new ExecuteCallTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteCallTaskRequest setFireTime(String fireTime) {
        this.fireTime = fireTime;
        return this;
    }
    public String getFireTime() {
        return this.fireTime;
    }

    public ExecuteCallTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExecuteCallTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExecuteCallTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ExecuteCallTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecuteCallTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
