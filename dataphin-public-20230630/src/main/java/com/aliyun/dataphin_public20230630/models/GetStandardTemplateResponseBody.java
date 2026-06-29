// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardTemplateResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
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

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The template details.</p>
     */
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
         * <p>The field to check.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>Indicates whether the check is case-sensitive.</p>
         */
        @NameInMap("IsCaseSensitive")
        public Boolean isCaseSensitive;

        /**
         * <p>The monitoring method. Valid values:</p>
         * <ul>
         * <li>METADATA: metadata monitoring.</li>
         * <li>QUALITY: data quality monitoring.</li>
         * </ul>
         * 
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
         * <p>The standard ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The version number.</p>
         * 
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
         * <p>The attribute source. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system attribute.</li>
         * <li>CUSTOM: custom attribute.</li>
         * <li>STANDARD: standard.</li>
         * </ul>
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
        /**
         * <p>The attribute source.</p>
         */
        @NameInMap("AttributeFromInfo")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttributeAttributeFromInfo attributeFromInfo;

        /**
         * <p>The attribute ID.</p>
         * 
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
         * <p>The referenced lookup table field.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The lookup table ID.</p>
         * 
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
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value.</p>
         * 
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
         * <p>The value range. This parameter takes effect when the value source is set to DATAPHIN_ATTRIBUTE. Valid values:</p>
         * <ul>
         * <li>BIZ_UNIT: data domain.</li>
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
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeLookupTableReference lookupTableReference;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to MIN_MAX.</p>
         */
        @NameInMap("MinMaxValueConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

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
         * <p>The data type of the attribute value. Valid values:</p>
         * <ul>
         * <li>STRING: string.</li>
         * <li>BIGINT: numeric.</li>
         * <li>DOUBLE: floating-point.</li>
         * <li>DATE: date, accurate to the day.</li>
         * <li>DATETIME: date, accurate to the millisecond.</li>
         * <li>BOOLEAN: Boolean.</li>
         * </ul>
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
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value range.</p>
         */
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
         * <p>The attribute code.</p>
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
         * <p>Indicates whether monitoring configuration is enabled.</p>
         */
        @NameInMap("EnableMonitorConfig")
        public Boolean enableMonitorConfig;

        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The monitoring configuration.</p>
         */
        @NameInMap("MonitorConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListMonitorConfig monitorConfig;

        /**
         * <p>The attribute name.</p>
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
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfigAttributeListRefAttribute refAttribute;

        /**
         * <p>Indicates whether the attribute is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The attribute type. Valid values:</p>
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
         * <p>The value configuration.</p>
         */
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
        /**
         * <p>The list of attributes.</p>
         */
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
         * <p>The number of digits.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Digit")
        public Integer digit;

        /**
         * <p>Indicates whether zero-padding is required.</p>
         */
        @NameInMap("NeedPaddingZero")
        public Boolean needPaddingZero;

        /**
         * <p>The start value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartValue")
        public Long startValue;

        /**
         * <p>The step size.</p>
         * 
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
        /**
         * <p>The auto-increment sequence configuration.</p>
         */
        @NameInMap("AutoIncrementSequenceConfig")
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleListAutoIncrementSequenceConfig autoIncrementSequenceConfig;

        /**
         * <p>The position index of the code rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The code rule type. Valid values:</p>
         * <ul>
         * <li>FIXED_STRING: fixed string.</li>
         * <li>AUTO_INCREMENT: auto-increment sequence.</li>
         * <li>STANDARD_SET_CODE: standard set code.</li>
         * </ul>
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
        /**
         * <p>The standard code rules.</p>
         */
        @NameInMap("CodeRuleList")
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfigCodeRuleList> codeRuleList;

        /**
         * <p>Indicates whether strong validation is required.</p>
         */
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
        /**
         * <p>The auto-generation configuration for the standard code rule. This parameter takes effect when the generation method is set to AUTO_GENERATE.</p>
         */
        @NameInMap("AutoConfig")
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfigAutoConfig autoConfig;

        /**
         * <p>The standard code generation method. Valid values:</p>
         * <ul>
         * <li>CUSTOMIZED: custom.</li>
         * <li>AUTO_GENERATE: automatically generated based on the standard code rule.</li>
         * </ul>
         * 
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
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
        /**
         * <p>The attribute configuration.</p>
         */
        @NameInMap("AttributesConfig")
        public GetStandardTemplateResponseBodyTemplateInfoAttributesConfig attributesConfig;

        /**
         * <p>The code of the standard template. This value is globally unique and cannot be modified when references exist.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The auto-generation rule configuration for the standard code.</p>
         */
        @NameInMap("CodeRuleConfig")
        public GetStandardTemplateResponseBodyTemplateInfoCodeRuleConfig codeRuleConfig;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         */
        @NameInMap("Creator")
        public GetStandardTemplateResponseBodyTemplateInfoCreator creator;

        /**
         * <p>The description of the standard template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The standard template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modifier.</p>
         */
        @NameInMap("LastModifier")
        public GetStandardTemplateResponseBodyTemplateInfoLastModifier lastModifier;

        /**
         * <p>The list of maintainers.</p>
         */
        @NameInMap("MaintainerList")
        public java.util.List<GetStandardTemplateResponseBodyTemplateInfoMaintainerList> maintainerList;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the standard template.</p>
         * 
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source of the standard template. Valid values:</p>
         * <ul>
         * <li>CUSTOM: custom standard template.</li>
         * <li>SYSTEM: system built-in standard template.</li>
         * </ul>
         * 
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
         * <p>The version number.</p>
         * 
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
