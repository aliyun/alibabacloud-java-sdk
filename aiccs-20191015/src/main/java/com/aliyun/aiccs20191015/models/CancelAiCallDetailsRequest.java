// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsRequest extends TeaModel {
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
    public java.util.List<String> detailIdList;

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
    public java.util.List<String> phoneNumbers;

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
