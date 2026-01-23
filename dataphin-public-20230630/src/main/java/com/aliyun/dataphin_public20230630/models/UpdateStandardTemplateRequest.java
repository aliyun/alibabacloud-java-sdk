// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("AttributeFrom")
        public String attributeFrom;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeFromInfo")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo;

        /**
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
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
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
         * <strong>example:</strong>
         * <p>DATAPHIN_ATTRIBUTE</p>
         */
        @NameInMap("DataphinAttributeType")
        public String dataphinAttributeType;

        @NameInMap("LookupTableReference")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference;

        @NameInMap("MinMaxValueConfig")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ValueConstraint")
        public String valueConstraint;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>test_attr</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>attr1</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RefAttribute")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfigAttributeListRefAttribute refAttribute;

        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>BIZ_ATTRIBUTE</p>
         */
        @NameInMap("Type")
        public String type;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Digit")
        public Integer digit;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NeedPaddingZero")
        public Boolean needPaddingZero;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartValue")
        public Long startValue;

        /**
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
        @NameInMap("AutoIncrementSequenceConfig")
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXED_STRING</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("CodeRuleList")
        public java.util.List<UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfigCodeRuleList> codeRuleList;

        /**
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
        @NameInMap("AutoConfig")
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfigAutoConfig autoConfig;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributesConfig")
        public UpdateStandardTemplateRequestUpdateCommandAttributesConfig attributesConfig;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("CodeRuleConfig")
        public UpdateStandardTemplateRequestUpdateCommandCodeRuleConfig codeRuleConfig;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("MaintainerList")
        public java.util.List<String> maintainerList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PublishInfo")
        public UpdateStandardTemplateRequestUpdateCommandPublishInfo publishInfo;

        /**
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
