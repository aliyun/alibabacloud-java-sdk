// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsShrinkRequest extends TeaModel {
    /**
     * <p>The batch ID. This ID is returned when you import callee data. You can find the task batch ID on the <strong>Call Task Management</strong>&gt;<strong>Details</strong>&gt;<strong>Execution Record</strong> page, or use the import batch ID that is returned by the <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> API operation. If DetailIdList is specified, this parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>4253331213*****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>A list of detail IDs. If you specify this parameter, <code>BatchId</code> and <code>PhoneNumbers</code> are ignored.</p>
     */
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

    /**
     * <p>A list of phone numbers. This parameter takes effect only when <code>BatchId</code> is also specified.</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbersShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task ID. You can view the task ID on the <strong>Call Task Management</strong> page or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138************</p>
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
