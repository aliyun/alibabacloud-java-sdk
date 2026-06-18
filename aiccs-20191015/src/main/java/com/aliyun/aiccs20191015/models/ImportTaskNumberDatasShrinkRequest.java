// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportTaskNumberDatasShrinkRequest extends TeaModel {
    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li><p>EXCEL</p>
     * </li>
     * <li><p>JSON</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>API calls currently support only the JSON data type.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <p>The OSS file path. This parameter is optional.</p>
     * <blockquote>
     * <p>Importing data by specifying an OSS file path is not available because API calls currently support only the JSON data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123dsdfsdfsdf.xlsx</p>
     */
    @NameInMap("OssFileName")
    public String ossFileName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>If <code>DataType</code> is set to <code>JSON</code>, you must use this parameter to upload the data. You can import up to 1,000 records per request.</p>
     */
    @NameInMap("PhoneNumberList")
    public String phoneNumberListShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the call task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>119181071278******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ImportTaskNumberDatasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTaskNumberDatasShrinkRequest self = new ImportTaskNumberDatasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportTaskNumberDatasShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ImportTaskNumberDatasShrinkRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public ImportTaskNumberDatasShrinkRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public ImportTaskNumberDatasShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportTaskNumberDatasShrinkRequest setPhoneNumberListShrink(String phoneNumberListShrink) {
        this.phoneNumberListShrink = phoneNumberListShrink;
        return this;
    }
    public String getPhoneNumberListShrink() {
        return this.phoneNumberListShrink;
    }

    public ImportTaskNumberDatasShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportTaskNumberDatasShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportTaskNumberDatasShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
