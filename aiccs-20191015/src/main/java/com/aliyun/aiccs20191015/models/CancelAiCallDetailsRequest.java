// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsRequest extends TeaModel {
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
    public java.util.List<String> detailIdList;

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
    public java.util.List<String> phoneNumbers;

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

    public static CancelAiCallDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAiCallDetailsRequest self = new CancelAiCallDetailsRequest();
        return TeaModel.build(map, self);
    }

    public CancelAiCallDetailsRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CancelAiCallDetailsRequest setDetailIdList(java.util.List<String> detailIdList) {
        this.detailIdList = detailIdList;
        return this;
    }
    public java.util.List<String> getDetailIdList() {
        return this.detailIdList;
    }

    public CancelAiCallDetailsRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public CancelAiCallDetailsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelAiCallDetailsRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public CancelAiCallDetailsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelAiCallDetailsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CancelAiCallDetailsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
