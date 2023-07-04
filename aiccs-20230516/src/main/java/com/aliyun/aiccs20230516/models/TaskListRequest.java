// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskListRequest extends TeaModel {
    /**
     * <p>创建时间</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>最后外呼时间</p>
     */
    @NameInMap("LastCallTime")
    public String lastCallTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>任务ID</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskListRequest self = new TaskListRequest();
        return TeaModel.build(map, self);
    }

    public TaskListRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TaskListRequest setLastCallTime(String lastCallTime) {
        this.lastCallTime = lastCallTime;
        return this;
    }
    public String getLastCallTime() {
        return this.lastCallTime;
    }

    public TaskListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TaskListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TaskListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TaskListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
