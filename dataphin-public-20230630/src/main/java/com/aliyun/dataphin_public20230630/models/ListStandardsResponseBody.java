// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStandardsResponseBody extends TeaModel {
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
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListStandardsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListStandardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStandardsResponseBody self = new ListStandardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStandardsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStandardsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStandardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStandardsResponseBody setPageResult(ListStandardsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListStandardsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListStandardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStandardsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig extends TeaModel {
        /**
         * <p>The field to be checked.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>Specifies whether the check is case-sensitive.</p>
         */
        @NameInMap("IsCaseSensitive")
        public Boolean isCaseSensitive;

        /**
         * <p>The monitoring method. Valid values: METADATA: metadata monitoring. QUALITY: data quality monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>METADATA</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig setIsCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference extends TeaModel {
        /**
         * <p>The ID of the standard.</p>
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

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo extends TeaModel {
        /**
         * <p>The source of the attribute. Valid values: SYSTEM: system attribute. CUSTOM: custom attribute. STANDARD: standard.</p>
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
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference standardReference;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo setAttributeFrom(String attributeFrom) {
            this.attributeFrom = attributeFrom;
            return this;
        }
        public String getAttributeFrom() {
            return this.attributeFrom;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo setStandardReference(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference standardReference) {
            this.standardReference = standardReference;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfoStandardReference getStandardReference() {
            return this.standardReference;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute extends TeaModel {
        /**
         * <p>The source of the attribute.</p>
         */
        @NameInMap("AttributeFromInfo")
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo attributeFromInfo;

        /**
         * <p>The ID of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute setAttributeFromInfo(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo attributeFromInfo) {
            this.attributeFromInfo = attributeFromInfo;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttributeAttributeFromInfo getAttributeFromInfo() {
            return this.attributeFromInfo;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("LookupTableId")
        public Long lookupTableId;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference setLookupTableId(Long lookupTableId) {
            this.lookupTableId = lookupTableId;
            return this;
        }
        public Long getLookupTableId() {
            return this.lookupTableId;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig extends TeaModel {
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

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange extends TeaModel {
        /**
         * <p>The value range. This parameter takes effect when the value source is set to DATAPHIN_ATTRIBUTE. Valid values: BIZ_UNIT: data block. PROJECT: project. USER: user. USER_GROUP: user group.</p>
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
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference lookupTableReference;

        /**
         * <p>The value range. This parameter takes effect when the value source is set to MIN_MAX.</p>
         */
        @NameInMap("MinMaxValueConfig")
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

        /**
         * <p>The value source. Valid values: NONE: no constraint. LIST: obtained from a list. LOOKUP_TABLE: lookup table. MIN_MAX: obtained between the maximum and minimum values. DATAPHIN_ATTRIBUTE: Dataphin system property. BUILT_IN_DATA_TYPES: built-in data type. BUILT_IN_DATA_CLASSIFICATION: built-in data categorization. BUILT_IN_DATA_LEVEL: built-in data security classification.</p>
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

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange setDataphinAttributeType(String dataphinAttributeType) {
            this.dataphinAttributeType = dataphinAttributeType;
            return this;
        }
        public String getDataphinAttributeType() {
            return this.dataphinAttributeType;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange setLookupTableReference(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference lookupTableReference) {
            this.lookupTableReference = lookupTableReference;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference getLookupTableReference() {
            return this.lookupTableReference;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange setMinMaxValueConfig(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig minMaxValueConfig) {
            this.minMaxValueConfig = minMaxValueConfig;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig getMinMaxValueConfig() {
            return this.minMaxValueConfig;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange setValueConstraint(String valueConstraint) {
            this.valueConstraint = valueConstraint;
            return this;
        }
        public String getValueConstraint() {
            return this.valueConstraint;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig extends TeaModel {
        /**
         * <p>The data type of the attribute value. Valid values: STRING: string. BIGINT: numeric type. DOUBLE: floating-point type. DATE: date accurate to day. DATETIME: date accurate to millisecond. BOOLEAN: Boolean type.</p>
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
         * <p>The length of the attribute value. An empty value or -1 indicates that the length is not limited. Typically, only the string type limits the length of the attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The attribute value type. Valid values: CUSTOMIZED: custom input. SINGLE_ENUM: single enum value. MULTIPLE_ENUMS: multiple enum values. RANGE: range value.</p>
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
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange valueRange;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig setValueRange(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfigValueRange getValueRange() {
            return this.valueRange;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute extends TeaModel {
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
         * <p>Specifies whether to enable the monitoring configuration.</p>
         */
        @NameInMap("EnableMonitorConfig")
        public Boolean enableMonitorConfig;

        /**
         * <p>The ID of the attribute.</p>
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
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig monitorConfig;

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
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute refAttribute;

        /**
         * <p>Specifies whether the attribute is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The attribute type. Valid values: BIZ_ATTRIBUTE: business attribute. TECH_ATTRIBUTE: technical attribute. MANAGEMENT_ATTRIBUTE: management attribute. QUALITY_ATTRIBUTE: quality attribute. MASTER_DATA_ATTRIBUTE: master data attribute. LIFECYCLE_ATTRIBUTE: lifecycle attribute. SECURITY_ATTRIBUTE: security attribute.</p>
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
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig valueConfig;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setEnableMonitorConfig(Boolean enableMonitorConfig) {
            this.enableMonitorConfig = enableMonitorConfig;
            return this;
        }
        public Boolean getEnableMonitorConfig() {
            return this.enableMonitorConfig;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setMonitorConfig(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setRefAttribute(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute refAttribute) {
            this.refAttribute = refAttribute;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeRefAttribute getRefAttribute() {
            return this.refAttribute;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute setValueConfig(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttributeValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListAttributeWithValueList extends TeaModel {
        /**
         * <p>The attribute details.</p>
         */
        @NameInMap("Attribute")
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute attribute;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListStandardsResponseBodyPageResultStandardListAttributeWithValueList build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListAttributeWithValueList self = new ListStandardsResponseBodyPageResultStandardListAttributeWithValueList();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueList setAttribute(ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute attribute) {
            this.attribute = attribute;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueListAttribute getAttribute() {
            return this.attribute;
        }

        public ListStandardsResponseBodyPageResultStandardListAttributeWithValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListCreator extends TeaModel {
        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListStandardsResponseBodyPageResultStandardListCreator build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListCreator self = new ListStandardsResponseBodyPageResultStandardListCreator();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardListCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig extends TeaModel {
        /**
         * <p>The end time of the effective period. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the effective period. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The effective period type. Valid values:</p>
         * <ul>
         * <li>FOREVER: Permanent.</li>
         * <li>TIME_PERIOD: Time period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIME_PERIOD</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig self = new ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListLastModifier extends TeaModel {
        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListStandardsResponseBodyPageResultStandardListLastModifier build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListLastModifier self = new ListStandardsResponseBodyPageResultStandardListLastModifier();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListLastModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardListLastModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListOwner extends TeaModel {
        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListStandardsResponseBodyPageResultStandardListOwner build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListOwner self = new ListStandardsResponseBodyPageResultStandardListOwner();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardListOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListStandardSet extends TeaModel {
        /**
         * <p>The code of the standard set.</p>
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
         * <p>The ID of the standard set.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the standard set.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListStandardsResponseBodyPageResultStandardListStandardSet build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListStandardSet self = new ListStandardsResponseBodyPageResultStandardListStandardSet();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListStandardSet setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardSet setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardSet setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardListStandardTemplate extends TeaModel {
        /**
         * <p>The code of the standard template.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the standard template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the standard template.</p>
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
         * <li>SYSTEM: Built-in standard template.</li>
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

        public static ListStandardsResponseBodyPageResultStandardListStandardTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardListStandardTemplate self = new ListStandardsResponseBodyPageResultStandardListStandardTemplate();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardListStandardTemplate setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardTemplate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardTemplate setTemplateFrom(String templateFrom) {
            this.templateFrom = templateFrom;
            return this;
        }
        public String getTemplateFrom() {
            return this.templateFrom;
        }

        public ListStandardsResponseBodyPageResultStandardListStandardTemplate setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListStandardsResponseBodyPageResultStandardList extends TeaModel {
        /**
         * <p>The attribute value configuration.</p>
         */
        @NameInMap("AttributeWithValueList")
        public java.util.List<ListStandardsResponseBodyPageResultStandardListAttributeWithValueList> attributeWithValueList;

        /**
         * <p>The code of the standard.</p>
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
        public ListStandardsResponseBodyPageResultStandardListCreator creator;

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
        public ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig effectiveTimeConfig;

        /**
         * <p>The English name of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EnglishName")
        public String englishName;

        /**
         * <p>The standard ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The user who last updated the standard.</p>
         */
        @NameInMap("LastModifier")
        public ListStandardsResponseBodyPageResultStandardListLastModifier lastModifier;

        /**
         * <p>The last modified time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the standard.</p>
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
        public ListStandardsResponseBodyPageResultStandardListOwner owner;

        /**
         * <p>The stage of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Stage")
        public String stage;

        /**
         * <p>The standard set that the current standard depends on.</p>
         */
        @NameInMap("StandardSet")
        public ListStandardsResponseBodyPageResultStandardListStandardSet standardSet;

        /**
         * <p>The standard template that the current standard depends on.</p>
         */
        @NameInMap("StandardTemplate")
        public ListStandardsResponseBodyPageResultStandardListStandardTemplate standardTemplate;

        /**
         * <p>The status of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the standard.</p>
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

        public static ListStandardsResponseBodyPageResultStandardList build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResultStandardList self = new ListStandardsResponseBodyPageResultStandardList();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResultStandardList setAttributeWithValueList(java.util.List<ListStandardsResponseBodyPageResultStandardListAttributeWithValueList> attributeWithValueList) {
            this.attributeWithValueList = attributeWithValueList;
            return this;
        }
        public java.util.List<ListStandardsResponseBodyPageResultStandardListAttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        public ListStandardsResponseBodyPageResultStandardList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListStandardsResponseBodyPageResultStandardList setCreator(ListStandardsResponseBodyPageResultStandardListCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListCreator getCreator() {
            return this.creator;
        }

        public ListStandardsResponseBodyPageResultStandardList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStandardsResponseBodyPageResultStandardList setEffectiveTimeConfig(ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig effectiveTimeConfig) {
            this.effectiveTimeConfig = effectiveTimeConfig;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListEffectiveTimeConfig getEffectiveTimeConfig() {
            return this.effectiveTimeConfig;
        }

        public ListStandardsResponseBodyPageResultStandardList setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public ListStandardsResponseBodyPageResultStandardList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListStandardsResponseBodyPageResultStandardList setLastModifier(ListStandardsResponseBodyPageResultStandardListLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public ListStandardsResponseBodyPageResultStandardList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListStandardsResponseBodyPageResultStandardList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStandardsResponseBodyPageResultStandardList setOwner(ListStandardsResponseBodyPageResultStandardListOwner owner) {
            this.owner = owner;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListOwner getOwner() {
            return this.owner;
        }

        public ListStandardsResponseBodyPageResultStandardList setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public ListStandardsResponseBodyPageResultStandardList setStandardSet(ListStandardsResponseBodyPageResultStandardListStandardSet standardSet) {
            this.standardSet = standardSet;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListStandardSet getStandardSet() {
            return this.standardSet;
        }

        public ListStandardsResponseBodyPageResultStandardList setStandardTemplate(ListStandardsResponseBodyPageResultStandardListStandardTemplate standardTemplate) {
            this.standardTemplate = standardTemplate;
            return this;
        }
        public ListStandardsResponseBodyPageResultStandardListStandardTemplate getStandardTemplate() {
            return this.standardTemplate;
        }

        public ListStandardsResponseBodyPageResultStandardList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStandardsResponseBodyPageResultStandardList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListStandardsResponseBodyPageResultStandardList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListStandardsResponseBodyPageResult extends TeaModel {
        /**
         * <p>The standard list.</p>
         */
        @NameInMap("StandardList")
        public java.util.List<ListStandardsResponseBodyPageResultStandardList> standardList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListStandardsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListStandardsResponseBodyPageResult self = new ListStandardsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListStandardsResponseBodyPageResult setStandardList(java.util.List<ListStandardsResponseBodyPageResultStandardList> standardList) {
            this.standardList = standardList;
            return this;
        }
        public java.util.List<ListStandardsResponseBodyPageResultStandardList> getStandardList() {
            return this.standardList;
        }

        public ListStandardsResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
