// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityRuleRequest extends TeaModel {
    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The upsert command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public UpsertQualityRuleRequestUpsertCommand upsertCommand;

    public static UpsertQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityRuleRequest self = new UpsertQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityRuleRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityRuleRequest setUpsertCommand(UpsertQualityRuleRequestUpsertCommand upsertCommand) {
        this.upsertCommand = upsertCommand;
        return this;
    }
    public UpsertQualityRuleRequestUpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static class UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue extends TeaModel {
        /**
         * <p>Specifies whether to include the maximum value.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>Specifies whether to include the minimum value.</p>
         */
        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <p>The maximum value. Applicable to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value. Applicable to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>The attribute value list. Applicable to attributes with the custom input, single-select dropdown, or multi-select dropdown input method.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue self = new UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig extends TeaModel {
        /**
         * <p>The attribute field type. Valid values: STRING (Text), BIGINT (Integer), DOUBLE (Floating-point), BOOLEAN (Boolean), DATE (Date), DATETIME (Datetime).</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The attribute default value.</p>
         */
        @NameInMap("DefaultValue")
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue;

        /**
         * <p>The attribute field length. Used to constrain the maximum length of text-type attribute values.</p>
         * 
         * <strong>example:</strong>
         * <p>986992</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The attribute value input method. Valid values: CUSTOMIZED (Custom input), SINGLE_ENUM (Single-select dropdown), MULTIPLE_ENUMS (Multi-select dropdown), RANGE (Range interval).</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute option values. Only applicable to attributes with the single-select dropdown or multi-select dropdown input method.</p>
         */
        @NameInMap("ValueEnumList")
        public java.util.List<String> valueEnumList;

        public static UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig self = new UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig setDefaultValue(UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue getDefaultValue() {
            return this.defaultValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig setValueEnumList(java.util.List<String> valueEnumList) {
            this.valueEnumList = valueEnumList;
            return this;
        }
        public java.util.List<String> getValueEnumList() {
            return this.valueEnumList;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to enable the attribute.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>711484689131</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>attr01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the attribute is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>Specifies whether the attribute is searchable.</p>
         */
        @NameInMap("Searchable")
        public Boolean searchable;

        /**
         * <p>The attribute value configuration details.</p>
         */
        @NameInMap("ValueConfig")
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig valueConfig;

        public static UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo self = new UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setSearchable(Boolean searchable) {
            this.searchable = searchable;
            return this;
        }
        public Boolean getSearchable() {
            return this.searchable;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo setValueConfig(UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue extends TeaModel {
        /**
         * <p>Specifies whether to include the maximum value.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>Specifies whether to include the minimum value.</p>
         */
        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <p>The maximum value. Applicable to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value. Applicable to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>The attribute value list. Applicable to attributes with the custom input, single-select dropdown, or multi-select dropdown input method.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue self = new UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommandAttributeWithValueList extends TeaModel {
        /**
         * <p>The attribute details.</p>
         */
        @NameInMap("AttributeInfo")
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo attributeInfo;

        /**
         * <p>The attribute value.</p>
         */
        @NameInMap("AttributeValue")
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue attributeValue;

        public static UpsertQualityRuleRequestUpsertCommandAttributeWithValueList build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandAttributeWithValueList self = new UpsertQualityRuleRequestUpsertCommandAttributeWithValueList();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueList setAttributeInfo(UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueList setAttributeValue(UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeValue getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommandFormPropertyList extends TeaModel {
        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>expression</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>col</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpsertQualityRuleRequestUpsertCommandFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandFormPropertyList self = new UpsertQualityRuleRequestUpsertCommandFormPropertyList();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public UpsertQualityRuleRequestUpsertCommandFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityRuleRequestUpsertCommandFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommandValidateConditionList extends TeaModel {
        /**
         * <p>The ID of the condition node.</p>
         * 
         * <strong>example:</strong>
         * <p>268</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metric.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The operator. Valid values: EQUAL, NOT_EQUAL, LARGER, SMALLER, LARGE_OR_EQUAL, SMALLER_OR_EQUAL, AND, OR.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The ID of the parent condition node.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The condition type. Valid values: RELATION, EXPRESSION.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpsertQualityRuleRequestUpsertCommandValidateConditionList build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommandValidateConditionList self = new UpsertQualityRuleRequestUpsertCommandValidateConditionList();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommandValidateConditionList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpsertQualityRuleRequestUpsertCommandValidateConditionList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public UpsertQualityRuleRequestUpsertCommandValidateConditionList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpsertQualityRuleRequestUpsertCommandValidateConditionList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public UpsertQualityRuleRequestUpsertCommandValidateConditionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpsertQualityRuleRequestUpsertCommandValidateConditionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpsertQualityRuleRequestUpsertCommand extends TeaModel {
        /**
         * <p>The rule business attribute configuration.</p>
         */
        @NameInMap("AttributeWithValueList")
        public java.util.List<UpsertQualityRuleRequestUpsertCommandAttributeWithValueList> attributeWithValueList;

        /**
         * <p>The rule category. Valid values: CONSISTENT (Consistency), EFFECTIVE (Effectiveness), TIMELINESE (Timeliness), ACCURATE (Accuracy), UNIQUENESS (Uniqueness), COMPLETENESS (Completeness), STABILITY (Stability), CUSTOM (Custom).</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <p>The description of the quality rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to enable error archiving.</p>
         */
        @NameInMap("EnableErrorArchive")
        public Boolean enableErrorArchive;

        /**
         * <p>The rule configuration key-value pairs. The configuration varies based on the template type. Different template types return different form key-value pair configurations.</p>
         */
        @NameInMap("FormPropertyList")
        public java.util.List<UpsertQualityRuleRequestUpsertCommandFormPropertyList> formPropertyList;

        /**
         * <p>Rule ID. A non-empty value indicates a modification, and an empty value indicates a creation.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the quality rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule strength. Valid values: STRONG, WEAK.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRONG</p>
         */
        @NameInMap("Strength")
        public String strength;

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>FIELD_NULL_VALUE_VALIDATE: Field null value validation</li>
         * <li>FIELD_EMPTY_STRING_VALIDATE: Field empty string validation</li>
         * <li>FIELD_UNIQUE_VALIDATE: Field uniqueness validation</li>
         * <li>FIELD_GROUP_COUNT_VALIDATE: Field unique value count validation</li>
         * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: Field duplicate value count validation</li>
         * <li>FUNCTION_TIME_COMPARE: Time function comparison</li>
         * <li>SINGLE_TABLE_TIME_COMPARE: Single-table time field comparison</li>
         * <li>DOUBLE_TABLE_TIME_COMPARE: Cross-table time field comparison</li>
         * <li>FIELD_FORMAT_VALIDATE: Field format validation</li>
         * <li>FIELD_LENGTH_VALIDATE: Field length validation</li>
         * <li>FIELD_VALUE_RANGE_VALIDATE: Field value range validation</li>
         * <li>CODE_TABLE_COMPARE: Code table reference comparison</li>
         * <li>STANDARD_CODE_TABLE_COMPARE: Data standard code table reference comparison</li>
         * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: Single-table field value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: Single-table field statistical value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: Single-table field business logic consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: Cross-table field value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Cross-table field statistical value consistency comparison</li>
         * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Cross-source cross-table field statistical value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: Cross-table field business logic consistency comparison</li>
         * <li>TABLE_STABILITY_VALIDATE: Table stability validation</li>
         * <li>TABLE_FLUCTUATION_VALIDATE: Table fluctuation validation</li>
         * <li>FIELD_STABILITY_VALIDATE: Field stability validation</li>
         * <li>FIELD_FLUCTUATION_VALIDATE: Field fluctuation validation</li>
         * <li>CUSTOM_STATISTICAL_VALIDATE: Custom statistical metric validation</li>
         * <li>CUSTOM_DATA_DETAILS_VALIDATE: Custom data details validation</li>
         * <li>DATASOURCE_AVAILABLE_CHECK: Data source connectivity check</li>
         * <li>TABLE_SCHEMA_CHECK: Table schema change monitoring</li>
         * <li>REAL_TIME_OFFLINE_COMPARE: Real-time offline comparison</li>
         * <li>REAL_TIME_STATISTICAL_VALIDATE: Real-time statistical value monitoring</li>
         * <li>REAL_TIME_MULTI_CHAIN_COMPARE: Real-time multi-chain comparison, etc.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FIELD_NULL_VALUE_VALIDATE</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The validation conditions.</p>
         */
        @NameInMap("ValidateConditionList")
        public java.util.List<UpsertQualityRuleRequestUpsertCommandValidateConditionList> validateConditionList;

        /**
         * <p>The ID of the associated monitor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static UpsertQualityRuleRequestUpsertCommand build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityRuleRequestUpsertCommand self = new UpsertQualityRuleRequestUpsertCommand();
            return TeaModel.build(map, self);
        }

        public UpsertQualityRuleRequestUpsertCommand setAttributeWithValueList(java.util.List<UpsertQualityRuleRequestUpsertCommandAttributeWithValueList> attributeWithValueList) {
            this.attributeWithValueList = attributeWithValueList;
            return this;
        }
        public java.util.List<UpsertQualityRuleRequestUpsertCommandAttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        public UpsertQualityRuleRequestUpsertCommand setCatalogList(java.util.List<String> catalogList) {
            this.catalogList = catalogList;
            return this;
        }
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        public UpsertQualityRuleRequestUpsertCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpsertQualityRuleRequestUpsertCommand setEnableErrorArchive(Boolean enableErrorArchive) {
            this.enableErrorArchive = enableErrorArchive;
            return this;
        }
        public Boolean getEnableErrorArchive() {
            return this.enableErrorArchive;
        }

        public UpsertQualityRuleRequestUpsertCommand setFormPropertyList(java.util.List<UpsertQualityRuleRequestUpsertCommandFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<UpsertQualityRuleRequestUpsertCommandFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public UpsertQualityRuleRequestUpsertCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpsertQualityRuleRequestUpsertCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityRuleRequestUpsertCommand setStrength(String strength) {
            this.strength = strength;
            return this;
        }
        public String getStrength() {
            return this.strength;
        }

        public UpsertQualityRuleRequestUpsertCommand setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public UpsertQualityRuleRequestUpsertCommand setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public UpsertQualityRuleRequestUpsertCommand setValidateConditionList(java.util.List<UpsertQualityRuleRequestUpsertCommandValidateConditionList> validateConditionList) {
            this.validateConditionList = validateConditionList;
            return this;
        }
        public java.util.List<UpsertQualityRuleRequestUpsertCommandValidateConditionList> getValidateConditionList() {
            return this.validateConditionList;
        }

        public UpsertQualityRuleRequestUpsertCommand setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
