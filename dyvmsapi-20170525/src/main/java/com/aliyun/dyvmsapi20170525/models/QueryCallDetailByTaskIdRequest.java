// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByTaskIdRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("QueryDate")
    public Long queryDate;

    @NameInMap("Callee")
    public String callee;

    public static QueryCallDetailByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByTaskIdRequest self = new QueryCallDetailByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByTaskIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public QueryCallDetailByTaskIdRequest setQueryDate(Long queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public Long getQueryDate() {
        return this.queryDate;
    }

    public QueryCallDetailByTaskIdRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

}
