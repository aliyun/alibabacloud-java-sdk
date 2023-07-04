// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class UpdateTaskCustomerShrinkRequest extends TeaModel {
    /**
     * <p>外呼客户</p>
     */
    @NameInMap("Customers")
    public String customersShrink;

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

    public static UpdateTaskCustomerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskCustomerShrinkRequest self = new UpdateTaskCustomerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskCustomerShrinkRequest setCustomersShrink(String customersShrink) {
        this.customersShrink = customersShrink;
        return this;
    }
    public String getCustomersShrink() {
        return this.customersShrink;
    }

    public UpdateTaskCustomerShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTaskCustomerShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTaskCustomerShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTaskCustomerShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
