// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackScenarioDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAttackScenarioDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackScenarioDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackScenarioDetailResponseBody self = new QueryAttackScenarioDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackScenarioDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackScenarioDetailResponseBody setData(QueryAttackScenarioDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAttackScenarioDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryAttackScenarioDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackScenarioDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackScenarioDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackScenarioDetailResponseBodyDataCheckPoints extends TeaModel {
        @NameInMap("measure")
        public String measure;

        @NameInMap("monitorPoint")
        public String monitorPoint;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static QueryAttackScenarioDetailResponseBodyDataCheckPoints build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackScenarioDetailResponseBodyDataCheckPoints self = new QueryAttackScenarioDetailResponseBodyDataCheckPoints();
            return TeaModel.build(map, self);
        }

        public QueryAttackScenarioDetailResponseBodyDataCheckPoints setMeasure(String measure) {
            this.measure = measure;
            return this;
        }
        public String getMeasure() {
            return this.measure;
        }

        public QueryAttackScenarioDetailResponseBodyDataCheckPoints setMonitorPoint(String monitorPoint) {
            this.monitorPoint = monitorPoint;
            return this;
        }
        public String getMonitorPoint() {
            return this.monitorPoint;
        }

        public QueryAttackScenarioDetailResponseBodyDataCheckPoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAttackScenarioDetailResponseBodyDataCheckPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues extends TeaModel {
        @NameInMap("defaultValue")
        public String defaultValue;

        @NameInMap("desc")
        public String desc;

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
        public java.util.Map<String, ?> options;

        @NameInMap("placeholder")
        public String placeholder;

        @NameInMap("type")
        public String type;

        @NameInMap("unit")
        public String unit;

        @NameInMap("value")
        public String value;

        public static QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues self = new QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues();
            return TeaModel.build(map, self);
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setNecessary(Boolean necessary) {
            this.necessary = necessary;
            return this;
        }
        public Boolean getNecessary() {
            return this.necessary;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setNumberMaxValue(Long numberMaxValue) {
            this.numberMaxValue = numberMaxValue;
            return this;
        }
        public Long getNumberMaxValue() {
            return this.numberMaxValue;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setNumberMinValue(Long numberMinValue) {
            this.numberMinValue = numberMinValue;
            return this;
        }
        public Long getNumberMinValue() {
            return this.numberMinValue;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setOptions(java.util.Map<String, ?> options) {
            this.options = options;
            return this;
        }
        public java.util.Map<String, ?> getOptions() {
            return this.options;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions extends TeaModel {
        @NameInMap("command")
        public String command;

        @NameInMap("display")
        public Boolean display;

        @NameInMap("metaScenarioId")
        public String metaScenarioId;

        @NameInMap("metaScenarioName")
        public String metaScenarioName;

        @NameInMap("paramValues")
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues> paramValues;

        @NameInMap("tooltip")
        public String tooltip;

        public static QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions self = new QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions();
            return TeaModel.build(map, self);
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions setMetaScenarioId(String metaScenarioId) {
            this.metaScenarioId = metaScenarioId;
            return this;
        }
        public String getMetaScenarioId() {
            return this.metaScenarioId;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions setMetaScenarioName(String metaScenarioName) {
            this.metaScenarioName = metaScenarioName;
            return this;
        }
        public String getMetaScenarioName() {
            return this.metaScenarioName;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions setParamValues(java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues> paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActionsParamValues> getParamValues() {
            return this.paramValues;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions setTooltip(String tooltip) {
            this.tooltip = tooltip;
            return this;
        }
        public String getTooltip() {
            return this.tooltip;
        }

    }

    public static class QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts extends TeaModel {
        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("deviceIp")
        public String deviceIp;

        public static QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts self = new QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts();
            return TeaModel.build(map, self);
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

    }

    public static class QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues extends TeaModel {
        @NameInMap("actions")
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions> actions;

        @NameInMap("hosts")
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts> hosts;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues self = new QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues();
            return TeaModel.build(map, self);
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues setActions(java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesActions> getActions() {
            return this.actions;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues setHosts(java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValuesHosts> getHosts() {
            return this.hosts;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAttackScenarioDetailResponseBodyData extends TeaModel {
        @NameInMap("attackName")
        public String attackName;

        @NameInMap("availablePoints")
        public java.util.List<String> availablePoints;

        @NameInMap("checkPoints")
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataCheckPoints> checkPoints;

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
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues> scenarioComponentValues;

        @NameInMap("startTime")
        public Long startTime;

        public static QueryAttackScenarioDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackScenarioDetailResponseBodyData self = new QueryAttackScenarioDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackScenarioDetailResponseBodyData setAttackName(String attackName) {
            this.attackName = attackName;
            return this;
        }
        public String getAttackName() {
            return this.attackName;
        }

        public QueryAttackScenarioDetailResponseBodyData setAvailablePoints(java.util.List<String> availablePoints) {
            this.availablePoints = availablePoints;
            return this;
        }
        public java.util.List<String> getAvailablePoints() {
            return this.availablePoints;
        }

        public QueryAttackScenarioDetailResponseBodyData setCheckPoints(java.util.List<QueryAttackScenarioDetailResponseBodyDataCheckPoints> checkPoints) {
            this.checkPoints = checkPoints;
            return this;
        }
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataCheckPoints> getCheckPoints() {
            return this.checkPoints;
        }

        public QueryAttackScenarioDetailResponseBodyData setCheckpointMeasures(java.util.List<String> checkpointMeasures) {
            this.checkpointMeasures = checkpointMeasures;
            return this;
        }
        public java.util.List<String> getCheckpointMeasures() {
            return this.checkpointMeasures;
        }

        public QueryAttackScenarioDetailResponseBodyData setCheckpointTypes(java.util.List<String> checkpointTypes) {
            this.checkpointTypes = checkpointTypes;
            return this;
        }
        public java.util.List<String> getCheckpointTypes() {
            return this.checkpointTypes;
        }

        public QueryAttackScenarioDetailResponseBodyData setChosenPoints(java.util.List<String> chosenPoints) {
            this.chosenPoints = chosenPoints;
            return this;
        }
        public java.util.List<String> getChosenPoints() {
            return this.chosenPoints;
        }

        public QueryAttackScenarioDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAttackScenarioDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAttackScenarioDetailResponseBodyData setScenarioComponentValues(java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues> scenarioComponentValues) {
            this.scenarioComponentValues = scenarioComponentValues;
            return this;
        }
        public java.util.List<QueryAttackScenarioDetailResponseBodyDataScenarioComponentValues> getScenarioComponentValues() {
            return this.scenarioComponentValues;
        }

        public QueryAttackScenarioDetailResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
