// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateSchemaPropertyRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0eb2742-f37e-4c67-82d4-25c651c1xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Field</p>
     */
    @NameInMap("Property")
    public UpdateSchemaPropertyRequestProperty property;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>BC976D32-AC4C-4E0F-8AA9-F4BC6C4E2B3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>profile</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static UpdateSchemaPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaPropertyRequest self = new UpdateSchemaPropertyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaPropertyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSchemaPropertyRequest setProperty(UpdateSchemaPropertyRequestProperty property) {
        this.property = property;
        return this;
    }
    public UpdateSchemaPropertyRequestProperty getProperty() {
        return this.property;
    }

    public UpdateSchemaPropertyRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSchemaPropertyRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public static class UpdateSchemaPropertyRequestProperty extends TeaModel {
        /**
         * <p>Specifies whether the property is an array.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>Extension attributes</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;instanceId\&quot;:\&quot;4cc3f160-ca64-49ff-bc70-390a044a4e83\&quot;,\&quot;appId\&quot;:\&quot;1684145288664\&quot;,\&quot;commodityCode\&quot;:\&quot;dide_pre\&quot;,\&quot;dide_pre_set\&quot;:\&quot;version_ent\&quot;}</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>Data type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the property is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Display name</p>
         * 
         * <strong>example:</strong>
         * <p>姓名</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Display order</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>Editor type</p>
         * 
         * <strong>example:</strong>
         * <p>textbox</p>
         */
        @NameInMap("EditorType")
        public String editorType;

        /**
         * <p>Maximum length</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>Maximum value</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <p>Minimum length</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinLength")
        public Integer minLength;

        /**
         * <p>Minimum value</p>
         * 
         * <strong>example:</strong>
         * <p>10800</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>Name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Regular expression validation rule</p>
         * 
         * <strong>example:</strong>
         * <p>(.*)</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>Regular expression validation error message</p>
         * 
         * <strong>example:</strong>
         * <p>不是有效的email地址</p>
         */
        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        /**
         * <p>Read-only</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>Required</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static UpdateSchemaPropertyRequestProperty build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemaPropertyRequestProperty self = new UpdateSchemaPropertyRequestProperty();
            return TeaModel.build(map, self);
        }

        public UpdateSchemaPropertyRequestProperty setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public UpdateSchemaPropertyRequestProperty setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public UpdateSchemaPropertyRequestProperty setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpdateSchemaPropertyRequestProperty setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSchemaPropertyRequestProperty setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public UpdateSchemaPropertyRequestProperty setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateSchemaPropertyRequestProperty setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public UpdateSchemaPropertyRequestProperty setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public UpdateSchemaPropertyRequestProperty setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public UpdateSchemaPropertyRequestProperty setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public UpdateSchemaPropertyRequestProperty setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public UpdateSchemaPropertyRequestProperty setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public UpdateSchemaPropertyRequestProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSchemaPropertyRequestProperty setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public UpdateSchemaPropertyRequestProperty setPatternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
            return this;
        }
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        public UpdateSchemaPropertyRequestProperty setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateSchemaPropertyRequestProperty setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

}
