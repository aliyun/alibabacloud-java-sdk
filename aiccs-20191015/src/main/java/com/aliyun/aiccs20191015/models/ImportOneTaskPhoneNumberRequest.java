// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportOneTaskPhoneNumberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <p>The external ID. We recommend that you use a unique ID to ensure idempotency. The value cannot exceed 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>94ba739b-xxxx-ef91-335d-4be006c34899</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number of the callee.</p>
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
     * <p>A list of variables in a map.</p>
     * <blockquote>
     * <p>The format of variables for an engine-based call task is as follows:</p>
     * <ul>
     * <li>{&quot;startWordParam.variable_key1&quot;:&quot;variable_value1&quot;,&quot;promptParam.variable_key2&quot;:&quot;variable_value2&quot;,&quot;bizParam.variable_key3&quot;:&quot;variable_value3&quot;}</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;变量key1&quot;:&quot;变量值1&quot;,&quot;变量key2&quot;:&quot;变量值2&quot;}
     * 引擎呼叫任务示例值请看左侧描述</p>
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
