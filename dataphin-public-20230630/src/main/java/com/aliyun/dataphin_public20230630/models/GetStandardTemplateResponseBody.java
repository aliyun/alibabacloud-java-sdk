// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TemplateInfo")
    public GetStandardTemplateResponseBodyTemplateInfo templateInfo;

    public static GetStandardTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardTemplateResponseBody self = new GetStandardTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStandardTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStandardTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandardTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStandardTemplateResponseBody setTemplateInfo(GetStandardTemplateResponseBodyTemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public GetStandardTemplateResponseBodyTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsCaseSensitive")
        public Boolean isCaseSensitive;

        /**
         * <strong>example:</strong>
         * <p>METADATA</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig setIsCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("AttributeFrom")
        public String attributeFrom;

        @NameInMap("StandardReference")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference standardReference;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo setAttributeFrom(String attributeFrom) {
            this.attributeFrom = attributeFrom;
            return this;
        }
        public String getAttributeFrom() {
            return this.attributeFrom;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo setStandardReference(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference standardReference) {
            this.standardReference = standardReference;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfoStandardReference getStandardReference() {
            return this.standardReference;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute extends TeaModel {
        @NameInMap("AttributeFromInfo")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute setAttributeFromInfo(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo) {
            this.attributeFromInfo = attributeFromInfo;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo getAttributeFromInfo() {
            return this.attributeFromInfo;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("LookupTableId")
        public Long lookupTableId;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference setLookupTableId(Long lookupTableId) {
            this.lookupTableId = lookupTableId;
            return this;
        }
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig extends TeaModel {
        @NameInMap("IncludeMaxValue")
        public Boolean includeMaxValue;

        @NameInMap("IncludeMinValue")
        public Boolean includeMinValue;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DATAPHIN_ATTRIBUTE</p>
         */
        @NameInMap("DataphinAttributeType")
        public String dataphinAttributeType;

        @NameInMap("LookupTableReference")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference;

        @NameInMap("MinMaxValueConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ValueConstraint")
        public String valueConstraint;

        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange setDataphinAttributeType(String dataphinAttributeType) {
            this.dataphinAttributeType = dataphinAttributeType;
            return this;
        }
        public String getDataphinAttributeType() {
            return this.dataphinAttributeType;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange setLookupTableReference(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference) {
            this.lookupTableReference = lookupTableReference;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference getLookupTableReference() {
            return this.lookupTableReference;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange setMinMaxValueConfig(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig) {
            this.minMaxValueConfig = minMaxValueConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig getMinMaxValueConfig() {
            return this.minMaxValueConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange setValueConstraint(String valueConstraint) {
            this.valueConstraint = valueConstraint;
            return this;
        }
        public String getValueConstraint() {
            return this.valueConstraint;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("ValueRange")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange valueRange;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig setValueRange(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRange getValueRange() {
            return this.valueRange;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList extends TeaModel {
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

        @NameInMap("EnableMonitorConfig")
        public Boolean enableMonitorConfig;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("MonitorConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig monitorConfig;

        /**
         * <strong>example:</strong>
         * <p>attr1</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RefAttribute")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute refAttribute;

        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>BIZ_ATTRIBUTE</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("ValueConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig valueConfig;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setEnableMonitorConfig(Boolean enableMonitorConfig) {
            this.enableMonitorConfig = enableMonitorConfig;
            return this;
        }
        public Boolean getEnableMonitorConfig() {
            return this.enableMonitorConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setMonitorConfig(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setRefAttribute(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute refAttribute) {
            this.refAttribute = refAttribute;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute getRefAttribute() {
            return this.refAttribute;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList setValueConfig(GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoAttributesConfig extends TeaModel {
        @NameInMap("AttributeList")
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList> attributeList;

        public static GetStandardTemplateResponseBodyTemplateInfoAttributesConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoAttributesConfig self = new GetStandardTemplateResponseBodyTemplateInfoAttributesConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfig setAttributeList(java.util.List<GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeList> getAttributeList() {
            return this.attributeList;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Digit")
        public Integer digit;

        @NameInMap("NeedPaddingZero")
        public Boolean needPaddingZero;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartValue")
        public Long startValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig self = new GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setDigit(Integer digit) {
            this.digit = digit;
            return this;
        }
        public Integer getDigit() {
            return this.digit;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setNeedPaddingZero(Boolean needPaddingZero) {
            this.needPaddingZero = needPaddingZero;
            return this;
        }
        public Boolean getNeedPaddingZero() {
            return this.needPaddingZero;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setStartValue(Long startValue) {
            this.startValue = startValue;
            return this;
        }
        public Long getStartValue() {
            return this.startValue;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList extends TeaModel {
        @NameInMap("AutoIncrementSequenceConfig")
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
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

        public static GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList self = new GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList setAutoIncrementSequenceConfig(GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig) {
            this.autoIncrementSequenceConfig = autoIncrementSequenceConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig getAutoIncrementSequenceConfig() {
            return this.autoIncrementSequenceConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig extends TeaModel {
        @NameInMap("CodeRuleList")
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList> codeRuleList;

        @NameInMap("NeedStrongValidate")
        public Boolean needStrongValidate;

        public static GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig self = new GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig setCodeRuleList(java.util.List<GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList> codeRuleList) {
            this.codeRuleList = codeRuleList;
            return this;
        }
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList> getCodeRuleList() {
            return this.codeRuleList;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig setNeedStrongValidate(Boolean needStrongValidate) {
            this.needStrongValidate = needStrongValidate;
            return this;
        }
        public Boolean getNeedStrongValidate() {
            return this.needStrongValidate;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig extends TeaModel {
        @NameInMap("AutoConfig")
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig autoConfig;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("GenerateType")
        public String generateType;

        public static GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig self = new GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig setAutoConfig(GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig autoConfig) {
            this.autoConfig = autoConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig getAutoConfig() {
            return this.autoConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig setGenerateType(String generateType) {
            this.generateType = generateType;
            return this;
        }
        public String getGenerateType() {
            return this.generateType;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardTemplateResponseBodyTemplateInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoCreator self = new GetStandardTemplateResponseBodyTemplateInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardTemplateResponseBodyTemplateInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoLastModifier extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardTemplateResponseBodyTemplateInfoLastModifier build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoLastModifier self = new GetStandardTemplateResponseBodyTemplateInfoLastModifier();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoLastModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardTemplateResponseBodyTemplateInfoLastModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfoMaintainerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardTemplateResponseBodyTemplateInfoMaintainerList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfoMaintainerList self = new GetStandardTemplateResponseBodyTemplateInfoMaintainerList();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfoMaintainerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardTemplateResponseBodyTemplateInfoMaintainerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardTemplateResponseBodyTemplateInfo extends TeaModel {
        @NameInMap("AttributesConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfig attributesConfig;

        /**
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("CodeRuleConfig")
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig codeRuleConfig;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public GetStandardTemplateResponseBodyTemplateInfoCreator creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LastModifier")
        public GetStandardTemplateResponseBodyTemplateInfoLastModifier lastModifier;

        @NameInMap("MaintainerList")
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoMaintainerList> maintainerList;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("TemplateFrom")
        public String templateFrom;

        /**
         * <p>uniqueId</p>
         * 
         * <strong>example:</strong>
         * <p>1101</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardTemplateResponseBodyTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateResponseBodyTemplateInfo self = new GetStandardTemplateResponseBodyTemplateInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateResponseBodyTemplateInfo setAttributesConfig(GetStandardTemplateResponseBodyTemplateInfoAttributesConfig attributesConfig) {
            this.attributesConfig = attributesConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfig getAttributesConfig() {
            return this.attributesConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setCodeRuleConfig(GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig codeRuleConfig) {
            this.codeRuleConfig = codeRuleConfig;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig getCodeRuleConfig() {
            return this.codeRuleConfig;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setCreator(GetStandardTemplateResponseBodyTemplateInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoCreator getCreator() {
            return this.creator;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setLastModifier(GetStandardTemplateResponseBodyTemplateInfoLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public GetStandardTemplateResponseBodyTemplateInfoLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setMaintainerList(java.util.List<GetStandardTemplateResponseBodyTemplateInfoMaintainerList> maintainerList) {
            this.maintainerList = maintainerList;
            return this;
        }
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoMaintainerList> getMaintainerList() {
            return this.maintainerList;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setTemplateFrom(String templateFrom) {
            this.templateFrom = templateFrom;
            return this;
        }
        public String getTemplateFrom() {
            return this.templateFrom;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public GetStandardTemplateResponseBodyTemplateInfo setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
