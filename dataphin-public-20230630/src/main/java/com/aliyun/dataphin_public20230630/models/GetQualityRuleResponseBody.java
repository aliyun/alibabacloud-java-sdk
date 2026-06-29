// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityRuleResponseBody extends TeaModel {
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
     * <p>The quality rule details.</p>
     */
    @NameInMap("QualityRuleInfo")
    public GetQualityRuleResponseBodyQualityRuleInfo qualityRuleInfo;

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

    public static GetQualityRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleResponseBody self = new GetQualityRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityRuleResponseBody setQualityRuleInfo(GetQualityRuleResponseBodyQualityRuleInfo qualityRuleInfo) {
        this.qualityRuleInfo = qualityRuleInfo;
        return this;
    }
    public GetQualityRuleResponseBodyQualityRuleInfo getQualityRuleInfo() {
        return this.qualityRuleInfo;
    }

    public GetQualityRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue extends TeaModel {
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
         * <p>The maximum value. This applies to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value. This applies to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>The list of attribute values. This applies to attributes with custom input, single-select dropdown, or multi-select dropdown input methods.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue self = new GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig extends TeaModel {
        /**
         * <p>The attribute field data type. Valid values:</p>
         * <ul>
         * <li>STRING: text</li>
         * <li>BIGINT: integer</li>
         * <li>DOUBLE: floating-point</li>
         * <li>BOOLEAN: Boolean</li>
         * <li>DATE: date</li>
         * <li>DATETIME: datetime.</li>
         * </ul>
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
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue;

        /**
         * <p>The attribute field length. This constrains the maximum length of text-type attribute values.</p>
         * 
         * <strong>example:</strong>
         * <p>6921666</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The attribute value input method. Valid values:</p>
         * <ul>
         * <li>CUSTOMIZED: custom input</li>
         * <li>SINGLE_ENUM: single-select dropdown</li>
         * <li>MULTIPLE_ENUMS: multi-select dropdown</li>
         * <li>RANGE: range interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute option values. This applies only to attributes with a single-select dropdown or multi-select dropdown input method.</p>
         */
        @NameInMap("ValueEnumList")
        public java.util.List<String> valueEnumList;

        public static GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig self = new GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig setDefaultValue(GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue getDefaultValue() {
            return this.defaultValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig setValueEnumList(java.util.List<String> valueEnumList) {
            this.valueEnumList = valueEnumList;
            return this;
        }
        public java.util.List<String> getValueEnumList() {
            return this.valueEnumList;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the attribute is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>612415804007</p>
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
         * <p>Indicates whether the attribute is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>Indicates whether the attribute is searchable.</p>
         */
        @NameInMap("Searchable")
        public Boolean searchable;

        /**
         * <p>The attribute value configuration details.</p>
         */
        @NameInMap("ValueConfig")
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig valueConfig;

        public static GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo self = new GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setSearchable(Boolean searchable) {
            this.searchable = searchable;
            return this;
        }
        public Boolean getSearchable() {
            return this.searchable;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo setValueConfig(GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue extends TeaModel {
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
         * <p>The maximum value. This applies to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>The minimum value. This applies to range interval attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>The list of attribute values. This applies to attributes with custom input, single-select dropdown, or multi-select dropdown input methods.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue self = new GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList extends TeaModel {
        /**
         * <p>The attribute details.</p>
         */
        @NameInMap("AttributeInfo")
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo attributeInfo;

        /**
         * <p>The property value.</p>
         */
        @NameInMap("AttributeValue")
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue attributeValue;

        public static GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList self = new GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList setAttributeInfo(GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList setAttributeValue(GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeValue getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList extends TeaModel {
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

        public static GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList self = new GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList extends TeaModel {
        /**
         * <p>The schedule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleId")
        public Long scheduleId;

        /**
         * <p>The schedule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ScheduleName")
        public String scheduleName;

        public static GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList self = new GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList setScheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public String getScheduleName() {
            return this.scheduleName;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList extends TeaModel {
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
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The operator. Valid values: EQUAL, NOT_EQUAL, LARGER, SMALLER, LARGE_OR_EQUAL, SMALLER_OR_EQUAL, AND, OR.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>且</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

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
         * <li>RELATION: relationship</li>
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

        public static GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList self = new GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfoValidateObject extends TeaModel {
        /**
         * <p>The validation object name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The validation object type. Valid values: UNKNOWN, TABLE, COLUMN, DATASOURCE, DATASOURCE_TABLE, REALTIME, INDEX, CHAIN.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetQualityRuleResponseBodyQualityRuleInfoValidateObject build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfoValidateObject self = new GetQualityRuleResponseBodyQualityRuleInfoValidateObject();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityRuleResponseBodyQualityRuleInfoValidateObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQualityRuleResponseBodyQualityRuleInfo extends TeaModel {
        /**
         * <p>The rule business attribute configurations.</p>
         */
        @NameInMap("AttributeWithValueList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList> attributeWithValueList;

        /**
         * <p>The rule categories. Valid values:</p>
         * <ul>
         * <li>CONSISTENT: consistency</li>
         * <li>EFFECTIVE: validity</li>
         * <li>TIMELINESE: timeliness</li>
         * <li>ACCURATE: accuracy</li>
         * <li>UNIQUENESS: uniqueness</li>
         * <li>COMPLETENESS: completeness</li>
         * <li>STABILITY: stability</li>
         * <li>CUSTOM: custom.</li>
         * </ul>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

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
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether exception archiving is enabled.</p>
         */
        @NameInMap("EnableErrorArchive")
        public Boolean enableErrorArchive;

        /**
         * <p>The rule configuration key-value pairs. These vary by templatetype. Different templatetypes return different form key-value pair configurations.</p>
         */
        @NameInMap("FormPropertyList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList> formPropertyList;

        /**
         * <p>The quality rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the user who last modified the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The name of the user who last modified the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The quality rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of schedules bound to the rule.</p>
         */
        @NameInMap("ScheduleBindList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList> scheduleBindList;

        /**
         * <p>The quality rule status. Valid values:</p>
         * <ul>
         * <li>ENABLE</li>
         * <li>DISABLE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The rule strength. Valid values:</p>
         * <ul>
         * <li>STRONG</li>
         * <li>WEAK.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STRONG</p>
         */
        @NameInMap("Strength")
        public String strength;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The templatetype group. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system preset</li>
         * <li>CUSTOM: custom template</li>
         * <li>TEMPLATE: union of SYSTEM and CUSTOM</li>
         * <li>CUSTOM_SQL: custom SQL template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("TemplateScope")
        public String templateScope;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>FIELD_NULL_VALUE_VALIDATE: field null value check</li>
         * <li>FIELD_EMPTY_STRING_VALIDATE: field empty character string check</li>
         * <li>FIELD_UNIQUE_VALIDATE: field uniqueness check</li>
         * <li>FIELD_GROUP_COUNT_VALIDATE: field unique value count check</li>
         * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count check</li>
         * <li>FUNCTION_TIME_COMPARE: time function comparison</li>
         * <li>SINGLE_TABLE_TIME_COMPARE: non-partitioned table time field comparison</li>
         * <li>DOUBLE_TABLE_TIME_COMPARE: two-table time field comparison</li>
         * <li>FIELD_FORMAT_VALIDATE: field format check</li>
         * <li>FIELD_LENGTH_VALIDATE: field length check</li>
         * <li>FIELD_VALUE_RANGE_VALIDATE: field value range check</li>
         * <li>CODE_TABLE_COMPARE: lookup table reference comparison</li>
         * <li>STANDARD_CODE_TABLE_COMPARE: data standard lookup table reference comparison</li>
         * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: non-partitioned table field value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: non-partitioned table field statistical value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: non-partitioned table field business logic consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: two-table field value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: two-table field statistical value consistency comparison</li>
         * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source two-table field statistical value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: two-table field business logic consistency comparison</li>
         * <li>TABLE_STABILITY_VALIDATE: table stability check</li>
         * <li>TABLE_FLUCTUATION_VALIDATE: table fluctuation check</li>
         * <li>FIELD_STABILITY_VALIDATE: field stability check</li>
         * <li>FIELD_FLUCTUATION_VALIDATE: field fluctuation check</li>
         * <li>CUSTOM_STATISTICAL_VALIDATE: custom statistical metric check</li>
         * <li>CUSTOM_DATA_DETAILS_VALIDATE: custom data details check</li>
         * <li>DATASOURCE_AVAILABLE_CHECK: data source connectivity monitoring</li>
         * <li>TABLE_SCHEMA_CHECK: table schema change monitoring</li>
         * <li>REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison</li>
         * <li>REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring</li>
         * <li>REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-link comparison, and more.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIELD_NULL_VALUE_VALIDATE</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The ID of the most recent test run task.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TestRunRuleTaskId")
        public Long testRunRuleTaskId;

        /**
         * <p>The status of the most recent test run task. Valid values: NOT_RUN, WAITING, RUNNING, SUCCESS, FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TestRunRuleTaskStatus")
        public String testRunRuleTaskStatus;

        /**
         * <p>Indicates whether the test run validation passed.</p>
         */
        @NameInMap("TestRunRuleValidateResult")
        public Boolean testRunRuleValidateResult;

        /**
         * <p>The list of validation conditions.</p>
         */
        @NameInMap("ValidateConditionList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList> validateConditionList;

        /**
         * <p>The validation object.</p>
         */
        @NameInMap("ValidateObject")
        public GetQualityRuleResponseBodyQualityRuleInfoValidateObject validateObject;

        /**
         * <p>The ID of the associated monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static GetQualityRuleResponseBodyQualityRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyQualityRuleInfo self = new GetQualityRuleResponseBodyQualityRuleInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setAttributeWithValueList(java.util.List<GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList> attributeWithValueList) {
            this.attributeWithValueList = attributeWithValueList;
            return this;
        }
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setCatalogList(java.util.List<String> catalogList) {
            this.catalogList = catalogList;
            return this;
        }
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setEnableErrorArchive(Boolean enableErrorArchive) {
            this.enableErrorArchive = enableErrorArchive;
            return this;
        }
        public Boolean getEnableErrorArchive() {
            return this.enableErrorArchive;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setFormPropertyList(java.util.List<GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setScheduleBindList(java.util.List<GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList> scheduleBindList) {
            this.scheduleBindList = scheduleBindList;
            return this;
        }
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList> getScheduleBindList() {
            return this.scheduleBindList;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setStrength(String strength) {
            this.strength = strength;
            return this;
        }
        public String getStrength() {
            return this.strength;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTemplateScope(String templateScope) {
            this.templateScope = templateScope;
            return this;
        }
        public String getTemplateScope() {
            return this.templateScope;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTestRunRuleTaskId(Long testRunRuleTaskId) {
            this.testRunRuleTaskId = testRunRuleTaskId;
            return this;
        }
        public Long getTestRunRuleTaskId() {
            return this.testRunRuleTaskId;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTestRunRuleTaskStatus(String testRunRuleTaskStatus) {
            this.testRunRuleTaskStatus = testRunRuleTaskStatus;
            return this;
        }
        public String getTestRunRuleTaskStatus() {
            return this.testRunRuleTaskStatus;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setTestRunRuleValidateResult(Boolean testRunRuleValidateResult) {
            this.testRunRuleValidateResult = testRunRuleValidateResult;
            return this;
        }
        public Boolean getTestRunRuleValidateResult() {
            return this.testRunRuleValidateResult;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setValidateConditionList(java.util.List<GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList> validateConditionList) {
            this.validateConditionList = validateConditionList;
            return this;
        }
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList> getValidateConditionList() {
            return this.validateConditionList;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setValidateObject(GetQualityRuleResponseBodyQualityRuleInfoValidateObject validateObject) {
            this.validateObject = validateObject;
            return this;
        }
        public GetQualityRuleResponseBodyQualityRuleInfoValidateObject getValidateObject() {
            return this.validateObject;
        }

        public GetQualityRuleResponseBodyQualityRuleInfo setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
