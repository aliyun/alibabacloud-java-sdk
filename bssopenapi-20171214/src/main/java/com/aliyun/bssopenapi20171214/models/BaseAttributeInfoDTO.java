// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class BaseAttributeInfoDTO extends TeaModel {
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
     * <p>The property description (translated).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The property name (translated).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The O&amp;M property type.</p>
     */
    @NameInMap("OperationalAttributeType")
    public String operationalAttributeType;

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

    public static BaseAttributeInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        BaseAttributeInfoDTO self = new BaseAttributeInfoDTO();
        return TeaModel.build(map, self);
    }

    public BaseAttributeInfoDTO setAttributeCategories(java.util.List<String> attributeCategories) {
        this.attributeCategories = attributeCategories;
        return this;
    }
    public java.util.List<String> getAttributeCategories() {
        return this.attributeCategories;
    }

    public BaseAttributeInfoDTO setAttributeSource(String attributeSource) {
        this.attributeSource = attributeSource;
        return this;
    }
    public String getAttributeSource() {
        return this.attributeSource;
    }

    public BaseAttributeInfoDTO setAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }
    public String getAttributeType() {
        return this.attributeType;
    }

    public BaseAttributeInfoDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BaseAttributeInfoDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaseAttributeInfoDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BaseAttributeInfoDTO setOperationalAttributeType(String operationalAttributeType) {
        this.operationalAttributeType = operationalAttributeType;
        return this;
    }
    public String getOperationalAttributeType() {
        return this.operationalAttributeType;
    }

    public BaseAttributeInfoDTO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public BaseAttributeInfoDTO setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public BaseAttributeInfoDTO setValues(java.util.List<AttributeValueInfoDTO> values) {
        this.values = values;
        return this;
    }
    public java.util.List<AttributeValueInfoDTO> getValues() {
        return this.values;
    }

}
