// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardTemplateRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardTemplateRequestCreateCommand createCommand;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateStandardTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardTemplateRequest self = new CreateStandardTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardTemplateRequest setCreateCommand(CreateStandardTemplateRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardTemplateRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateStandardTemplateRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference extends TeaModel {
        /**
         * <p>The ID of the standard.</p>
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

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo extends TeaModel {
        /**
         * <p>The source of the attribute. Valid values: SYSTEM (system attribute), CUSTOM (custom attribute), and STANDARD (standard).</p>
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
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference standardReference;

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo setAttributeFrom(String attributeFrom) {
            this.attributeFrom = attributeFrom;
            return this;
        }
        public String getAttributeFrom() {
            return this.attributeFrom;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo setStandardReference(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference standardReference) {
            this.standardReference = standardReference;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference getStandardReference() {
            return this.standardReference;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute extends TeaModel {
        /**
         * <p>The source of the attribute.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeFromInfo")
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo;

        /**
         * <p>The ID of the attribute.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute setAttributeFromInfo(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo) {
            this.attributeFromInfo = attributeFromInfo;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo getAttributeFromInfo() {
            return this.attributeFromInfo;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference extends TeaModel {
        /**
         * <p>The referenced field in the lookup table.</p>
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

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference setLookupTableId(Long lookupTableId) {
            this.lookupTableId = lookupTableId;
            return this;
        }
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig extends TeaModel {
        /**
         * <p>Specifies whether to include the maximum value.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>Specifies whether to include the minimum value.</p>
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

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange extends TeaModel {
        /**
         * <p>The value range. This parameter takes effect when the value source is set to DATAPHIN_ATTRIBUTE. Valid values: BIZ_UNIT (business unit), PROJECT (project), USER (user), and USER_GROUP (user group).</p>
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
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to MIN_MAX.</p>
         */
        @NameInMap("MinMaxValueConfig")
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

        /**
         * <p>The value source. Valid values: NONE (no constraint), LIST (obtained from a list), LOOKUP_TABLE (lookup table), MIN_MAX (value between the maximum and minimum values), DATAPHIN_ATTRIBUTE (Dataphin system property), BUILT_IN_DATA_TYPES (built-in data type), BUILT_IN_DATA_CLASSIFICATION (built-in data categorization), and BUILT_IN_DATA_LEVEL (built-in data security classification).</p>
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

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange setDataphinAttributeType(String dataphinAttributeType) {
            this.dataphinAttributeType = dataphinAttributeType;
            return this;
        }
        public String getDataphinAttributeType() {
            return this.dataphinAttributeType;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange setLookupTableReference(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference) {
            this.lookupTableReference = lookupTableReference;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference getLookupTableReference() {
            return this.lookupTableReference;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange setMinMaxValueConfig(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig) {
            this.minMaxValueConfig = minMaxValueConfig;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig getMinMaxValueConfig() {
            return this.minMaxValueConfig;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange setValueConstraint(String valueConstraint) {
            this.valueConstraint = valueConstraint;
            return this;
        }
        public String getValueConstraint() {
            return this.valueConstraint;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig extends TeaModel {
        /**
         * <p>The data type of the attribute value. Valid values: STRING (string), BIGINT (numeric), DOUBLE (floating-point), DATE (date, accurate to the day), DATETIME (date and time, accurate to the millisecond), and BOOLEAN (Boolean).</p>
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
         * <p>The length of the attribute value. An empty value or -1 indicates that the length is not limited. Typically, the length is limited only for string types.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The attribute value type. Valid values: CUSTOMIZED (custom input), SINGLE_ENUM (single enumerated value), MULTIPLE_ENUMS (multiple enumerated values), and RANGE (range value).</p>
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
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange valueRange;

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig setValueRange(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfigValueRange getValueRange() {
            return this.valueRange;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList extends TeaModel {
        /**
         * <p>The attribute code. This parameter is not required when a common attribute is referenced.</p>
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
         * <p>The attribute name. This parameter is not required when a common attribute is referenced.</p>
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
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute refAttribute;

        /**
         * <p>Specifies whether the attribute is required. This parameter is not required when a common attribute is referenced.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The attribute type. Valid values: BIZ_ATTRIBUTE (business attribute), TECH_ATTRIBUTE (technical attribute), MANAGEMENT_ATTRIBUTE (management attribute), QUALITY_ATTRIBUTE (quality attribute), MASTER_DATA_ATTRIBUTE (master data attribute), LIFECYCLE_ATTRIBUTE (lifecycle attribute), and SECURITY_ATTRIBUTE (security attribute). This parameter is not required when a common attribute is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_ATTRIBUTE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value configuration. This parameter is not required when a common attribute is referenced.</p>
         */
        @NameInMap("ValueConfig")
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig valueConfig;

        public static CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList self = new CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setRefAttribute(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute refAttribute) {
            this.refAttribute = refAttribute;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListRefAttribute getRefAttribute() {
            return this.refAttribute;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList setValueConfig(CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeListValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandAttributesConfig extends TeaModel {
        /**
         * <p>The attribute list.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeList")
        public java.util.List<CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList> attributeList;

        public static CreateStandardTemplateRequestCreateCommandAttributesConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandAttributesConfig self = new CreateStandardTemplateRequestCreateCommandAttributesConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandAttributesConfig setAttributeList(java.util.List<CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<CreateStandardTemplateRequestCreateCommandAttributesConfigAttributeList> getAttributeList() {
            return this.attributeList;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig extends TeaModel {
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

        public static CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig self = new CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setDigit(Integer digit) {
            this.digit = digit;
            return this;
        }
        public Integer getDigit() {
            return this.digit;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setNeedPaddingZero(Boolean needPaddingZero) {
            this.needPaddingZero = needPaddingZero;
            return this;
        }
        public Boolean getNeedPaddingZero() {
            return this.needPaddingZero;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setStartValue(Long startValue) {
            this.startValue = startValue;
            return this;
        }
        public Long getStartValue() {
            return this.startValue;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList extends TeaModel {
        /**
         * <p>The auto-increment sequence configuration.</p>
         */
        @NameInMap("AutoIncrementSequenceConfig")
        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig;

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
         * <p>The type of the code rule. Valid values: FIXED_STRING: Fixed string. AUTO_INCREMENT: Auto-increment sequence. STANDARD_SET_CODE: Standard set code.</p>
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

        public static CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList self = new CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList setAutoIncrementSequenceConfig(CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig) {
            this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig getAutoIncrementSequenceConfig() {
            return this.autoIncrementSequenceConfig;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig extends TeaModel {
        /**
         * <p>The standard code rules.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CodeRuleList")
        public java.util.List<CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList> codeRuleList;

        /**
         * <p>Specifies whether strict validation is enabled.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NeedStrongValidate")
        public Boolean needStrongValidate;

        public static CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig self = new CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig setCodeRuleList(java.util.List<CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList> codeRuleList) {
            this.codeRuleList = codeRuleList;
            return this;
        }
        public java.util.List<CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfigCodeRuleList> getCodeRuleList() {
            return this.codeRuleList;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig setNeedStrongValidate(Boolean needStrongValidate) {
            this.needStrongValidate = needStrongValidate;
            return this;
        }
        public Boolean getNeedStrongValidate() {
            return this.needStrongValidate;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandCodeRuleConfig extends TeaModel {
        /**
         * <p>The auto-generation configuration for standard code rules. This configuration takes effect only when the generation method is set to AUTO_GENERATE.</p>
         */
        @NameInMap("AutoConfig")
        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig autoConfig;

        /**
         * <p>The standard code generation method. Valid values: CUSTOMIZED: Custom. AUTO_GENERATE: Automatically generated based on standard code rules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("GenerateType")
        public String generateType;

        public static CreateStandardTemplateRequestCreateCommandCodeRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandCodeRuleConfig self = new CreateStandardTemplateRequestCreateCommandCodeRuleConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfig setAutoConfig(CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig autoConfig) {
            this.autoConfig = autoConfig;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandCodeRuleConfigAutoConfig getAutoConfig() {
            return this.autoConfig;
        }

        public CreateStandardTemplateRequestCreateCommandCodeRuleConfig setGenerateType(String generateType) {
            this.generateType = generateType;
            return this;
        }
        public String getGenerateType() {
            return this.generateType;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommandPublishInfo extends TeaModel {
        /**
         * <p>The release comment.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        public static CreateStandardTemplateRequestCreateCommandPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommandPublishInfo self = new CreateStandardTemplateRequestCreateCommandPublishInfo();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommandPublishInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

    }

    public static class CreateStandardTemplateRequestCreateCommand extends TeaModel {
        /**
         * <p>The attribute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributesConfig")
        public CreateStandardTemplateRequestCreateCommandAttributesConfig attributesConfig;

        /**
         * <p>The standard template code. It is globally unique and cannot be modified when referenced.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The standard code auto-generation rule configuration.</p>
         */
        @NameInMap("CodeRuleConfig")
        public CreateStandardTemplateRequestCreateCommandCodeRuleConfig codeRuleConfig;

        /**
         * <p>The standard template description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maintainers.</p>
         */
        @NameInMap("MaintainerList")
        public java.util.List<String> maintainerList;

        /**
         * <p>The standard template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The release information of the standard template.</p>
         */
        @NameInMap("PublishInfo")
        public CreateStandardTemplateRequestCreateCommandPublishInfo publishInfo;

        public static CreateStandardTemplateRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardTemplateRequestCreateCommand self = new CreateStandardTemplateRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardTemplateRequestCreateCommand setAttributesConfig(CreateStandardTemplateRequestCreateCommandAttributesConfig attributesConfig) {
            this.attributesConfig = attributesConfig;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandAttributesConfig getAttributesConfig() {
            return this.attributesConfig;
        }

        public CreateStandardTemplateRequestCreateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateStandardTemplateRequestCreateCommand setCodeRuleConfig(CreateStandardTemplateRequestCreateCommandCodeRuleConfig codeRuleConfig) {
            this.codeRuleConfig = codeRuleConfig;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandCodeRuleConfig getCodeRuleConfig() {
            return this.codeRuleConfig;
        }

        public CreateStandardTemplateRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardTemplateRequestCreateCommand setMaintainerList(java.util.List<String> maintainerList) {
            this.maintainerList = maintainerList;
            return this;
        }
        public java.util.List<String> getMaintainerList() {
            return this.maintainerList;
        }

        public CreateStandardTemplateRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateStandardTemplateRequestCreateCommand setPublishInfo(CreateStandardTemplateRequestCreateCommandPublishInfo publishInfo) {
            this.publishInfo = publishInfo;
            return this;
        }
        public CreateStandardTemplateRequestCreateCommandPublishInfo getPublishInfo() {
            return this.publishInfo;
        }

    }

}
