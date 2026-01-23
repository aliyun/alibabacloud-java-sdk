// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardResponseBody extends TeaModel {
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

    @NameInMap("StandardInfo")
    public GetStandardResponseBodyStandardInfo standardInfo;

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
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("AttributeFrom")
        public String attributeFrom;

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
        @NameInMap("AttributeFromInfo")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttributeAttributeFromInfo attributeFromInfo;

        /**
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
         * <strong>example:</strong>
         * <p>DATAPHIN_ATTRIBUTE</p>
         */
        @NameInMap("DataphinAttributeType")
        public String dataphinAttributeType;

        @NameInMap("LookupTableReference")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeLookupTableReference lookupTableReference;

        @NameInMap("MinMaxValueConfig")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeValueConfigValueRangeMinMaxValueConfig minMaxValueConfig;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ValueConstraint")
        public String valueConstraint;

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
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeMonitorConfig monitorConfig;

        /**
         * <strong>example:</strong>
         * <p>attr1</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RefAttribute")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttributeRefAttribute refAttribute;

        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>BIZ_ATTRIBUTE</p>
         */
        @NameInMap("Type")
        public String type;

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
        @NameInMap("Attribute")
        public GetStandardResponseBodyStandardInfoAttributeWithValueListAttribute attribute;

        /**
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
         * <strong>example:</strong>
         * <p>2025-12-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
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
         * <strong>example:</strong>
         * <p>zz</p>
         */
        @NameInMap("AttributeCode")
        public String attributeCode;

        /**
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LookupTableCode")
        public String lookupTableCode;

        /**
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
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>RELATION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        @NameInMap("AttributeMonitorConfig")
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig;

        /**
         * <strong>example:</strong>
         * <p>teset</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>BY_SYSTEM_ATTRIBUTE</p>
         */
        @NameInMap("MonitorFrom")
        public String monitorFrom;

        @NameInMap("QualityRuleTemplate")
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate;

        @NameInMap("RuleConfigList")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("RuleSubType")
        public String ruleSubType;

        @NameInMap("RuleValidateConfigList")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList;

        /**
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
         * <strong>example:</strong>
         * <p>RELATIVE</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        /**
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("StandardStatus")
        public String standardStatus;

        /**
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
         * <strong>example:</strong>
         * <p>cc</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
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
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
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
        @NameInMap("AttributeWithValueList")
        public java.util.List<GetStandardResponseBodyStandardInfoAttributeWithValueList> attributeWithValueList;

        /**
         * <strong>example:</strong>
         * <p>zz</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Creator")
        public GetStandardResponseBodyStandardInfoCreator creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EffectiveTimeConfig")
        public GetStandardResponseBodyStandardInfoEffectiveTimeConfig effectiveTimeConfig;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EnglishName")
        public String englishName;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LastModifier")
        public GetStandardResponseBodyStandardInfoLastModifier lastModifier;

        @NameInMap("LookupTableRelations")
        public java.util.List<GetStandardResponseBodyStandardInfoLookupTableRelations> lookupTableRelations;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public GetStandardResponseBodyStandardInfoOwner owner;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Stage")
        public String stage;

        @NameInMap("StandardGeneralMonitorConfig")
        public GetStandardResponseBodyStandardInfoStandardGeneralMonitorConfig standardGeneralMonitorConfig;

        @NameInMap("StandardRelations")
        public java.util.List<GetStandardResponseBodyStandardInfoStandardRelations> standardRelations;

        @NameInMap("StandardSet")
        public GetStandardResponseBodyStandardInfoStandardSet standardSet;

        @NameInMap("StandardTemplate")
        public GetStandardResponseBodyStandardInfoStandardTemplate standardTemplate;

        /**
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>zz</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
