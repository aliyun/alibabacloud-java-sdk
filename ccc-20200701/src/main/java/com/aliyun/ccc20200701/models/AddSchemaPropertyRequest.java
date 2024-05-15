// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddSchemaPropertyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Property")
    public AddSchemaPropertyRequestProperty property;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static AddSchemaPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSchemaPropertyRequest self = new AddSchemaPropertyRequest();
        return TeaModel.build(map, self);
    }

    public AddSchemaPropertyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSchemaPropertyRequest setProperty(AddSchemaPropertyRequestProperty property) {
        this.property = property;
        return this;
    }
    public AddSchemaPropertyRequestProperty getProperty() {
        return this.property;
    }

    public AddSchemaPropertyRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSchemaPropertyRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public static class AddSchemaPropertyRequestProperty extends TeaModel {
        @NameInMap("Array")
        public Boolean array;

        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        @NameInMap("EditorType")
        public String editorType;

        @NameInMap("MaxLength")
        public Integer maxLength;

        @NameInMap("Maximum")
        public Double maximum;

        @NameInMap("MinLength")
        public Integer minLength;

        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Required")
        public Boolean required;

        public static AddSchemaPropertyRequestProperty build(java.util.Map<String, ?> map) throws Exception {
            AddSchemaPropertyRequestProperty self = new AddSchemaPropertyRequestProperty();
            return TeaModel.build(map, self);
        }

        public AddSchemaPropertyRequestProperty setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public AddSchemaPropertyRequestProperty setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public AddSchemaPropertyRequestProperty setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public AddSchemaPropertyRequestProperty setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddSchemaPropertyRequestProperty setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public AddSchemaPropertyRequestProperty setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddSchemaPropertyRequestProperty setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public AddSchemaPropertyRequestProperty setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public AddSchemaPropertyRequestProperty setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public AddSchemaPropertyRequestProperty setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public AddSchemaPropertyRequestProperty setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public AddSchemaPropertyRequestProperty setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public AddSchemaPropertyRequestProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddSchemaPropertyRequestProperty setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public AddSchemaPropertyRequestProperty setPatternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
            return this;
        }
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        public AddSchemaPropertyRequestProperty setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public AddSchemaPropertyRequestProperty setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

}
