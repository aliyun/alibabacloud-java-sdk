// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AttributeInfoDTO extends TeaModel {
    /**
     * <p>The property categories.</p>
     */
    @NameInMap("AttributeCategories")
    public java.util.List<String> attributeCategories;

    /**
     * <p>The property source.</p>
     */
    @NameInMap("AttributeSource")
    public String attributeSource;

    /**
     * <p>The property type.</p>
     */
    @NameInMap("AttributeType")
    public String attributeType;

    /**
     * <p>The property code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The composite properties (basic information).</p>
     */
    @NameInMap("CompositeAttributes")
    public java.util.List<BaseAttributeInfoDTO> compositeAttributes;

    /**
     * <p>The property description (translated).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The description properties (basic information).</p>
     */
    @NameInMap("DescriptionAttributes")
    public java.util.List<BaseAttributeInfoDTO> descriptionAttributes;

    /**
     * <p>The property name (translated).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The O&amp;M property configuration.</p>
     */
    @NameInMap("OperationalAttributeConfig")
    public String operationalAttributeConfig;

    /**
     * <p>The O&amp;M property type.</p>
     */
    @NameInMap("OperationalAttributeType")
    public String operationalAttributeType;

    /**
     * <p>The sub-properties (complete information).</p>
     */
    @NameInMap("SubAttributes")
    public java.util.List<AttributeInfoDTO> subAttributes;

    /**
     * <p>The unit.</p>
     */
    @NameInMap("Unit")
    public String unit;

    /**
     * <p>The value type.</p>
     */
    @NameInMap("ValueType")
    public String valueType;

    /**
     * <p>The property value list.</p>
     */
    @NameInMap("Values")
    public java.util.List<AttributeValueInfoDTO> values;

    public static AttributeInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AttributeInfoDTO self = new AttributeInfoDTO();
        return TeaModel.build(map, self);
    }

    public AttributeInfoDTO setAttributeCategories(java.util.List<String> attributeCategories) {
        this.attributeCategories = attributeCategories;
        return this;
    }
    public java.util.List<String> getAttributeCategories() {
        return this.attributeCategories;
    }

    public AttributeInfoDTO setAttributeSource(String attributeSource) {
        this.attributeSource = attributeSource;
        return this;
    }
    public String getAttributeSource() {
        return this.attributeSource;
    }

    public AttributeInfoDTO setAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }
    public String getAttributeType() {
        return this.attributeType;
    }

    public AttributeInfoDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AttributeInfoDTO setCompositeAttributes(java.util.List<BaseAttributeInfoDTO> compositeAttributes) {
        this.compositeAttributes = compositeAttributes;
        return this;
    }
    public java.util.List<BaseAttributeInfoDTO> getCompositeAttributes() {
        return this.compositeAttributes;
    }

    public AttributeInfoDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AttributeInfoDTO setDescriptionAttributes(java.util.List<BaseAttributeInfoDTO> descriptionAttributes) {
        this.descriptionAttributes = descriptionAttributes;
        return this;
    }
    public java.util.List<BaseAttributeInfoDTO> getDescriptionAttributes() {
        return this.descriptionAttributes;
    }

    public AttributeInfoDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AttributeInfoDTO setOperationalAttributeConfig(String operationalAttributeConfig) {
        this.operationalAttributeConfig = operationalAttributeConfig;
        return this;
    }
    public String getOperationalAttributeConfig() {
        return this.operationalAttributeConfig;
    }

    public AttributeInfoDTO setOperationalAttributeType(String operationalAttributeType) {
        this.operationalAttributeType = operationalAttributeType;
        return this;
    }
    public String getOperationalAttributeType() {
        return this.operationalAttributeType;
    }

    public AttributeInfoDTO setSubAttributes(java.util.List<AttributeInfoDTO> subAttributes) {
        this.subAttributes = subAttributes;
        return this;
    }
    public java.util.List<AttributeInfoDTO> getSubAttributes() {
        return this.subAttributes;
    }

    public AttributeInfoDTO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public AttributeInfoDTO setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public AttributeInfoDTO setValues(java.util.List<AttributeValueInfoDTO> values) {
        this.values = values;
        return this;
    }
    public java.util.List<AttributeValueInfoDTO> getValues() {
        return this.values;
    }

}
