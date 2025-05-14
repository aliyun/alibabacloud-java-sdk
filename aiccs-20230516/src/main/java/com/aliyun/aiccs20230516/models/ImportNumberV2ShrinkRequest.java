// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberV2ShrinkRequest extends TeaModel {
    @NameInMap("Customers")
    public String customersShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailReturn")
    public Long failReturn;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ImportNumberV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberV2ShrinkRequest self = new ImportNumberV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportNumberV2ShrinkRequest setCustomersShrink(String customersShrink) {
        this.customersShrink = customersShrink;
        return this;
    }
    public String getCustomersShrink() {
        return this.customersShrink;
    }

    public ImportNumberV2ShrinkRequest setFailReturn(Long failReturn) {
        this.failReturn = failReturn;
        return this;
    }
    public Long getFailReturn() {
        return this.failReturn;
    }

    public ImportNumberV2ShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ImportNumberV2ShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportNumberV2ShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportNumberV2ShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportNumberV2ShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
