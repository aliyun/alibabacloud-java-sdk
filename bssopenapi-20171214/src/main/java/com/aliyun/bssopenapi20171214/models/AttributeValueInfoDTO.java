// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AttributeValueInfoDTO extends TeaModel {
    /**
     * <p>The upper and lower bounds.</p>
     */
    @NameInMap("BoundedValue")
    public AttributeValueInfoDTOBoundedValue boundedValue;

    /**
     * <p>The property code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The default value.</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The description (translated).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The description property values.</p>
     */
    @NameInMap("DescriptionAttributeValues")
    public java.util.List<AttributeValueInfoDTO> descriptionAttributeValues;

    /**
     * <p>The unique identifier.</p>
     */
    @NameInMap("IdentifyKey")
    public String identifyKey;

    /**
     * <p>The maximum value.</p>
     */
    @NameInMap("Max")
    public String max;

    /**
     * <p>The minimum value.</p>
     */
    @NameInMap("Min")
    public String min;

    /**
     * <p>The operation tags.</p>
     */
    @NameInMap("OperationTags")
    public java.util.List<String> operationTags;

    /**
     * <p>The step size.</p>
     */
    @NameInMap("Step")
    public String step;

    /**
     * <p>The sub-property values.</p>
     */
    @NameInMap("SubAttributeValues")
    public java.util.Map<String, java.util.List<AttributeValueInfoDTO>> subAttributeValues;

    /**
     * <p>The enum value.</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The value name (translated).</p>
     */
    @NameInMap("ValueName")
    public String valueName;

    public static AttributeValueInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AttributeValueInfoDTO self = new AttributeValueInfoDTO();
        return TeaModel.build(map, self);
    }

    public AttributeValueInfoDTO setBoundedValue(AttributeValueInfoDTOBoundedValue boundedValue) {
        this.boundedValue = boundedValue;
        return this;
    }
    public AttributeValueInfoDTOBoundedValue getBoundedValue() {
        return this.boundedValue;
    }

    public AttributeValueInfoDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AttributeValueInfoDTO setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public AttributeValueInfoDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AttributeValueInfoDTO setDescriptionAttributeValues(java.util.List<AttributeValueInfoDTO> descriptionAttributeValues) {
        this.descriptionAttributeValues = descriptionAttributeValues;
        return this;
    }
    public java.util.List<AttributeValueInfoDTO> getDescriptionAttributeValues() {
        return this.descriptionAttributeValues;
    }

    public AttributeValueInfoDTO setIdentifyKey(String identifyKey) {
        this.identifyKey = identifyKey;
        return this;
    }
    public String getIdentifyKey() {
        return this.identifyKey;
    }

    public AttributeValueInfoDTO setMax(String max) {
        this.max = max;
        return this;
    }
    public String getMax() {
        return this.max;
    }

    public AttributeValueInfoDTO setMin(String min) {
        this.min = min;
        return this;
    }
    public String getMin() {
        return this.min;
    }

    public AttributeValueInfoDTO setOperationTags(java.util.List<String> operationTags) {
        this.operationTags = operationTags;
        return this;
    }
    public java.util.List<String> getOperationTags() {
        return this.operationTags;
    }

    public AttributeValueInfoDTO setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

    public AttributeValueInfoDTO setSubAttributeValues(java.util.Map<String, java.util.List<AttributeValueInfoDTO>> subAttributeValues) {
        this.subAttributeValues = subAttributeValues;
        return this;
    }
    public java.util.Map<String, java.util.List<AttributeValueInfoDTO>> getSubAttributeValues() {
        return this.subAttributeValues;
    }

    public AttributeValueInfoDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AttributeValueInfoDTO setValueName(String valueName) {
        this.valueName = valueName;
        return this;
    }
    public String getValueName() {
        return this.valueName;
    }

    public static class AttributeValueInfoDTOBoundedValue extends TeaModel {
        /**
         * <p>The lower bound list.</p>
         */
        @NameInMap("LowerBound")
        public java.util.List<AttributeValueInfoDTO> lowerBound;

        /**
         * <p>The upper bound list.</p>
         */
        @NameInMap("UpperBound")
        public java.util.List<AttributeValueInfoDTO> upperBound;

        public static AttributeValueInfoDTOBoundedValue build(java.util.Map<String, ?> map) throws Exception {
            AttributeValueInfoDTOBoundedValue self = new AttributeValueInfoDTOBoundedValue();
            return TeaModel.build(map, self);
        }

        public AttributeValueInfoDTOBoundedValue setLowerBound(java.util.List<AttributeValueInfoDTO> lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }
        public java.util.List<AttributeValueInfoDTO> getLowerBound() {
            return this.lowerBound;
        }

        public AttributeValueInfoDTOBoundedValue setUpperBound(java.util.List<AttributeValueInfoDTO> upperBound) {
            this.upperBound = upperBound;
            return this;
        }
        public java.util.List<AttributeValueInfoDTO> getUpperBound() {
            return this.upperBound;
        }

    }

}
