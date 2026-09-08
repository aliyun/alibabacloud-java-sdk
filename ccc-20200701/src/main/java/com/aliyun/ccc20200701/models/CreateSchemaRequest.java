// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateSchemaRequest extends TeaModel {
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
     * <p>The schema ID.</p>
     * 
     * <strong>example:</strong>
     * <p>profile</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0eb2742-f37e-4c67-82d4-25c651c1c450</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of fields.</p>
     */
    @NameInMap("Properties")
    public java.util.List<CreateSchemaRequestProperties> properties;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaRequest self = new CreateSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSchemaRequest setProperties(java.util.List<CreateSchemaRequestProperties> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<CreateSchemaRequestProperties> getProperties() {
        return this.properties;
    }

    public CreateSchemaRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSchemaRequestProperties extends TeaModel {
        /**
         * <p>Indicates whether the field is an array.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>The extended properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Clusters\&quot;: {\&quot;Description\&quot;: \&quot;The list of clusters.\&quot;}, \&quot;ClusterIds\&quot;: {\&quot;Description\&quot;: \&quot;The list of cluster IDs.\&quot;}}</p>
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
         * <p>The description of the version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the field is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The display name for agents.</p>
         * 
         * <strong>example:</strong>
         * <p>显示名称</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The display order in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The maximum value of the number.</p>
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
         * <p>The minimum value of the number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The regular expression that is used for validation.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The error message that is returned when the regular expression fails to match.</p>
         * 
         * <strong>example:</strong>
         * <p>错误的格式</p>
         */
        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        /**
         * <p>Indicates whether the field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>Indicates whether the field is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static CreateSchemaRequestProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateSchemaRequestProperties self = new CreateSchemaRequestProperties();
            return TeaModel.build(map, self);
        }

        public CreateSchemaRequestProperties setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public CreateSchemaRequestProperties setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public CreateSchemaRequestProperties setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateSchemaRequestProperties setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSchemaRequestProperties setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public CreateSchemaRequestProperties setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateSchemaRequestProperties setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public CreateSchemaRequestProperties setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public CreateSchemaRequestProperties setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public CreateSchemaRequestProperties setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public CreateSchemaRequestProperties setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public CreateSchemaRequestProperties setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public CreateSchemaRequestProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSchemaRequestProperties setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public CreateSchemaRequestProperties setPatternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
            return this;
        }
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        public CreateSchemaRequestProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateSchemaRequestProperties setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

}
