// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomFieldRequest extends TeaModel {
    /**
     * <p>字段默认值，必须与数据类型一致</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>对字段的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>字段测试</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>是否加密，默认false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>字段归属实体。实体包括账户、组、组织</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>字段值配置项，必须与数据类型一致</p>
     */
    @NameInMap("FieldDataConfig")
    public CreateCustomFieldRequestFieldDataConfig fieldDataConfig;

    /**
     * <p>数据类型，枚举值：string、number、boolean</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("FieldDataType")
    public String fieldDataType;

    /**
     * <p>字段展示名，长度不超过128字符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("FieldDisplayName")
    public String fieldDisplayName;

    /**
     * <p>字段展示类型，枚举值，select、checkbox、input</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>input</p>
     */
    @NameInMap("FieldDisplayType")
    public String fieldDisplayType;

    /**
     * <p>字段标识，英文字母、下划线</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>field_001</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>是否必填，默认false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Required")
    public Boolean required;

    /**
     * <p>是否唯一，默认false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Unique")
    public Boolean unique;

    /**
     * <p>用户端(portal侧)权限，hide、read_only、read_write，默认read_only</p>
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
         * <p>配置项展示名</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>配置项状态，枚举值，enabled、disabled</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>配置项展示值</p>
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
         * <p>字段值配置项，必须与数据类型一致，只能新增数据项，不可删除，项字段：displayName、value、status</p>
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
