// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportOneTaskPhoneNumberShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <p>The extension number.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Extension")
    public String extension;

    /**
     * <p>The external serial number. We recommend that you use a unique ID. The value cannot exceed 128 characters.</p>
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
     * <p>The variable list in Map format.</p>
     * <blockquote>
     * <p>Variable format for engine-based voice call tasks:</p>
     * <ul>
     * <li>{&quot;startWordParam.VariableKey1&quot;:&quot;VariableValue1&quot;,&quot;promptParam.VariableKey2&quot;:&quot;VariableValue2&quot;,&quot;bizParam.VariableKey3&quot;:&quot;VariableValue3&quot;}</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VariableKey1&quot;:&quot;VariableValue1&quot;,&quot;VariableKey2&quot;:&quot;VariableValue2&quot;}
     * For example values of engine-based voice call tasks, refer to the description on the left</p>
     */
    @NameInMap("Variables")
    public String variablesShrink;

    public static ImportOneTaskPhoneNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportOneTaskPhoneNumberShrinkRequest self = new ImportOneTaskPhoneNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportOneTaskPhoneNumberShrinkRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ImportOneTaskPhoneNumberShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

}
