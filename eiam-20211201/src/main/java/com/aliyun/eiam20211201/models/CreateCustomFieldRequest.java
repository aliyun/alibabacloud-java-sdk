// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomFieldRequest extends TeaModel {
    /**
     * <p>The default value of the field. If the field has configuration items, the default value must be one of the enabled configuration items. The default value can be up to 1024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The description of the field. The description can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Field test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether to encrypt the field value. If you set this parameter to true, the system encrypts the data value before storing it.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The entity to which the field belongs. Valid value:</p>
     * <ul>
     * <li>user: an account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The configuration items of the field value.</p>
     */
    @NameInMap("FieldDataConfig")
    public CreateCustomFieldRequestFieldDataConfig fieldDataConfig;

    /**
     * <p>The data type of the field. Valid values:</p>
     * <ul>
     * <li><p>string: a string.</p>
     * </li>
     * <li><p>number: a number. The number can be up to 32 digits in length and can be a positive integer or a decimal.</p>
     * </li>
     * <li><p>boolean: a Boolean value.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("FieldDataType")
    public String fieldDataType;

    /**
     * <p>The display name of the field. The display name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("FieldDisplayName")
    public String fieldDisplayName;

    /**
     * <p>The display type of the field. Valid values:</p>
     * <ul>
     * <li><p>input: a text box. This display type supports the string and number data types.</p>
     * </li>
     * <li><p>select: a drop-down list. This display type supports the string and Boolean data types.</p>
     * </li>
     * <li><p>checkbox: a check box. This display type supports the string data type.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>input</p>
     */
    @NameInMap("FieldDisplayType")
    public String fieldDisplayType;

    /**
     * <p>The name of the field. The name can be up to 40 characters in length and can contain lowercase letters and underscores (<em>). It cannot start with an underscore (</em>).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>field_001</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the field is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Required")
    public Boolean required;

    /**
     * <p>Indicates whether the field value is unique. If you set this parameter to true, the value of this field must be unique for the specified entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Unique")
    public Boolean unique;

    /**
     * <p>The permission on the field in the portal. Valid values:</p>
     * <ul>
     * <li><p>hide: The field is not visible in the portal.</p>
     * </li>
     * <li><p>read_only: The field is visible but cannot be modified in the portal.</p>
     * </li>
     * <li><p>read_write: The field is visible and can be modified in the portal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UserPermission")
    public String userPermission;

    public static CreateCustomFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomFieldRequest self = new CreateCustomFieldRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomFieldRequest setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public CreateCustomFieldRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomFieldRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateCustomFieldRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateCustomFieldRequest setFieldDataConfig(CreateCustomFieldRequestFieldDataConfig fieldDataConfig) {
        this.fieldDataConfig = fieldDataConfig;
        return this;
    }
    public CreateCustomFieldRequestFieldDataConfig getFieldDataConfig() {
        return this.fieldDataConfig;
    }

    public CreateCustomFieldRequest setFieldDataType(String fieldDataType) {
        this.fieldDataType = fieldDataType;
        return this;
    }
    public String getFieldDataType() {
        return this.fieldDataType;
    }

    public CreateCustomFieldRequest setFieldDisplayName(String fieldDisplayName) {
        this.fieldDisplayName = fieldDisplayName;
        return this;
    }
    public String getFieldDisplayName() {
        return this.fieldDisplayName;
    }

    public CreateCustomFieldRequest setFieldDisplayType(String fieldDisplayType) {
        this.fieldDisplayType = fieldDisplayType;
        return this;
    }
    public String getFieldDisplayType() {
        return this.fieldDisplayType;
    }

    public CreateCustomFieldRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateCustomFieldRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCustomFieldRequest setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public CreateCustomFieldRequest setUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }
    public Boolean getUnique() {
        return this.unique;
    }

    public CreateCustomFieldRequest setUserPermission(String userPermission) {
        this.userPermission = userPermission;
        return this;
    }
    public String getUserPermission() {
        return this.userPermission;
    }

    public static class CreateCustomFieldRequestFieldDataConfigItems extends TeaModel {
        /**
         * <p>The display name of the configuration item. The display name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The status of the configuration item. Valid values:</p>
         * <ul>
         * <li><p>enabled: The configuration item is enabled.</p>
         * </li>
         * <li><p>disabled: The configuration item is disabled.</p>
         * </li>
         * </ul>
         * <p>If a configuration item is disabled, it is unavailable when you create or update the field value for an entity.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The value of the configuration item. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCustomFieldRequestFieldDataConfigItems build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomFieldRequestFieldDataConfigItems self = new CreateCustomFieldRequestFieldDataConfigItems();
            return TeaModel.build(map, self);
        }

        public CreateCustomFieldRequestFieldDataConfigItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateCustomFieldRequestFieldDataConfigItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCustomFieldRequestFieldDataConfigItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCustomFieldRequestFieldDataConfig extends TeaModel {
        /**
         * <p>A list of field configuration items. The list can contain up to 100 items.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Items")
        public java.util.List<CreateCustomFieldRequestFieldDataConfigItems> items;

        public static CreateCustomFieldRequestFieldDataConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomFieldRequestFieldDataConfig self = new CreateCustomFieldRequestFieldDataConfig();
            return TeaModel.build(map, self);
        }

        public CreateCustomFieldRequestFieldDataConfig setItems(java.util.List<CreateCustomFieldRequestFieldDataConfigItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CreateCustomFieldRequestFieldDataConfigItems> getItems() {
            return this.items;
        }

    }

}
