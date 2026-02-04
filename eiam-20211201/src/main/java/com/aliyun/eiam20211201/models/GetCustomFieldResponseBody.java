// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomFieldResponseBody extends TeaModel {
    @NameInMap("CustomField")
    public GetCustomFieldResponseBodyCustomField customField;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCustomFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldResponseBody self = new GetCustomFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldResponseBody setCustomField(GetCustomFieldResponseBodyCustomField customField) {
        this.customField = customField;
        return this;
    }
    public GetCustomFieldResponseBodyCustomField getCustomField() {
        return this.customField;
    }

    public GetCustomFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems extends TeaModel {
        /**
         * <p>配置项展示名</p>
         * 
         * <strong>example:</strong>
         * <p>hobby</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>配置项状态, 枚举值，enabled、disabled</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>配置项值</p>
         * 
         * <strong>example:</strong>
         * <p>game</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems build(java.util.Map<String, ?> map) throws Exception {
            GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems self = new GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems();
            return TeaModel.build(map, self);
        }

        public GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCustomFieldResponseBodyCustomFieldFieldDataConfig extends TeaModel {
        /**
         * <p>字段配置项列表，displayName、value、status</p>
         */
        @NameInMap("Items")
        public java.util.List<GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems> items;

        public static GetCustomFieldResponseBodyCustomFieldFieldDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCustomFieldResponseBodyCustomFieldFieldDataConfig self = new GetCustomFieldResponseBodyCustomFieldFieldDataConfig();
            return TeaModel.build(map, self);
        }

        public GetCustomFieldResponseBodyCustomFieldFieldDataConfig setItems(java.util.List<GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetCustomFieldResponseBodyCustomFieldFieldDataConfigItems> getItems() {
            return this.items;
        }

    }

    public static class GetCustomFieldResponseBodyCustomField extends TeaModel {
        /**
         * <p>扩展字段创建时间，Unix时间戳格式，单位为毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>17642960730</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>字段默认值</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>扩展字段描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>字段所属实体类型</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>字段值配置项</p>
         */
        @NameInMap("FieldDataConfig")
        public GetCustomFieldResponseBodyCustomFieldFieldDataConfig fieldDataConfig;

        /**
         * <p>数据类型，枚举值：string、number、boolean</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("FieldDataType")
        public String fieldDataType;

        /**
         * <p>字段展示名</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("FieldDisplayName")
        public String fieldDisplayName;

        /**
         * <p>字段展示类型，枚举值，select、checkbox、input、number</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("FieldDisplayType")
        public String fieldDisplayType;

        /**
         * <p>字段ID</p>
         * 
         * <strong>example:</strong>
         * <p>ufd_ncvy5trszg3zajaal5iofauy2q</p>
         */
        @NameInMap("FieldId")
        public String fieldId;

        /**
         * <p>字段标识</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_z4pwq7v5ankdimdelzo2zbmzo4</p>
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
         * <p>扩展字段状态, 枚举类型：enabled，disabled</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>是否唯一，默认false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Unique")
        public Boolean unique;

        /**
         * <p>扩展字段最近一次更新时间, Unix时间戳格式，单位为毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>17642960730</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>用户端(portal侧)权限，hide、read_only、read_write，默认read_only</p>
         * 
         * <strong>example:</strong>
         * <p>read_only</p>
         */
        @NameInMap("UserPermission")
        public String userPermission;

        public static GetCustomFieldResponseBodyCustomField build(java.util.Map<String, ?> map) throws Exception {
            GetCustomFieldResponseBodyCustomField self = new GetCustomFieldResponseBodyCustomField();
            return TeaModel.build(map, self);
        }

        public GetCustomFieldResponseBodyCustomField setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCustomFieldResponseBodyCustomField setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetCustomFieldResponseBodyCustomField setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCustomFieldResponseBodyCustomField setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public GetCustomFieldResponseBodyCustomField setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetCustomFieldResponseBodyCustomField setFieldDataConfig(GetCustomFieldResponseBodyCustomFieldFieldDataConfig fieldDataConfig) {
            this.fieldDataConfig = fieldDataConfig;
            return this;
        }
        public GetCustomFieldResponseBodyCustomFieldFieldDataConfig getFieldDataConfig() {
            return this.fieldDataConfig;
        }

        public GetCustomFieldResponseBodyCustomField setFieldDataType(String fieldDataType) {
            this.fieldDataType = fieldDataType;
            return this;
        }
        public String getFieldDataType() {
            return this.fieldDataType;
        }

        public GetCustomFieldResponseBodyCustomField setFieldDisplayName(String fieldDisplayName) {
            this.fieldDisplayName = fieldDisplayName;
            return this;
        }
        public String getFieldDisplayName() {
            return this.fieldDisplayName;
        }

        public GetCustomFieldResponseBodyCustomField setFieldDisplayType(String fieldDisplayType) {
            this.fieldDisplayType = fieldDisplayType;
            return this;
        }
        public String getFieldDisplayType() {
            return this.fieldDisplayType;
        }

        public GetCustomFieldResponseBodyCustomField setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public GetCustomFieldResponseBodyCustomField setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetCustomFieldResponseBodyCustomField setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCustomFieldResponseBodyCustomField setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetCustomFieldResponseBodyCustomField setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomFieldResponseBodyCustomField setUnique(Boolean unique) {
            this.unique = unique;
            return this;
        }
        public Boolean getUnique() {
            return this.unique;
        }

        public GetCustomFieldResponseBodyCustomField setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetCustomFieldResponseBodyCustomField setUserPermission(String userPermission) {
            this.userPermission = userPermission;
            return this;
        }
        public String getUserPermission() {
            return this.userPermission;
        }

    }

}
