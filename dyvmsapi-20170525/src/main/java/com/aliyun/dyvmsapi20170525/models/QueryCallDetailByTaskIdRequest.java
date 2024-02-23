// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByTaskIdRequest extends TeaModel {
    /**
     * <p>The called number. You can view the outbound call records of only one called number.</p>
     */
    @NameInMap("Callee")
    public String callee;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time of the outbound robocall task. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("QueryDate")
    public Long queryDate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The unique ID of the outbound robocall task. The task ID is returned after the outbound robocall task is successfully delivered. You can view the task ID on the [Task Management](https://dyvms.console.aliyun.com/job/list) page of the Voice Messaging Service console, or call the **BatchRobotSmartCall** operation to obtain the **task ID**.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryCallDetailByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByTaskIdRequest self = new QueryCallDetailByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByTaskIdRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public QueryCallDetailByTaskIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCallDetailByTaskIdRequest setQueryDate(Long queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public Long getQueryDate() {
        return this.queryDate;
    }

    public QueryCallDetailByTaskIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCallDetailByTaskIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCallDetailByTaskIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
