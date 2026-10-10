// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddSchemaPropertyRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0eb2742-f37e-4c67-82d4-25c651c1xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The property.</p>
     */
    @NameInMap("Property")
    public AddSchemaPropertyRequestProperty property;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
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
        /**
         * <p>Specifies whether the property is an array.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>The extended attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;newName&quot;:&quot;Xiaoju Charging-demo&quot;,&quot;appId&quot;:&quot;69FRKB4193W8BYP0&quot;}</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The data type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the property is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The display order in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>The editor type.</p>
         * 
         * <strong>example:</strong>
         * <p>textbox</p>
         */
        @NameInMap("EditorType")
        public String editorType;

        /**
         * <p>The maximum length.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>The maximum numeric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <p>The minimum length.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinLength")
        public Integer minLength;

        /**
         * <p>The minimum numeric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>The display name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The regular expression validation rule.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The error message for regular expression validation.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid format</p>
         */
        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        /**
         * <p>Specifies whether the property is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>Specifies whether the property is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
