// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomFieldResponseBody extends TeaModel {
    /**
     * <p>Custom field information.</p>
     */
    @NameInMap("CustomField")
    public GetCustomFieldResponseBodyCustomField customField;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The display name of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>hobby</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The status of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The value of the configuration item.</p>
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
         * <p>A list of field configuration items.</p>
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
         * <p>The creation time of the custom field, in UNIX timestamp format in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17642960730</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The default value of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the custom field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the field is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The entity type to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>Field value configuration items.</p>
         */
        @NameInMap("FieldDataConfig")
        public GetCustomFieldResponseBodyCustomFieldFieldDataConfig fieldDataConfig;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("FieldDataType")
        public String fieldDataType;

        /**
         * <p>The display name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("FieldDisplayName")
        public String fieldDisplayName;

        /**
         * <p>The display type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("FieldDisplayType")
        public String fieldDisplayType;

        /**
         * <p>The field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ufd_ncvy5trszg3zajaal5iofauy2q</p>
         */
        @NameInMap("FieldId")
        public String fieldId;

        /**
         * <p>The field identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_z4pwq7v5ankdimdelzo2zbmzo4</p>
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
         * <p>The status of the custom field.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the field is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Unique")
        public Boolean unique;

        /**
         * <p>The last update time of the custom field, in UNIX timestamp format in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17642960730</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>User-side (portal) permissions.</p>
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
