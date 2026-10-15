// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AttributeDetailDTO extends TeaModel {
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
     * <p>The property status.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of valid values for the property.</p>
     */
    @NameInMap("Values")
    public java.util.List<AttributeDetailDTOValues> values;

    public static AttributeDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        AttributeDetailDTO self = new AttributeDetailDTO();
        return TeaModel.build(map, self);
    }

    public AttributeDetailDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AttributeDetailDTO setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public AttributeDetailDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AttributeDetailDTO setValues(java.util.List<AttributeDetailDTOValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<AttributeDetailDTOValues> getValues() {
        return this.values;
    }

    public static class AttributeDetailDTOValues extends TeaModel {
        /**
         * <p>The list of cascading property values (recursive structure).</p>
         */
        @NameInMap("CascadingAttributeValues")
        public java.util.List<AttributeDetailDTO> cascadingAttributeValues;

        /**
         * <p>The property value, which corresponds to the identifyKey in the property value definition.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AttributeDetailDTOValues build(java.util.Map<String, ?> map) throws Exception {
            AttributeDetailDTOValues self = new AttributeDetailDTOValues();
            return TeaModel.build(map, self);
        }

        public AttributeDetailDTOValues setCascadingAttributeValues(java.util.List<AttributeDetailDTO> cascadingAttributeValues) {
            this.cascadingAttributeValues = cascadingAttributeValues;
            return this;
        }
        public java.util.List<AttributeDetailDTO> getCascadingAttributeValues() {
            return this.cascadingAttributeValues;
        }

        public AttributeDetailDTOValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
