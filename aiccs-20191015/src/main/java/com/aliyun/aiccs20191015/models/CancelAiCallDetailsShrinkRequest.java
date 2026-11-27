// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsShrinkRequest extends TeaModel {
    /**
     * <p>The batch ID. This is the batch ID returned when callee data is imported. You can view the batch ID on the <strong>Call task management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution records</strong> page, or use the batch ID returned when you call the <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operation to import callee data. If the DetailIdList parameter is specified, this parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>4253331213*****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The list of task detail IDs. If this parameter is specified, it takes precedence, and the BatchId and PhoneNumbers parameters are invalid.</p>
     */
    @NameInMap("DetailIdList")
    public String detailIdListShrink;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li>0: No encryption.</li>
     * <li>1: MD5.</li>
     * <li>2: SHA256.</li>
     * <li>3: SM3.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of phone numbers. To use this parameter, you must specify the BatchId parameter. Otherwise, this parameter is considered invalid.</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbersShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task ID. You can view the task ID on the <strong>Call task management</strong> page or obtain the task ID by calling the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation.</p>
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
