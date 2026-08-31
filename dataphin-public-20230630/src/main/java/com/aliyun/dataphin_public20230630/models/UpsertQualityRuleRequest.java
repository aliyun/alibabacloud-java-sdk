// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityRuleRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update command.</p>
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

    public UpsertQualityRuleRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
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
         * <p>Indicates whether the maximum value is included.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>Indicates whether the minimum value is included.</p>
         */
        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <p>The maximum value. This parameter applies to range interval properties.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value. This parameter applies to range interval properties.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>The property value list. This parameter applies to properties whose input method is custom input, single-select dropdown, or multi-select dropdown.</p>
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
         * <p>The property field data type. Valid values:</p>
         * <ul>
         * <li>STRING: text.</li>
         * <li>BIGINT: integer.</li>
         * <li>DOUBLE: floating-point.</li>
         * <li>BOOLEAN: Boolean.</li>
         * <li>DATE: date.</li>
         * <li>DATETIME: datetime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The property default value.</p>
         */
        @NameInMap("DefaultValue")
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue;

        /**
         * <p>The property field length. You can use this parameter to constrain the maximum length of text-type property values.</p>
         * 
         * <strong>example:</strong>
         * <p>986992</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The property value input method. Valid values:</p>
         * <ul>
         * <li>CUSTOMIZED: custom input.</li>
         * <li>SINGLE_ENUM: single-select dropdown.</li>
         * <li>MULTIPLE_ENUMS: multi-select dropdown.</li>
         * <li>RANGE: range interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The property option values. This parameter applies only to properties whose input method is single-select dropdown or multi-select dropdown.</p>
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
         * <p>Indicates whether the property is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The property ID.</p>
         * 
         * <strong>example:</strong>
         * <p>711484689131</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>attr01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the property is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>Indicates whether the property is searchable.</p>
         */
        @NameInMap("Searchable")
        public Boolean searchable;

        /**
         * <p>The property value configuration details.</p>
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
         * <p>Indicates whether the maximum value is included.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>Indicates whether the minimum value is included.</p>
         */
        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <p>The maximum value. This parameter applies to range interval properties.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value. This parameter applies to range interval properties.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>The property value list. This parameter applies to properties whose input method is custom input, single-select dropdown, or multi-select dropdown.</p>
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
         * <p>The property details.</p>
         */
        @NameInMap("AttributeInfo")
        public UpsertQualityRuleRequestUpsertCommandAttributeWithValueListAttributeInfo attributeInfo;

        /**
         * <p>The property value.</p>
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
         * <p>The control type.</p>
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
         * <p>The condition node ID.</p>
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
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li>EQUAL</li>
         * <li>NOT_EQUAL</li>
         * <li>LARGER</li>
         * <li>SMALLER</li>
         * <li>LARGE_OR_EQUAL</li>
         * <li>SMALLER_OR_EQUAL</li>
         * <li>AND</li>
         * <li>OR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parent condition node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The condition type. Valid values:</p>
         * <ul>
         * <li>RELATION: relationship.</li>
         * <li>EXPRESSION: expression.</li>
         * </ul>
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
         * <p>The exception archive mode. Valid values:</p>
         * <ul>
         * <li>ONLY_ERROR_FIELD: Archives only the exception fields.</li>
         * <li>FULL_RECORD: Archives the complete record.</li>
         * </ul>
         * <p>Default value: ONLY_ERROR_FIELD.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLY_ERROR_FIELD</p>
         */
        @NameInMap("ArchiveMode")
        public String archiveMode;

        /**
         * <p>The exception archive storage type. Valid values:</p>
         * <ul>
         * <li>FILE_SYSTEM: File system.</li>
         * <li>CUSTOM_TABLE: Custom table.</li>
         * </ul>
         * <p>Default value: FILE_SYSTEM.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_SYSTEM</p>
         */
        @NameInMap("ArchiveStoreType")
        public String archiveStoreType;

        /**
         * <p>The rule business property configuration.</p>
         */
        @NameInMap("AttributeWithValueList")
        public java.util.List<UpsertQualityRuleRequestUpsertCommandAttributeWithValueList> attributeWithValueList;

        /**
         * <p>The rule catalog. Valid values:</p>
         * <ul>
         * <li>CONSISTENT: consistency.</li>
         * <li>EFFECTIVE: validity.</li>
         * <li>TIMELINESE: timeliness.</li>
         * <li>ACCURATE: accuracy.</li>
         * <li>UNIQUENESS: uniqueness.</li>
         * <li>COMPLETENESS: completeness.</li>
         * <li>STABILITY: stability.</li>
         * <li>CUSTOM: custom.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <p>The description.</p>
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
         * <p>The rule configuration key-value pairs. These are related to the templatetype. Different template types return different form key-value pair configurations.</p>
         */
        @NameInMap("FormPropertyList")
        public java.util.List<UpsertQualityRuleRequestUpsertCommandFormPropertyList> formPropertyList;

        /**
         * <p>The rule ID. If this parameter is not empty, the operation updates the rule. If this parameter is empty, the operation creates a rule.</p>
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
         * <p>The rule strength. Valid values:</p>
         * <ul>
         * <li>STRONG</li>
         * <li>WEAK</li>
         * </ul>
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
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>FIELD_NULL_VALUE_VALIDATE: field null value check.</li>
         * <li>FIELD_EMPTY_STRING_VALIDATE: field empty string check.</li>
         * <li>FIELD_UNIQUE_VALIDATE: field uniqueness check.</li>
         * <li>FIELD_GROUP_COUNT_VALIDATE: field unique value count check.</li>
         * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count check.</li>
         * <li>FUNCTION_TIME_COMPARE: time function comparison.</li>
         * <li>SINGLE_TABLE_TIME_COMPARE: single-table time field comparison.</li>
         * <li>DOUBLE_TABLE_TIME_COMPARE: two-table time field comparison.</li>
         * <li>FIELD_FORMAT_VALIDATE: field format check.</li>
         * <li>FIELD_LENGTH_VALIDATE: field length check.</li>
         * <li>FIELD_VALUE_RANGE_VALIDATE: field value range check.</li>
         * <li>CODE_TABLE_COMPARE: lookup table reference comparison.</li>
         * <li>STANDARD_CODE_TABLE_COMPARE: data standard lookup table reference comparison.</li>
         * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: single-table field value consistency comparison.</li>
         * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: single-table field statistical value consistency comparison.</li>
         * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: single-table field business logic consistency comparison.</li>
         * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: two-table field value consistency comparison.</li>
         * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: two-table field statistical value consistency comparison.</li>
         * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source two-table field statistical value consistency comparison.</li>
         * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: two-table field business logic consistency comparison.</li>
         * <li>TABLE_STABILITY_VALIDATE: table stability check.</li>
         * <li>TABLE_FLUCTUATION_VALIDATE: table fluctuation check.</li>
         * <li>FIELD_STABILITY_VALIDATE: field stability check.</li>
         * <li>FIELD_FLUCTUATION_VALIDATE: field fluctuation check.</li>
         * <li>CUSTOM_STATISTICAL_VALIDATE: custom statistical metric check.</li>
         * <li>CUSTOM_DATA_DETAILS_VALIDATE: custom data details check.</li>
         * <li>DATASOURCE_AVAILABLE_CHECK: datasource connectivity monitoring.</li>
         * <li>TABLE_SCHEMA_CHECK: table schema change monitoring.</li>
         * <li>REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison.</li>
         * <li>REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring.</li>
         * <li>REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-link comparison.</li>
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
         * <p>The ID of the associated watch.</p>
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

        public UpsertQualityRuleRequestUpsertCommand setArchiveMode(String archiveMode) {
            this.archiveMode = archiveMode;
            return this;
        }
        public String getArchiveMode() {
            return this.archiveMode;
        }

        public UpsertQualityRuleRequestUpsertCommand setArchiveStoreType(String archiveStoreType) {
            this.archiveStoreType = archiveStoreType;
            return this;
        }
        public String getArchiveStoreType() {
            return this.archiveStoreType;
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
