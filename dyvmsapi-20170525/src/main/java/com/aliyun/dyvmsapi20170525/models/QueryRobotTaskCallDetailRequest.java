// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallDetailRequest extends TeaModel {
    /**
     * <p>The called number.</p>
     */
    @NameInMap("Callee")
    public String callee;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The timestamp of the time at which the call details you want to query.</p>
     */
    @NameInMap("QueryDate")
    public Long queryDate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The unique ID of the robocall task. You can call the [CreateRobotTask](~~393531~~) operation to obtain the task ID.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static QueryRobotTaskCallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallDetailRequest self = new QueryRobotTaskCallDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallDetailRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public QueryRobotTaskCallDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRobotTaskCallDetailRequest setQueryDate(Long queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public Long getQueryDate() {
        return this.queryDate;
    }

    public QueryRobotTaskCallDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRobotTaskCallDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryRobotTaskCallDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
