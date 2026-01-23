// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityRuleResponseBody extends TeaModel {
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
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

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
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DefaultValue")
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue;

        /**
         * <strong>example:</strong>
         * <p>6921666</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

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
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>612415804007</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>attr01</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Searchable")
        public Boolean searchable;

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
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

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
        @NameInMap("AttributeInfo")
        public GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueListAttributeInfo attributeInfo;

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
         * <strong>example:</strong>
         * <p>expression</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>col</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleId")
        public Long scheduleId;

        /**
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
         * <strong>example:</strong>
         * <p>268</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>且</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
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
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("AttributeWithValueList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoAttributeWithValueList> attributeWithValueList;

        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EnableErrorArchive")
        public Boolean enableErrorArchive;

        @NameInMap("FormPropertyList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoFormPropertyList> formPropertyList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

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

        @NameInMap("ScheduleBindList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoScheduleBindList> scheduleBindList;

        /**
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>STRONG</p>
         */
        @NameInMap("Strength")
        public String strength;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("TemplateScope")
        public String templateScope;

        /**
         * <strong>example:</strong>
         * <p>FIELD_NULL_VALUE_VALIDATE</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TestRunRuleTaskId")
        public Long testRunRuleTaskId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TestRunRuleTaskStatus")
        public String testRunRuleTaskStatus;

        @NameInMap("TestRunRuleValidateResult")
        public Boolean testRunRuleValidateResult;

        @NameInMap("ValidateConditionList")
        public java.util.List<GetQualityRuleResponseBodyQualityRuleInfoValidateConditionList> validateConditionList;

        @NameInMap("ValidateObject")
        public GetQualityRuleResponseBodyQualityRuleInfoValidateObject validateObject;

        /**
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
