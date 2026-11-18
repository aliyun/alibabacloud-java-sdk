// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomFieldRequest extends TeaModel {
    /**
     * <p>The default value of the field. If the data type has configuration items, the default value must be one of the enabled configuration items. The maximum length is 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The description of the field. The maximum length is 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Test field</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the field is encrypted. If you set this parameter to true, the underlying system encrypts and stores the data value.</p>
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
     * <p>The configuration items for the field value.</p>
     */
    @NameInMap("FieldDataConfig")
    public CreateCustomFieldRequestFieldDataConfig fieldDataConfig;

    /**
     * <p>The data type of the field. Valid values:</p>
     * <ul>
     * <li>string: string.</li>
     * <li>number: number. The maximum length is 32 characters. Positive integers and decimals are supported.</li>
     * <li>boolean: Boolean value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("FieldDataType")
    public String fieldDataType;

    /**
     * <p>The field display name. The maximum length is 64 characters.</p>
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
     * <li>input: text box. The supported data types are string and number.</li>
     * <li>select: drop-down list. The supported data types are string and boolean.</li>
     * <li>checkbox: check box. The supported data type is string.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>input</p>
     */
    @NameInMap("FieldDisplayType")
    public String fieldDisplayType;

    /**
     * <p>The field identifier. The maximum length is 40 characters. The value can contain lowercase English letters and underscores, and cannot start with an underscore.</p>
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
     * <p>Specifies whether the field value is unique. If you set this parameter to true, the value of this field must be unique within the corresponding entity type and cannot be duplicated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Unique")
    public Boolean unique;

    /**
     * <p>The field permissions on the user portal. Valid values:</p>
     * <ul>
     * <li>hide: invisible on the user portal</li>
     * <li>read_only: visible but not editable on the user portal</li>
     * <li>read_write: visible and editable on the user portal</li>
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
         * <p>The display name of the configuration item. The maximum length is 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The status of the configuration item. Valid values:</p>
         * <ul>
         * <li>enabled: enabled.</li>
         * <li>disabled: disabled.</li>
         * </ul>
         * <p>If a configuration item is disabled, it is unavailable when you create or update the field value of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The value of the configuration item. The maximum length is 64 characters.</p>
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
         * <p>The list of field configuration items. The maximum number of items is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DisplayName&quot;:&quot;Option 1&quot;,&quot;Value&quot;:&quot;option1&quot;,&quot;Status&quot;:&quot;enabled&quot;}]</p>
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
