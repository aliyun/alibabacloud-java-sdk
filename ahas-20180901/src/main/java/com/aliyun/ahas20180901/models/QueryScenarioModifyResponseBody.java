// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryScenarioModifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryScenarioModifyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryScenarioModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScenarioModifyResponseBody self = new QueryScenarioModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScenarioModifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryScenarioModifyResponseBody setData(QueryScenarioModifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryScenarioModifyResponseBodyData getData() {
        return this.data;
    }

    public QueryScenarioModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryScenarioModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScenarioModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryScenarioModifyResponseBodyDataCheckPoints extends TeaModel {
        @NameInMap("measure")
        public String measure;

        @NameInMap("monitorPoint")
        public String monitorPoint;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static QueryScenarioModifyResponseBodyDataCheckPoints build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioModifyResponseBodyDataCheckPoints self = new QueryScenarioModifyResponseBodyDataCheckPoints();
            return TeaModel.build(map, self);
        }

        public QueryScenarioModifyResponseBodyDataCheckPoints setMeasure(String measure) {
            this.measure = measure;
            return this;
        }
        public String getMeasure() {
            return this.measure;
        }

        public QueryScenarioModifyResponseBodyDataCheckPoints setMonitorPoint(String monitorPoint) {
            this.monitorPoint = monitorPoint;
            return this;
        }
        public String getMonitorPoint() {
            return this.monitorPoint;
        }

        public QueryScenarioModifyResponseBodyDataCheckPoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryScenarioModifyResponseBodyDataCheckPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues extends TeaModel {
        @NameInMap("defaultValue")
        public String defaultValue;

        @NameInMap("desc")
        public String desc;

        @NameInMap("display")
        public Boolean display;

        @NameInMap("id")
        public String id;

        @NameInMap("maxLength")
        public Integer maxLength;

        @NameInMap("minLength")
        public Integer minLength;

        @NameInMap("necessary")
        public Boolean necessary;

        @NameInMap("numberMaxValue")
        public Long numberMaxValue;

        @NameInMap("numberMinValue")
        public Long numberMinValue;

        @NameInMap("options")
        public java.util.List<String> options;

        @NameInMap("placeholder")
        public String placeholder;

        @NameInMap("tooltip")
        public String tooltip;

        @NameInMap("type")
        public String type;

        @NameInMap("unit")
        public String unit;

        @NameInMap("value")
        public String value;

        public static QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues self = new QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues();
            return TeaModel.build(map, self);
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setNecessary(Boolean necessary) {
            this.necessary = necessary;
            return this;
        }
        public Boolean getNecessary() {
            return this.necessary;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setNumberMaxValue(Long numberMaxValue) {
            this.numberMaxValue = numberMaxValue;
            return this;
        }
        public Long getNumberMaxValue() {
            return this.numberMaxValue;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setNumberMinValue(Long numberMinValue) {
            this.numberMinValue = numberMinValue;
            return this;
        }
        public Long getNumberMinValue() {
            return this.numberMinValue;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setTooltip(String tooltip) {
            this.tooltip = tooltip;
            return this;
        }
        public String getTooltip() {
            return this.tooltip;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions extends TeaModel {
        @NameInMap("metaScenarioId")
        public String metaScenarioId;

        @NameInMap("metaScenarioName")
        public String metaScenarioName;

        @NameInMap("paramValues")
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues> paramValues;

        public static QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions self = new QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions();
            return TeaModel.build(map, self);
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions setMetaScenarioId(String metaScenarioId) {
            this.metaScenarioId = metaScenarioId;
            return this;
        }
        public String getMetaScenarioId() {
            return this.metaScenarioId;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions setMetaScenarioName(String metaScenarioName) {
            this.metaScenarioName = metaScenarioName;
            return this;
        }
        public String getMetaScenarioName() {
            return this.metaScenarioName;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions setParamValues(java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues> paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesActionsParamValues> getParamValues() {
            return this.paramValues;
        }

    }

    public static class QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts extends TeaModel {
        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("deviceIp")
        public String deviceIp;

        public static QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts self = new QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts();
            return TeaModel.build(map, self);
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

    }

    public static class QueryScenarioModifyResponseBodyDataScenarioComponentValues extends TeaModel {
        @NameInMap("actions")
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions> actions;

        @NameInMap("hosts")
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts> hosts;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static QueryScenarioModifyResponseBodyDataScenarioComponentValues build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioModifyResponseBodyDataScenarioComponentValues self = new QueryScenarioModifyResponseBodyDataScenarioComponentValues();
            return TeaModel.build(map, self);
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValues setActions(java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesActions> getActions() {
            return this.actions;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValues setHosts(java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValuesHosts> getHosts() {
            return this.hosts;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryScenarioModifyResponseBodyDataScenarioComponentValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryScenarioModifyResponseBodyData extends TeaModel {
        @NameInMap("attackName")
        public String attackName;

        @NameInMap("availablePoints")
        public java.util.List<String> availablePoints;

        @NameInMap("checkPoints")
        public java.util.List<QueryScenarioModifyResponseBodyDataCheckPoints> checkPoints;

        @NameInMap("checkpointMeasures")
        public java.util.List<String> checkpointMeasures;

        @NameInMap("checkpointTypes")
        public java.util.List<String> checkpointTypes;

        @NameInMap("chosenPoints")
        public java.util.List<String> chosenPoints;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("scenarioComponentValues")
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValues> scenarioComponentValues;

        @NameInMap("startTime")
        public Long startTime;

        public static QueryScenarioModifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioModifyResponseBodyData self = new QueryScenarioModifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryScenarioModifyResponseBodyData setAttackName(String attackName) {
            this.attackName = attackName;
            return this;
        }
        public String getAttackName() {
            return this.attackName;
        }

        public QueryScenarioModifyResponseBodyData setAvailablePoints(java.util.List<String> availablePoints) {
            this.availablePoints = availablePoints;
            return this;
        }
        public java.util.List<String> getAvailablePoints() {
            return this.availablePoints;
        }

        public QueryScenarioModifyResponseBodyData setCheckPoints(java.util.List<QueryScenarioModifyResponseBodyDataCheckPoints> checkPoints) {
            this.checkPoints = checkPoints;
            return this;
        }
        public java.util.List<QueryScenarioModifyResponseBodyDataCheckPoints> getCheckPoints() {
            return this.checkPoints;
        }

        public QueryScenarioModifyResponseBodyData setCheckpointMeasures(java.util.List<String> checkpointMeasures) {
            this.checkpointMeasures = checkpointMeasures;
            return this;
        }
        public java.util.List<String> getCheckpointMeasures() {
            return this.checkpointMeasures;
        }

        public QueryScenarioModifyResponseBodyData setCheckpointTypes(java.util.List<String> checkpointTypes) {
            this.checkpointTypes = checkpointTypes;
            return this;
        }
        public java.util.List<String> getCheckpointTypes() {
            return this.checkpointTypes;
        }

        public QueryScenarioModifyResponseBodyData setChosenPoints(java.util.List<String> chosenPoints) {
            this.chosenPoints = chosenPoints;
            return this;
        }
        public java.util.List<String> getChosenPoints() {
            return this.chosenPoints;
        }

        public QueryScenarioModifyResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryScenarioModifyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryScenarioModifyResponseBodyData setScenarioComponentValues(java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValues> scenarioComponentValues) {
            this.scenarioComponentValues = scenarioComponentValues;
            return this;
        }
        public java.util.List<QueryScenarioModifyResponseBodyDataScenarioComponentValues> getScenarioComponentValues() {
            return this.scenarioComponentValues;
        }

        public QueryScenarioModifyResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
