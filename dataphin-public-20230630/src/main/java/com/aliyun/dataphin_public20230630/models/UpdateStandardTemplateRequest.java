// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardTemplateRequest extends TeaModel {
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
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateStandardTemplateRequestUpdateCommand updateCommand;

    public static UpdateStandardTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardTemplateRequest self = new UpdateStandardTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateStandardTemplateRequest setUpdateCommand(UpdateStandardTemplateRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateStandardTemplateRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference extends TeaModel {
        /**
         * <p>The standard ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The version number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo extends TeaModel {
        /**
         * <p>The attribute source. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system attribute.</li>
         * <li>CUSTOM: custom attribute.</li>
         * <li>STANDARD: standard.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("AttributeFrom")
        public String attributeFrom;

        /**
         * <p>The corresponding standard. This parameter takes effect when the attribute source is set to STANDARD.</p>
         */
        @NameInMap("StandardReference")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference standardReference;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo setAttributeFrom(String attributeFrom) {
            this.attributeFrom = attributeFrom;
            return this;
        }
        public String getAttributeFrom() {
            return this.attributeFrom;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo setStandardReference(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference standardReference) {
            this.standardReference = standardReference;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference getStandardReference() {
            return this.standardReference;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute extends TeaModel {
        /**
         * <p>The attribute source.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeFromInfo")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo;

        /**
         * <p>The attribute ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute setAttributeFromInfo(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo) {
            this.attributeFromInfo = attributeFromInfo;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo getAttributeFromInfo() {
            return this.attributeFromInfo;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference extends TeaModel {
        /**
         * <p>The referenced lookup table field.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The ID of the lookup table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("LookupTableId")
        public Long lookupTableId;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference setLookupTableId(Long lookupTableId) {
            this.lookupTableId = lookupTableId;
            return this;
        }
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig extends TeaModel {
        /**
         * <p>Specifies whether the maximum value is included.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>Specifies whether the minimum value is included.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <p>The maximum value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange extends TeaModel {
        /**
         * <p>The value range. This parameter takes effect when the value source is set to DATAPHIN_ATTRIBUTE. Valid values:</p>
         * <ul>
         * <li>BIZ_UNIT: data board.</li>
         * <li>PROJECT: project.</li>
         * <li>USER: user.</li>
         * <li>USER_GROUP: user group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATAPHIN_ATTRIBUTE</p>
         */
        @NameInMap("DataphinAttributeType")
        public String dataphinAttributeType;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to LOOKUP_TABLE.</p>
         */
        @NameInMap("LookupTableReference")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to MIN_MAX.</p>
         */
        @NameInMap("MinMaxValueConfig")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

        /**
         * <p>The value source. Valid values:</p>
         * <ul>
         * <li>NONE: no constraint.</li>
         * <li>LIST: obtained from a list.</li>
         * <li>LOOKUP_TABLE: lookup table.</li>
         * <li>MIN_MAX: value between the minimum and maximum.</li>
         * <li>DATAPHIN_ATTRIBUTE: Dataphin system property.</li>
         * <li>BUILT_IN_DATA_TYPES: built-in data types.</li>
         * <li>BUILT_IN_DATA_CLASSIFICATION: built-in data categorization.</li>
         * <li>BUILT_IN_DATA_LEVEL: built-in data security classification.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ValueConstraint")
        public String valueConstraint;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to LIST.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange setDataphinAttributeType(String dataphinAttributeType) {
            this.dataphinAttributeType = dataphinAttributeType;
            return this;
        }
        public String getDataphinAttributeType() {
            return this.dataphinAttributeType;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange setLookupTableReference(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference) {
            this.lookupTableReference = lookupTableReference;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference getLookupTableReference() {
            return this.lookupTableReference;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange setMinMaxValueConfig(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig) {
            this.minMaxValueConfig = minMaxValueConfig;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig getMinMaxValueConfig() {
            return this.minMaxValueConfig;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange setValueConstraint(String valueConstraint) {
            this.valueConstraint = valueConstraint;
            return this;
        }
        public String getValueConstraint() {
            return this.valueConstraint;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig extends TeaModel {
        /**
         * <p>The data type of the attribute value. Valid values:</p>
         * <ul>
         * <li>STRING: string.</li>
         * <li>BIGINT: numeric.</li>
         * <li>DOUBLE: floating-point.</li>
         * <li>DATE: date, accurate to the day.</li>
         * <li>DATETIME: date, accurate to milliseconds.</li>
         * <li>BOOLEAN: Boolean.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The length of the attribute value. If this parameter is left empty or set to -1, the length is not limited. Typically, only string types have a length limit for attribute values.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The attribute value type. Valid values:</p>
         * <ul>
         * <li>CUSTOMIZED: custom input.</li>
         * <li>SINGLE_ENUM: single enumeration value.</li>
         * <li>MULTIPLE_ENUMS: multiple enumeration values.</li>
         * <li>RANGE: range value.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value range.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ValueRange")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange valueRange;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig setValueRange(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRange getValueRange() {
            return this.valueRange;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList extends TeaModel {
        /**
         * <p>The attribute code. This parameter is optional when a common attribute is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>test_attr</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The attribute name. This parameter is optional when a common attribute is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>attr1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The referenced attribute information.</p>
         */
        @NameInMap("RefAttribute")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute refAttribute;

        /**
         * <p>Specifies whether the attribute is required. This parameter is optional when a common attribute is referenced.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The attribute type. This parameter is optional when a common attribute is referenced. Valid values:</p>
         * <ul>
         * <li>BIZ_ATTRIBUTE: business attribute.</li>
         * <li>TECH_ATTRIBUTE: technical attribute.</li>
         * <li>MANAGEMENT_ATTRIBUTE: management attribute.</li>
         * <li>QUALITY_ATTRIBUTE: quality attribute.</li>
         * <li>MASTER_DATA_ATTRIBUTE: master data attribute.</li>
         * <li>LIFECYCLE_ATTRIBUTE: lifecycle attribute.</li>
         * <li>SECURITY_ATTRIBUTE: security attribute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BIZ_ATTRIBUTE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value configuration. This parameter is optional when a common attribute is referenced.</p>
         */
        @NameInMap("ValueConfig")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig valueConfig;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setRefAttribute(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute refAttribute) {
            this.refAttribute = refAttribute;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute getRefAttribute() {
            return this.refAttribute;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList setValueConfig(UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandAttributesConfig extends TeaModel {
        /**
         * <p>The list of attributes.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeList")
        public java.util.List<UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList> attributeList;

        public static UpdateStandardTemplateRequestUpdateCommandAttributesConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandAttributesConfig self = new UpdateStandardTemplateRequestUpdateCommandAttributesConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandAttributesConfig setAttributeList(java.util.List<UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeList> getAttributeList() {
            return this.attributeList;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig extends TeaModel {
        /**
         * <p>The number of digits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Digit")
        public Integer digit;

        /**
         * <p>Specifies whether to pad with zeros.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NeedPaddingZero")
        public Boolean needPaddingZero;

        /**
         * <p>The start value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartValue")
        public Long startValue;

        /**
         * <p>The step size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig self = new UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setDigit(Integer digit) {
            this.digit = digit;
            return this;
        }
        public Integer getDigit() {
            return this.digit;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setNeedPaddingZero(Boolean needPaddingZero) {
            this.needPaddingZero = needPaddingZero;
            return this;
        }
        public Boolean getNeedPaddingZero() {
            return this.needPaddingZero;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setStartValue(Long startValue) {
            this.startValue = startValue;
            return this;
        }
        public Long getStartValue() {
            return this.startValue;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList extends TeaModel {
        /**
         * <p>The auto-increment sequence configuration.</p>
         */
        @NameInMap("AutoIncrementSequenceConfig")
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig;

        /**
         * <p>The position index of the code rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The type of the code rule. Valid values:</p>
         * <ul>
         * <li>FIXED_STRING: fixed string.</li>
         * <li>AUTO_INCREMENT: auto-increment sequence.</li>
         * <li>STANDARD_SET_CODE: standard set code.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXED_STRING</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The format or value of the code rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList self = new UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList setAutoIncrementSequenceConfig(UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig) {
            this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig getAutoIncrementSequenceConfig() {
            return this.autoIncrementSequenceConfig;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig extends TeaModel {
        /**
         * <p>The standard code rules.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CodeRuleList")
        public java.util.List<UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList> codeRuleList;

        /**
         * <p>Specifies whether strict validation is required.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NeedStrongValidate")
        public Boolean needStrongValidate;

        public static UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig self = new UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig setCodeRuleList(java.util.List<UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList> codeRuleList) {
            this.codeRuleList = codeRuleList;
            return this;
        }
        public java.util.List<UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList> getCodeRuleList() {
            return this.codeRuleList;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig setNeedStrongValidate(Boolean needStrongValidate) {
            this.needStrongValidate = needStrongValidate;
            return this;
        }
        public Boolean getNeedStrongValidate() {
            return this.needStrongValidate;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig extends TeaModel {
        /**
         * <p>The automatic generation configuration for standard code rules. This parameter takes effect when the generation method is set to AUTO_GENERATE.</p>
         */
        @NameInMap("AutoConfig")
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig autoConfig;

        /**
         * <p>The standard code generation method. Valid values:</p>
         * <ul>
         * <li>CUSTOMIZED: custom.</li>
         * <li>AUTO_GENERATE: automatically generated based on standard code rules.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("GenerateType")
        public String generateType;

        public static UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig self = new UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig setAutoConfig(UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig autoConfig) {
            this.autoConfig = autoConfig;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig getAutoConfig() {
            return this.autoConfig;
        }

        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig setGenerateType(String generateType) {
            this.generateType = generateType;
            return this;
        }
        public String getGenerateType() {
            return this.generateType;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommandPublishInfo extends TeaModel {
        /**
         * <p>The publish comment.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        public static UpdateStandardTemplateRequestUpdateCommandPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommandPublishInfo self = new UpdateStandardTemplateRequestUpdateCommandPublishInfo();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommandPublishInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

    }

    public static class UpdateStandardTemplateRequestUpdateCommand extends TeaModel {
        /**
         * <p>The attribute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributesConfig")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfig attributesConfig;

        /**
         * <p>The code of the standard template. The code must be globally unique. The code cannot be modified if the template is referenced.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The configuration for automatic generation of standard codes.</p>
         */
        @NameInMap("CodeRuleConfig")
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig codeRuleConfig;

        /**
         * <p>The description of the standard template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the standard template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The list of maintainers.</p>
         */
        @NameInMap("MaintainerList")
        public java.util.List<String> maintainerList;

        /**
         * <p>The name of the standard template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The publish information of the standard template.</p>
         */
        @NameInMap("PublishInfo")
        public UpdateStandardTemplateRequestUpdateCommandPublishInfo publishInfo;

        /**
         * <p>The version number. If this parameter is left empty or set to -1, the latest version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static UpdateStandardTemplateRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardTemplateRequestUpdateCommand self = new UpdateStandardTemplateRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateStandardTemplateRequestUpdateCommand setAttributesConfig(UpdateStandardTemplateRequestUpdateCommandAttributesConfig attributesConfig) {
            this.attributesConfig = attributesConfig;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfig getAttributesConfig() {
            return this.attributesConfig;
        }

        public UpdateStandardTemplateRequestUpdateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateStandardTemplateRequestUpdateCommand setCodeRuleConfig(UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig codeRuleConfig) {
            this.codeRuleConfig = codeRuleConfig;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig getCodeRuleConfig() {
            return this.codeRuleConfig;
        }

        public UpdateStandardTemplateRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardTemplateRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateStandardTemplateRequestUpdateCommand setMaintainerList(java.util.List<String> maintainerList) {
            this.maintainerList = maintainerList;
            return this;
        }
        public java.util.List<String> getMaintainerList() {
            return this.maintainerList;
        }

        public UpdateStandardTemplateRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardTemplateRequestUpdateCommand setPublishInfo(UpdateStandardTemplateRequestUpdateCommandPublishInfo publishInfo) {
            this.publishInfo = publishInfo;
            return this;
        }
        public UpdateStandardTemplateRequestUpdateCommandPublishInfo getPublishInfo() {
            return this.publishInfo;
        }

        public UpdateStandardTemplateRequestUpdateCommand setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
