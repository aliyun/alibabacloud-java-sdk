// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SelectedComponentConfigDTO extends TeaModel {
    /**
     * <p>The property configuration list.</p>
     */
    @NameInMap("AttributeConfigs")
    public java.util.List<SelectedComponentConfigDTOAttributeConfigs> attributeConfigs;

    /**
     * <p>The component code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The unique identifier of the component, used in multi-node and multi-disk scenarios.</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static SelectedComponentConfigDTO build(java.util.Map<String, ?> map) throws Exception {
        SelectedComponentConfigDTO self = new SelectedComponentConfigDTO();
        return TeaModel.build(map, self);
    }

    public SelectedComponentConfigDTO setAttributeConfigs(java.util.List<SelectedComponentConfigDTOAttributeConfigs> attributeConfigs) {
        this.attributeConfigs = attributeConfigs;
        return this;
    }
    public java.util.List<SelectedComponentConfigDTOAttributeConfigs> getAttributeConfigs() {
        return this.attributeConfigs;
    }

    public SelectedComponentConfigDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SelectedComponentConfigDTO setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public static class SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound extends TeaModel {
        /**
         * <p>The property code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound build(java.util.Map<String, ?> map) throws Exception {
            SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound self = new SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound();
            return TeaModel.build(map, self);
        }

        public SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound extends TeaModel {
        /**
         * <p>The property code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound build(java.util.Map<String, ?> map) throws Exception {
            SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound self = new SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound();
            return TeaModel.build(map, self);
        }

        public SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SelectedComponentConfigDTOAttributeConfigsBoundedValue extends TeaModel {
        /**
         * <p>The lower bound.</p>
         */
        @NameInMap("LowerBound")
        public SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound lowerBound;

        /**
         * <p>The upper bound.</p>
         */
        @NameInMap("UpperBound")
        public SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound upperBound;

        public static SelectedComponentConfigDTOAttributeConfigsBoundedValue build(java.util.Map<String, ?> map) throws Exception {
            SelectedComponentConfigDTOAttributeConfigsBoundedValue self = new SelectedComponentConfigDTOAttributeConfigsBoundedValue();
            return TeaModel.build(map, self);
        }

        public SelectedComponentConfigDTOAttributeConfigsBoundedValue setLowerBound(SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }
        public SelectedComponentConfigDTOAttributeConfigsBoundedValueLowerBound getLowerBound() {
            return this.lowerBound;
        }

        public SelectedComponentConfigDTOAttributeConfigsBoundedValue setUpperBound(SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound upperBound) {
            this.upperBound = upperBound;
            return this;
        }
        public SelectedComponentConfigDTOAttributeConfigsBoundedValueUpperBound getUpperBound() {
            return this.upperBound;
        }

    }

    public static class SelectedComponentConfigDTOAttributeConfigs extends TeaModel {
        /**
         * <p>The upper and lower bound values, used for bounded properties.</p>
         */
        @NameInMap("BoundedValue")
        public SelectedComponentConfigDTOAttributeConfigsBoundedValue boundedValue;

        /**
         * <p>The property code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SelectedComponentConfigDTOAttributeConfigs build(java.util.Map<String, ?> map) throws Exception {
            SelectedComponentConfigDTOAttributeConfigs self = new SelectedComponentConfigDTOAttributeConfigs();
            return TeaModel.build(map, self);
        }

        public SelectedComponentConfigDTOAttributeConfigs setBoundedValue(SelectedComponentConfigDTOAttributeConfigsBoundedValue boundedValue) {
            this.boundedValue = boundedValue;
            return this;
        }
        public SelectedComponentConfigDTOAttributeConfigsBoundedValue getBoundedValue() {
            return this.boundedValue;
        }

        public SelectedComponentConfigDTOAttributeConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SelectedComponentConfigDTOAttributeConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
