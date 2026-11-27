// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportOneTaskPhoneNumberRequest extends TeaModel {
    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li>0: no encryption</li>
     * <li>1: MD5</li>
     * <li>2: SHA256</li>
     * <li>3: SM3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <p>The extension number.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValueSampleValueSampleValue</p>
     */
    @NameInMap("Extension")
    public String extension;

    /**
     * <p>The external serial number. Use a unique ID. The value cannot exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>94ba739b-xxxx-ef91-335d-4be006c34899</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The called phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>180******</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231212****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The list of variables in map format.</p>
     * <blockquote>
     * <p>Variable format for engine call tasks</p>
     * <ul>
     * <li>{&quot;startWordParam.variableKey1&quot;:&quot;variableValue1&quot;,&quot;promptParam.variableKey2&quot;:&quot;variableValue2&quot;,&quot;bizParam.variableKey3&quot;:&quot;variableValue3&quot;}</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;variableKey1&quot;:&quot;variableValue1&quot;,&quot;variableKey2&quot;:&quot;variableValue2&quot;}</p>
     */
    @NameInMap("Variables")
    public java.util.Map<String, ?> variables;

    public static ImportOneTaskPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportOneTaskPhoneNumberRequest self = new ImportOneTaskPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ImportOneTaskPhoneNumberRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public ImportOneTaskPhoneNumberRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public ImportOneTaskPhoneNumberRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ImportOneTaskPhoneNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportOneTaskPhoneNumberRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ImportOneTaskPhoneNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportOneTaskPhoneNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportOneTaskPhoneNumberRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ImportOneTaskPhoneNumberRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

}
