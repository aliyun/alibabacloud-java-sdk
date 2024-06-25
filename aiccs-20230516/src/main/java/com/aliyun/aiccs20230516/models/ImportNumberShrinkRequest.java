// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Customers")
    public String customersShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailReturn")
    public Long failReturn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ImportNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberShrinkRequest self = new ImportNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportNumberShrinkRequest setCustomersShrink(String customersShrink) {
        this.customersShrink = customersShrink;
        return this;
    }
    public String getCustomersShrink() {
        return this.customersShrink;
    }

    public ImportNumberShrinkRequest setFailReturn(Long failReturn) {
        this.failReturn = failReturn;
        return this;
    }
    public Long getFailReturn() {
        return this.failReturn;
    }

    public ImportNumberShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ImportNumberShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportNumberShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportNumberShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportNumberShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
