// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRulesResponseBody extends TeaModel {
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

    @NameInMap("PageResult")
    public ListQualityRulesResponseBodyPageResult pageResult;

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

    public static ListQualityRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRulesResponseBody self = new ListQualityRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityRulesResponseBody setPageResult(ListQualityRulesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListQualityRulesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListQualityRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue extends TeaModel {
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue self = new ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DefaultValue")
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue;

        /**
         * <strong>example:</strong>
         * <p>6997283</p>
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig self = new ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig setDefaultValue(ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfigDefaultValue getDefaultValue() {
            return this.defaultValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig setValueEnumList(java.util.List<String> valueEnumList) {
            this.valueEnumList = valueEnumList;
            return this;
        }
        public java.util.List<String> getValueEnumList() {
            return this.valueEnumList;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo extends TeaModel {
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
         * <p>-168890138815</p>
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
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig valueConfig;

        public static ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo self = new ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setSearchable(Boolean searchable) {
            this.searchable = searchable;
            return this;
        }
        public Boolean getSearchable() {
            return this.searchable;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo setValueConfig(ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig valueConfig) {
            this.valueConfig = valueConfig;
            return this;
        }
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfoValueConfig getValueConfig() {
            return this.valueConfig;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue extends TeaModel {
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue self = new ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue setIncludeMaxValue(Boolean includeMaxValue) {
            this.includeMaxValue = includeMaxValue;
            return this;
        }
        public Boolean getIncludeMaxValue() {
            return this.includeMaxValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue setIncludeMinValue(Boolean includeMinValue) {
            this.includeMinValue = includeMinValue;
            return this;
        }
        public Boolean getIncludeMinValue() {
            return this.includeMinValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList extends TeaModel {
        @NameInMap("AttributeInfo")
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo attributeInfo;

        @NameInMap("AttributeValue")
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue attributeValue;

        public static ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList self = new ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList setAttributeInfo(ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList setAttributeValue(ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueListAttributeValue getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList extends TeaModel {
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList self = new ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList extends TeaModel {
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList self = new ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList setScheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public String getScheduleName() {
            return this.scheduleName;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList extends TeaModel {
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList self = new ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject extends TeaModel {
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

        public static ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject self = new ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListQualityRulesResponseBodyPageResultQualityRuleList extends TeaModel {
        @NameInMap("AttributeWithValueList")
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList> attributeWithValueList;

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
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList> formPropertyList;

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
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList> scheduleBindList;

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
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList> validateConditionList;

        @NameInMap("ValidateObject")
        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject validateObject;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static ListQualityRulesResponseBodyPageResultQualityRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResultQualityRuleList self = new ListQualityRulesResponseBodyPageResultQualityRuleList();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setAttributeWithValueList(java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList> attributeWithValueList) {
            this.attributeWithValueList = attributeWithValueList;
            return this;
        }
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListAttributeWithValueList> getAttributeWithValueList() {
            return this.attributeWithValueList;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setCatalogList(java.util.List<String> catalogList) {
            this.catalogList = catalogList;
            return this;
        }
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setEnableErrorArchive(Boolean enableErrorArchive) {
            this.enableErrorArchive = enableErrorArchive;
            return this;
        }
        public Boolean getEnableErrorArchive() {
            return this.enableErrorArchive;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setFormPropertyList(java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setScheduleBindList(java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList> scheduleBindList) {
            this.scheduleBindList = scheduleBindList;
            return this;
        }
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListScheduleBindList> getScheduleBindList() {
            return this.scheduleBindList;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setStrength(String strength) {
            this.strength = strength;
            return this;
        }
        public String getStrength() {
            return this.strength;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTemplateScope(String templateScope) {
            this.templateScope = templateScope;
            return this;
        }
        public String getTemplateScope() {
            return this.templateScope;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTestRunRuleTaskId(Long testRunRuleTaskId) {
            this.testRunRuleTaskId = testRunRuleTaskId;
            return this;
        }
        public Long getTestRunRuleTaskId() {
            return this.testRunRuleTaskId;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTestRunRuleTaskStatus(String testRunRuleTaskStatus) {
            this.testRunRuleTaskStatus = testRunRuleTaskStatus;
            return this;
        }
        public String getTestRunRuleTaskStatus() {
            return this.testRunRuleTaskStatus;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setTestRunRuleValidateResult(Boolean testRunRuleValidateResult) {
            this.testRunRuleValidateResult = testRunRuleValidateResult;
            return this;
        }
        public Boolean getTestRunRuleValidateResult() {
            return this.testRunRuleValidateResult;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setValidateConditionList(java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList> validateConditionList) {
            this.validateConditionList = validateConditionList;
            return this;
        }
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleListValidateConditionList> getValidateConditionList() {
            return this.validateConditionList;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setValidateObject(ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject validateObject) {
            this.validateObject = validateObject;
            return this;
        }
        public ListQualityRulesResponseBodyPageResultQualityRuleListValidateObject getValidateObject() {
            return this.validateObject;
        }

        public ListQualityRulesResponseBodyPageResultQualityRuleList setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

    public static class ListQualityRulesResponseBodyPageResult extends TeaModel {
        @NameInMap("QualityRuleList")
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleList> qualityRuleList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityRulesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyPageResult self = new ListQualityRulesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyPageResult setQualityRuleList(java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleList> qualityRuleList) {
            this.qualityRuleList = qualityRuleList;
            return this;
        }
        public java.util.List<ListQualityRulesResponseBodyPageResultQualityRuleList> getQualityRuleList() {
            return this.qualityRuleList;
        }

        public ListQualityRulesResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
