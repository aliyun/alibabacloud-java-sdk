// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DataPropertiesValue extends TeaModel {
    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>姓名</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The regular expression that is used for validation.</p>
     * 
     * <strong>example:</strong>
     * <p>^</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The error message that is returned if the value does not match the regular expression.</p>
     * 
     * <strong>example:</strong>
     * <p>不是有效的email地址</p>
     */
    @NameInMap("PatternErrorMessage")
    public String patternErrorMessage;

    /**
     * <p>The minimum length.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinLength")
    public Integer minLength;

    /**
     * <p>The maximum length.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxLength")
    public Integer maxLength;

    /**
     * <p>The minimum value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Minimum")
    public Double minimum;

    /**
     * <p>The maximum value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Maximum")
    public Double maximum;

    /**
     * <p>Indicates whether the field is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Required")
    public Boolean required;

    /**
     * <p>Indicates whether the field is a system field.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("System")
    public Boolean system;

    /**
     * <p>Indicates whether the field is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>Indicates whether the field is an array.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Array")
    public Boolean array;

    /**
     * <p>Indicates whether the field is read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReadOnly")
    public Boolean readOnly;

    /**
     * <p>The type of the editor.</p>
     * 
     * <strong>example:</strong>
     * <p>textbox</p>
     */
    @NameInMap("EditorType")
    public String editorType;

    /**
     * <p>The extended properties.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Attributes")
    public String attributes;

    /**
     * <p>The display order.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DisplayOrder")
    public Integer displayOrder;

    /**
     * <p>The time when the field was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-14 10:48:43.0</p>
     */
    @NameInMap("CreatedTime")
    public Long createdTime;

    /**
     * <p>The time when the field was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-14 10:48:43.0</p>
     */
    @NameInMap("UpdatedTime")
    public Long updatedTime;

    /**
     * <p>Creator</p>
     * 
     * <strong>example:</strong>
     * <p>tom</p>
     */
    @NameInMap("Creator")
    public String creator;

    public static DataPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        DataPropertiesValue self = new DataPropertiesValue();
        return TeaModel.build(map, self);
    }

    public DataPropertiesValue setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DataPropertiesValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataPropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataPropertiesValue setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DataPropertiesValue setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public DataPropertiesValue setPatternErrorMessage(String patternErrorMessage) {
        this.patternErrorMessage = patternErrorMessage;
        return this;
    }
    public String getPatternErrorMessage() {
        return this.patternErrorMessage;
    }

    public DataPropertiesValue setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public Integer getMinLength() {
        return this.minLength;
    }

    public DataPropertiesValue setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public DataPropertiesValue setMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }
    public Double getMinimum() {
        return this.minimum;
    }

    public DataPropertiesValue setMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }
    public Double getMaximum() {
        return this.maximum;
    }

    public DataPropertiesValue setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public DataPropertiesValue setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public DataPropertiesValue setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public DataPropertiesValue setArray(Boolean array) {
        this.array = array;
        return this;
    }
    public Boolean getArray() {
        return this.array;
    }

    public DataPropertiesValue setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public DataPropertiesValue setEditorType(String editorType) {
        this.editorType = editorType;
        return this;
    }
    public String getEditorType() {
        return this.editorType;
    }

    public DataPropertiesValue setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public DataPropertiesValue setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public DataPropertiesValue setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DataPropertiesValue setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public DataPropertiesValue setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

}
