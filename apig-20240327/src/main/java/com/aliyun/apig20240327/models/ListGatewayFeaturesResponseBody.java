// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayFeaturesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListGatewayFeaturesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayFeaturesResponseBody self = new ListGatewayFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayFeaturesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayFeaturesResponseBody setData(ListGatewayFeaturesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayFeaturesResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayFeaturesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>KEEP_UNCHANGED</p>
         */
        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        public static ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions self = new ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions();
            return TeaModel.build(map, self);
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ListGatewayFeaturesResponseBodyDataItemsDefinition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;true&quot;</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>EnableGzip</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>Engine</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>Trigger</p>
         */
        @NameInMap("inputType")
        public String inputType;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("maxLength")
        public Integer maxLength;

        /**
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("maxValue")
        public String maxValue;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("minLength")
        public Integer minLength;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("minValue")
        public String minValue;

        /**
         * <strong>example:</strong>
         * <p>enable-gzip</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <strong>example:</strong>
         * <p>[a-z].*</p>
         */
        @NameInMap("regex")
        public String regex;

        @NameInMap("valueOptions")
        public java.util.List<ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions> valueOptions;

        /**
         * <strong>example:</strong>
         * <p>bool</p>
         */
        @NameInMap("valueType")
        public String valueType;

        /**
         * <strong>example:</strong>
         * <p>byte</p>
         */
        @NameInMap("valueUnit")
        public String valueUnit;

        public static ListGatewayFeaturesResponseBodyDataItemsDefinition build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFeaturesResponseBodyDataItemsDefinition self = new ListGatewayFeaturesResponseBodyDataItemsDefinition();
            return TeaModel.build(map, self);
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setValueOptions(java.util.List<ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions> valueOptions) {
            this.valueOptions = valueOptions;
            return this;
        }
        public java.util.List<ListGatewayFeaturesResponseBodyDataItemsDefinitionValueOptions> getValueOptions() {
            return this.valueOptions;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public ListGatewayFeaturesResponseBodyDataItemsDefinition setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
            return this;
        }
        public String getValueUnit() {
            return this.valueUnit;
        }

    }

    public static class ListGatewayFeaturesResponseBodyDataItems extends TeaModel {
        @NameInMap("definition")
        public ListGatewayFeaturesResponseBodyDataItemsDefinition definition;

        /**
         * <strong>example:</strong>
         * <p>&quot;true&quot;</p>
         */
        @NameInMap("value")
        public String value;

        public static ListGatewayFeaturesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFeaturesResponseBodyDataItems self = new ListGatewayFeaturesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewayFeaturesResponseBodyDataItems setDefinition(ListGatewayFeaturesResponseBodyDataItemsDefinition definition) {
            this.definition = definition;
            return this;
        }
        public ListGatewayFeaturesResponseBodyDataItemsDefinition getDefinition() {
            return this.definition;
        }

        public ListGatewayFeaturesResponseBodyDataItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGatewayFeaturesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListGatewayFeaturesResponseBodyDataItems> items;

        public static ListGatewayFeaturesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayFeaturesResponseBodyData self = new ListGatewayFeaturesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayFeaturesResponseBodyData setItems(java.util.List<ListGatewayFeaturesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewayFeaturesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
