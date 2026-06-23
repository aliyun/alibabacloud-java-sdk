// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomFieldRequest extends TeaModel {
    /**
     * <p>The default value of the field.
     * If configuration items exist for the type, the default value must be one of the configuration items and must be in the enabled state. Maximum length: 1024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The field description.
     * Maximum length: 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Field test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to encrypt the field.
     * If this parameter is set to true, the data value is encrypted at the storage layer.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The entity to which the field belongs. Valid values:</p>
     * <ul>
     * <li>user: account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The field value configuration items.</p>
     */
    @NameInMap("FieldDataConfig")
    public CreateCustomFieldRequestFieldDataConfig fieldDataConfig;

    /**
     * <p>The data type of the field. Valid values:</p>
     * <ul>
     * <li>string: string.</li>
     * <li>number: number. Maximum length: 32 characters. Positive integers and decimals are supported.</li>
     * <li>boolean: Boolean.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("FieldDataType")
    public String fieldDataType;

    /**
     * <p>The field display name.
     * Maximum length: 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("FieldDisplayName")
    public String fieldDisplayName;

    /**
     * <p>The field display type. Valid values:</p>
     * <ul>
     * <li>input: text input box. Supported data types: string and number.</li>
     * <li>select: drop-down list. Supported data types: string and boolean.</li>
     * <li>checkbox: multi-select box. Supported data types: string.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>input</p>
     */
    @NameInMap("FieldDisplayType")
    public String fieldDisplayType;

    /**
     * <p>The field identifier.
     * Maximum length: 40 characters. The value can contain lowercase letters and underscores, and cannot start with an underscore.</p>
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
     * <p>Specifies whether the field is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Required")
    public Boolean required;

    /**
     * <p>Specifies whether the field value is unique.
     * If this parameter is set to true, the field value must be unique within the corresponding entity type and cannot be duplicated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Unique")
    public Boolean unique;

    /**
     * <p>The field permission on the portal side. Valid values:</p>
     * <ul>
     * <li>hide: Not visible on the portal side.</li>
     * <li>read_only: Visible on the portal side but cannot be edited or updated.</li>
     * <li>read_write: Visible and editable on the portal side.</li>
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
         * <p>The display name of the configuration item.
         * Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The status of the configuration item. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * <p>If a configuration item is disabled, it cannot be used when creating or updating entity field values.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The display value of the configuration item.
         * Maximum length: 64 characters.</p>
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
         * <p>The list of field configuration items. Maximum number of items: 100.</p>
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
