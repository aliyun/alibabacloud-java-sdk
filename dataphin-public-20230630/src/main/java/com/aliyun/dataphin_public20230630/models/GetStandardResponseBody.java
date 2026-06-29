// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardResponseBody extends TeaModel {
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
     * <p>The standard details.</p>
     */
    @NameInMap("StandardInfo")
    public GetStandardResponseBodyStandardInfo standardInfo;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStandardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardResponseBody self = new GetStandardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStandardResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStandardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardResponseBody setStandardInfo(GetStandardResponseBodyStandardInfo standardInfo) {
        this.standardInfo = standardInfo;
        return this;
    }
    public GetStandardResponseBodyStandardInfo getStandardInfo() {
        return this.standardInfo;
    }

    public GetStandardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig setIsCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo extends TeaModel {
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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference standardReference;

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo setAttributeFrom(String attributeFrom) {
            this.attributeFrom = attributeFrom;
            return this;
        }
        public String getAttributeFrom() {
            return this.attributeFrom;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo setStandardReference(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference standardReference) {
            this.standardReference = standardReference;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference getStandardReference() {
            return this.standardReference;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute extends TeaModel {
        /**
         * <p>The attribute source.</p>
         */
        @NameInMap("AttributeFromInfo")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo attributeFromInfo;

        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute setAttributeFromInfo(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo attributeFromInfo) {
            this.attributeFromInfo = attributeFromInfo;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo getAttributeFromInfo() {
            return this.attributeFromInfo;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference setLookupTableId(Long lookupTableId) {
            this.lookupTableId = lookupTableId;
            return this;
        }
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange extends TeaModel {
        /**
         * <p>The value range. This parameter takes effect when the value source is set to DATAPHIN_ATTRIBUTE. Valid values:</p>
         * <ul>
         * <li>BIZ_UNIT: business unit.</li>
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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference lookupTableReference;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to MIN_MAX.</p>
         */
        @NameInMap("MinMaxValueConfig")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

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

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange setDataphinAttributeType(String dataphinAttributeType) {
            this.dataphinAttributeType = dataphinAttributeType;
            return this;
        }
        public String getDataphinAttributeType() {
            return this.dataphinAttributeType;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange setLookupTableReference(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference lookupTableReference) {
            this.lookupTableReference = lookupTableReference;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference getLookupTableReference() {
            return this.lookupTableReference;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange setMinMaxValueConfig(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig minMaxValueConfig) {
            this.minMaxValueConfig = minMaxValueConfig;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig getMinMaxValueConfig() {
            return this.minMaxValueConfig;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange setValueConstraint(String valueConstraint) {
            this.valueConstraint = valueConstraint;
            return this;
        }
        public String getValueConstraint() {
            return this.valueConstraint;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig extends TeaModel {
        /**
         * <p>The data type of the attribute value. Valid values:</p>
         * <ul>
         * <li>STRING: string.</li>
         * <li>BIGINT: numeric type.</li>
         * <li>DOUBLE: floating-point type.</li>
         * <li>DATE: date, accurate to the day.</li>
         * <li>DATETIME: date, accurate to milliseconds.</li>
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
         * <p>The length of the attribute value. If empty or -1, the length is not limited. Typically, only string types have a length limit for attribute values.</p>
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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange valueRange;

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig setValueRange(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRange getValueRange() {
            return this.valueRange;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute extends TeaModel {
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
         * <p>Indicates whether the monitoring configuration is enabled.</p>
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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig monitorConfig;

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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute refAttribute;

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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig valueConfig;

        public static GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute self = new GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setEnableMonitorConfig(Boolean enableMonitorConfig) {
            this.enableMonitorConfig = enableMonitorConfig;
            return this;
        }
        public Boolean getEnableMonitorConfig() {
            return this.enableMonitorConfig;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setMonitorConfig(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setRefAttribute(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute refAttribute) {
            this.refAttribute = refAttribute;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute getRefAttribute() {
            return this.refAttribute;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute setValueConfig(GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class GetStandardResponseBodyStandardInfoAttributeWithValueList extends TeaModel {
        /**
         * <p>The attribute details.</p>
         */
        @NameInMap("Attribute")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute attribute;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetStandardResponseBodyStandardInfoAttributeWithValueList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoAttributeWithValueList self = new GetStandardResponseBodyStandardInfoAttributeWithValueList();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueList setAttribute(GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute attribute) {
            this.attribute = attribute;
            return this;
        }
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute getAttribute() {
            return this.attribute;
        }

        public GetStandardResponseBodyStandardInfoAttributeWithValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStandardResponseBodyStandardInfoCreator extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoCreator self = new GetStandardResponseBodyStandardInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardResponseBodyStandardInfoEffectiveTimeConfig extends TeaModel {
        /**
         * <p>The end time of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The effective period type. Valid values:</p>
         * <ul>
         * <li>FOREVER: permanent.</li>
         * <li>TIME_PERIOD: time period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIME_PERIOD</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStandardResponseBodyStandardInfoEffectiveTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoEffectiveTimeConfig self = new GetStandardResponseBodyStandardInfoEffectiveTimeConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoEffectiveTimeConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStandardResponseBodyStandardInfoEffectiveTimeConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetStandardResponseBodyStandardInfoEffectiveTimeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardResponseBodyStandardInfoLastModifier extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoLastModifier build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoLastModifier self = new GetStandardResponseBodyStandardInfoLastModifier();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoLastModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoLastModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardResponseBodyStandardInfoLookupTableRelations extends TeaModel {
        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>zz</p>
         */
        @NameInMap("AttributeCode")
        public String attributeCode;

        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The lookup table code.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LookupTableCode")
        public String lookupTableCode;

        /**
         * <p>The lookup table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("LookupTableId")
        public Long lookupTableId;

        public static GetStandardResponseBodyStandardInfoLookupTableRelations build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoLookupTableRelations self = new GetStandardResponseBodyStandardInfoLookupTableRelations();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoLookupTableRelations setAttributeCode(String attributeCode) {
            this.attributeCode = attributeCode;
            return this;
        }
        public String getAttributeCode() {
            return this.attributeCode;
        }

        public GetStandardResponseBodyStandardInfoLookupTableRelations setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

        public GetStandardResponseBodyStandardInfoLookupTableRelations setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetStandardResponseBodyStandardInfoLookupTableRelations setLookupTableCode(String lookupTableCode) {
            this.lookupTableCode = lookupTableCode;
            return this;
        }
        public String getLookupTableCode() {
            return this.lookupTableCode;
        }

        public GetStandardResponseBodyStandardInfoLookupTableRelations setLookupTableId(Long lookupTableId) {
            this.lookupTableId = lookupTableId;
            return this;
        }
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

    }

    public static class GetStandardResponseBodyStandardInfoOwner extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoOwner build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoOwner self = new GetStandardResponseBodyStandardInfoOwner();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig extends TeaModel {
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

        public static GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig self = new GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setIsCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate extends TeaModel {
        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template source. Valid values:</p>
         * <ul>
         * <li>FROM_SYSTEM: system template.</li>
         * <li>CUSTOMIZED: custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate self = new GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList extends TeaModel {
        /**
         * <p>The configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The configuration item value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList self = new GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList extends TeaModel {
        /**
         * <p>The validation configuration ID. This ID is randomly generated by the business and must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metric. This parameter is required when the validation type is EXPRESSION.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The metric name. This parameter is required when the validation type is EXPRESSION.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The operator. If the validation type is EXPRESSION, valid values:</p>
         * <ul>
         * <li>EQUAL: equal to.</li>
         * <li>NOT_EQUAL: not equal to.</li>
         * <li>LARGER: greater than.</li>
         * <li>LARGE_OR_EQUAL: greater than or equal to.</li>
         * <li>SMALLER: less than.</li>
         * <li>SMALLER_OR_EQUAL: less than or equal to.</li>
         * </ul>
         * <p>If the validation type is RELATION, valid values:</p>
         * <ul>
         * <li>AND: and.</li>
         * <li>OR: or.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parent validation configuration ID. The parent rule validation type can only be RELATION.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The rule validation type. Valid values:</p>
         * <ul>
         * <li>RELATION: relation.</li>
         * <li>EXPRESSION: expression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELATION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The comparison value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList self = new GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList extends TeaModel {
        /**
         * <p>The associated attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        /**
         * <p>The monitoring configuration of the associated attribute.</p>
         */
        @NameInMap("AttributeMonitorConfig")
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig;

        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>teset</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The monitoring configuration ID. If empty, a new monitoring configuration is created. If an existing monitoring configuration ID is specified, the corresponding monitoring configuration is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The method by which the monitoring configuration is added. Valid values:</p>
         * <ul>
         * <li>BY_USER: manually added.</li>
         * <li>BY_SYSTEM_ATTRIBUTE: preset by system attribute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BY_SYSTEM_ATTRIBUTE</p>
         */
        @NameInMap("MonitorFrom")
        public String monitorFrom;

        /**
         * <p>The rule template. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("QualityRuleTemplate")
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate;

        /**
         * <p>The rule configurations. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("RuleConfigList")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule subtype. Valid values:</p>
         * <ul>
         * <li>BY_ATTRIBUTE: configured based on attributes.</li>
         * <li>CUSTOMIZED: custom configuration.</li>
         * </ul>
         * <p>This parameter is required when the monitoring type is QUALITY.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("RuleSubType")
        public String ruleSubType;

        /**
         * <p>The rule validation configurations. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("RuleValidateConfigList")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList;

        /**
         * <p>The monitoring type. Valid values:</p>
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

        public static GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList self = new GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeMonitorConfig(GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig) {
            this.attributeMonitorConfig = attributeMonitorConfig;
            return this;
        }
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig getAttributeMonitorConfig() {
            return this.attributeMonitorConfig;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setMonitorFrom(String monitorFrom) {
            this.monitorFrom = monitorFrom;
            return this;
        }
        public String getMonitorFrom() {
            return this.monitorFrom;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setQualityRuleTemplate(GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate) {
            this.qualityRuleTemplate = qualityRuleTemplate;
            return this;
        }
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate getQualityRuleTemplate() {
            return this.qualityRuleTemplate;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setRuleConfigList(java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList) {
            this.ruleConfigList = ruleConfigList;
            return this;
        }
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> getRuleConfigList() {
            return this.ruleConfigList;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setRuleSubType(String ruleSubType) {
            this.ruleSubType = ruleSubType;
            return this;
        }
        public String getRuleSubType() {
            return this.ruleSubType;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setRuleValidateConfigList(java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList) {
            this.ruleValidateConfigList = ruleValidateConfigList;
            return this;
        }
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> getRuleValidateConfigList() {
            return this.ruleValidateConfigList;
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig extends TeaModel {
        /**
         * <p>The list of standard monitoring configurations.</p>
         */
        @NameInMap("StandardMonitorConfigList")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList> standardMonitorConfigList;

        public static GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig self = new GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig setStandardMonitorConfigList(java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList> standardMonitorConfigList) {
            this.standardMonitorConfigList = standardMonitorConfigList;
            return this;
        }
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigList> getStandardMonitorConfigList() {
            return this.standardMonitorConfigList;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardRelations extends TeaModel {
        /**
         * <p>The association type. Valid values:</p>
         * <ul>
         * <li>RELATIVE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELATIVE</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The standard ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The stage of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        /**
         * <p>The standard status.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("StandardStatus")
        public String standardStatus;

        /**
         * <p>The standard version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardResponseBodyStandardInfoStandardRelations build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardRelations self = new GetStandardResponseBodyStandardInfoStandardRelations();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardRelations setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public GetStandardResponseBodyStandardInfoStandardRelations setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public GetStandardResponseBodyStandardInfoStandardRelations setStandardStage(String standardStage) {
            this.standardStage = standardStage;
            return this;
        }
        public String getStandardStage() {
            return this.standardStage;
        }

        public GetStandardResponseBodyStandardInfoStandardRelations setStandardStatus(String standardStatus) {
            this.standardStatus = standardStatus;
            return this;
        }
        public String getStandardStatus() {
            return this.standardStatus;
        }

        public GetStandardResponseBodyStandardInfoStandardRelations setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardSet extends TeaModel {
        /**
         * <p>The standard set code.</p>
         * 
         * <strong>example:</strong>
         * <p>cc</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The folder to which the standard set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The standard set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The standard set name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardResponseBodyStandardInfoStandardSet build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardSet self = new GetStandardResponseBodyStandardInfoStandardSet();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardSet setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardResponseBodyStandardInfoStandardSet setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetStandardResponseBodyStandardInfoStandardSet setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoStandardSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardResponseBodyStandardInfoStandardTemplate extends TeaModel {
        /**
         * <p>The standard template code.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The standard template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The standard template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source of the standard template. Valid values:</p>
         * <ul>
         * <li>CUSTOM: Custom standard template.</li>
         * <li>SYSTEM: System built-in standard template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("TemplateFrom")
        public String templateFrom;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardResponseBodyStandardInfoStandardTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfoStandardTemplate self = new GetStandardResponseBodyStandardInfoStandardTemplate();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfoStandardTemplate setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardResponseBodyStandardInfoStandardTemplate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfoStandardTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardResponseBodyStandardInfoStandardTemplate setTemplateFrom(String templateFrom) {
            this.templateFrom = templateFrom;
            return this;
        }
        public String getTemplateFrom() {
            return this.templateFrom;
        }

        public GetStandardResponseBodyStandardInfoStandardTemplate setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetStandardResponseBodyStandardInfo extends TeaModel {
        /**
         * <p>The attribute value configurations.</p>
         */
        @NameInMap("AttributeWithValueList")
        public java.util.List<GetStandardResponseBodyStandardInfoAttributeWithValueList> attributeWithValueList;

        /**
         * <p>The standard code.</p>
         * 
         * <strong>example:</strong>
         * <p>zz</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The creator.</p>
         */
        @NameInMap("Creator")
        public GetStandardResponseBodyStandardInfoCreator creator;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The effective period configuration.</p>
         */
        @NameInMap("EffectiveTimeConfig")
        public GetStandardResponseBodyStandardInfoEffectiveTimeConfig effectiveTimeConfig;

        /**
         * <p>The English name of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EnglishName")
        public String englishName;

        /**
         * <p>The lookup table.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modifier.</p>
         */
        @NameInMap("LastModifier")
        public GetStandardResponseBodyStandardInfoLastModifier lastModifier;

        /**
         * <p>The list of associated lookup tables.</p>
         */
        @NameInMap("LookupTableRelations")
        public java.util.List<GetStandardResponseBodyStandardInfoLookupTableRelations> lookupTableRelations;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The standard name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner.</p>
         */
        @NameInMap("Owner")
        public GetStandardResponseBodyStandardInfoOwner owner;

        /**
         * <p>The stage to which the standard belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Stage")
        public String stage;

        /**
         * <p>The standard monitoring configuration.</p>
         */
        @NameInMap("StandardGeneralMonitorConfig")
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig standardGeneralMonitorConfig;

        /**
         * <p>The list of associated standards.</p>
         */
        @NameInMap("StandardRelations")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardRelations> standardRelations;

        /**
         * <p>The standard set on which the current standard depends.</p>
         */
        @NameInMap("StandardSet")
        public GetStandardResponseBodyStandardInfoStandardSet standardSet;

        /**
         * <p>The standard template on which the current standard depends.</p>
         */
        @NameInMap("StandardTemplate")
        public GetStandardResponseBodyStandardInfoStandardTemplate standardTemplate;

        /**
         * <p>The status of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The standard type.</p>
         * 
         * <strong>example:</strong>
         * <p>zz</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardResponseBodyStandardInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardResponseBodyStandardInfo self = new GetStandardResponseBodyStandardInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardResponseBodyStandardInfo setAttributeWithValueList(java.util.List<GetStandardResponseBodyStandardInfoAttributeWithValueList> attributeWithValueList) {
            this.attributeWithValueList = attributeWithValueList;
            return this;
        }
        public java.util.List<GetStandardResponseBodyStandardInfoAttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        public GetStandardResponseBodyStandardInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardResponseBodyStandardInfo setCreator(GetStandardResponseBodyStandardInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetStandardResponseBodyStandardInfoCreator getCreator() {
            return this.creator;
        }

        public GetStandardResponseBodyStandardInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardResponseBodyStandardInfo setEffectiveTimeConfig(GetStandardResponseBodyStandardInfoEffectiveTimeConfig effectiveTimeConfig) {
            this.effectiveTimeConfig = effectiveTimeConfig;
            return this;
        }
        public GetStandardResponseBodyStandardInfoEffectiveTimeConfig getEffectiveTimeConfig() {
            return this.effectiveTimeConfig;
        }

        public GetStandardResponseBodyStandardInfo setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public GetStandardResponseBodyStandardInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardResponseBodyStandardInfo setLastModifier(GetStandardResponseBodyStandardInfoLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public GetStandardResponseBodyStandardInfoLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public GetStandardResponseBodyStandardInfo setLookupTableRelations(java.util.List<GetStandardResponseBodyStandardInfoLookupTableRelations> lookupTableRelations) {
            this.lookupTableRelations = lookupTableRelations;
            return this;
        }
        public java.util.List<GetStandardResponseBodyStandardInfoLookupTableRelations> getLookupTableRelations() {
            return this.lookupTableRelations;
        }

        public GetStandardResponseBodyStandardInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetStandardResponseBodyStandardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardResponseBodyStandardInfo setOwner(GetStandardResponseBodyStandardInfoOwner owner) {
            this.owner = owner;
            return this;
        }
        public GetStandardResponseBodyStandardInfoOwner getOwner() {
            return this.owner;
        }

        public GetStandardResponseBodyStandardInfo setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetStandardResponseBodyStandardInfo setStandardGeneralMonitorConfig(GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig standardGeneralMonitorConfig) {
            this.standardGeneralMonitorConfig = standardGeneralMonitorConfig;
            return this;
        }
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
            return this.standardGeneralMonitorConfig;
        }

        public GetStandardResponseBodyStandardInfo setStandardRelations(java.util.List<GetStandardResponseBodyStandardInfoStandardRelations> standardRelations) {
            this.standardRelations = standardRelations;
            return this;
        }
        public java.util.List<GetStandardResponseBodyStandardInfoStandardRelations> getStandardRelations() {
            return this.standardRelations;
        }

        public GetStandardResponseBodyStandardInfo setStandardSet(GetStandardResponseBodyStandardInfoStandardSet standardSet) {
            this.standardSet = standardSet;
            return this;
        }
        public GetStandardResponseBodyStandardInfoStandardSet getStandardSet() {
            return this.standardSet;
        }

        public GetStandardResponseBodyStandardInfo setStandardTemplate(GetStandardResponseBodyStandardInfoStandardTemplate standardTemplate) {
            this.standardTemplate = standardTemplate;
            return this;
        }
        public GetStandardResponseBodyStandardInfoStandardTemplate getStandardTemplate() {
            return this.standardTemplate;
        }

        public GetStandardResponseBodyStandardInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStandardResponseBodyStandardInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStandardResponseBodyStandardInfo setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
