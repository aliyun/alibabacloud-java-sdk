// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DataSchemaPropertiesValue extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Pattern")
    public String pattern;

    @NameInMap("PatternErrorMessage")
    public String patternErrorMessage;

    @NameInMap("MinLength")
    public Integer minLength;

    @NameInMap("MaxLength")
    public Integer maxLength;

    @NameInMap("Minimum")
    public Double minimum;

    @NameInMap("Maximum")
    public Double maximum;

    @NameInMap("Required")
    public Boolean required;

    @NameInMap("System")
    public Boolean system;

    @NameInMap("Disabled")
    public Boolean disabled;

    @NameInMap("Array")
    public Boolean array;

    @NameInMap("ReadOnly")
    public Boolean readOnly;

    @NameInMap("EditorType")
    public String editorType;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("DisplayOrder")
    public Integer displayOrder;

    @NameInMap("CreatedTime")
    public Long createdTime;

    @NameInMap("UpdatedTime")
    public Long updatedTime;

    @NameInMap("Creator")
    public String creator;

    public static DataSchemaPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        DataSchemaPropertiesValue self = new DataSchemaPropertiesValue();
        return TeaModel.build(map, self);
    }

    public DataSchemaPropertiesValue setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DataSchemaPropertiesValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataSchemaPropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataSchemaPropertiesValue setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DataSchemaPropertiesValue setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public DataSchemaPropertiesValue setPatternErrorMessage(String patternErrorMessage) {
        this.patternErrorMessage = patternErrorMessage;
        return this;
    }
    public String getPatternErrorMessage() {
        return this.patternErrorMessage;
    }

    public DataSchemaPropertiesValue setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public Integer getMinLength() {
        return this.minLength;
    }

    public DataSchemaPropertiesValue setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public DataSchemaPropertiesValue setMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }
    public Double getMinimum() {
        return this.minimum;
    }

    public DataSchemaPropertiesValue setMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }
    public Double getMaximum() {
        return this.maximum;
    }

    public DataSchemaPropertiesValue setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public DataSchemaPropertiesValue setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public DataSchemaPropertiesValue setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public DataSchemaPropertiesValue setArray(Boolean array) {
        this.array = array;
        return this;
    }
    public Boolean getArray() {
        return this.array;
    }

    public DataSchemaPropertiesValue setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public DataSchemaPropertiesValue setEditorType(String editorType) {
        this.editorType = editorType;
        return this;
    }
    public String getEditorType() {
        return this.editorType;
    }

    public DataSchemaPropertiesValue setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public DataSchemaPropertiesValue setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public DataSchemaPropertiesValue setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DataSchemaPropertiesValue setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public DataSchemaPropertiesValue setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

}
