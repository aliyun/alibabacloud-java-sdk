// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4253331213*****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("DetailIdList")
    public String detailIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbersShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1223123123****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelAiCallDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAiCallDetailsShrinkRequest self = new CancelAiCallDetailsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelAiCallDetailsShrinkRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CancelAiCallDetailsShrinkRequest setDetailIdListShrink(String detailIdListShrink) {
        this.detailIdListShrink = detailIdListShrink;
        return this;
    }
    public String getDetailIdListShrink() {
        return this.detailIdListShrink;
    }

    public CancelAiCallDetailsShrinkRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public CancelAiCallDetailsShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelAiCallDetailsShrinkRequest setPhoneNumbersShrink(String phoneNumbersShrink) {
        this.phoneNumbersShrink = phoneNumbersShrink;
        return this;
    }
    public String getPhoneNumbersShrink() {
        return this.phoneNumbersShrink;
    }

    public CancelAiCallDetailsShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelAiCallDetailsShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CancelAiCallDetailsShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
