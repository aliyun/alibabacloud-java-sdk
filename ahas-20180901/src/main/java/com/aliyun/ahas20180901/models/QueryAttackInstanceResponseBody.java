// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAttackInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceResponseBody self = new QueryAttackInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackInstanceResponseBody setData(QueryAttackInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAttackInstanceResponseBodyData getData() {
        return this.data;
    }

    public QueryAttackInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackInstanceResponseBodyDataCheckPoints extends TeaModel {
        @NameInMap("measure")
        public String measure;

        @NameInMap("monitorPoint")
        public String monitorPoint;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static QueryAttackInstanceResponseBodyDataCheckPoints build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceResponseBodyDataCheckPoints self = new QueryAttackInstanceResponseBodyDataCheckPoints();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceResponseBodyDataCheckPoints setMeasure(String measure) {
            this.measure = measure;
            return this;
        }
        public String getMeasure() {
            return this.measure;
        }

        public QueryAttackInstanceResponseBodyDataCheckPoints setMonitorPoint(String monitorPoint) {
            this.monitorPoint = monitorPoint;
            return this;
        }
        public String getMonitorPoint() {
            return this.monitorPoint;
        }

        public QueryAttackInstanceResponseBodyDataCheckPoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAttackInstanceResponseBodyDataCheckPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("display")
        public Boolean display;

        @NameInMap("id")
        public String id;

        @NameInMap("necessary")
        public Boolean necessary;

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

        public static QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues self = new QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setNecessary(Boolean necessary) {
            this.necessary = necessary;
            return this;
        }
        public Boolean getNecessary() {
            return this.necessary;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setTooltip(String tooltip) {
            this.tooltip = tooltip;
            return this;
        }
        public String getTooltip() {
            return this.tooltip;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions extends TeaModel {
        @NameInMap("metaScenarioId")
        public String metaScenarioId;

        @NameInMap("metaScenarioName")
        public String metaScenarioName;

        @NameInMap("paramValues")
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues> paramValues;

        public static QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions self = new QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions setMetaScenarioId(String metaScenarioId) {
            this.metaScenarioId = metaScenarioId;
            return this;
        }
        public String getMetaScenarioId() {
            return this.metaScenarioId;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions setMetaScenarioName(String metaScenarioName) {
            this.metaScenarioName = metaScenarioName;
            return this;
        }
        public String getMetaScenarioName() {
            return this.metaScenarioName;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions setParamValues(java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues> paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesActionsParamValues> getParamValues() {
            return this.paramValues;
        }

    }

    public static class QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts extends TeaModel {
        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("deviceIp")
        public String deviceIp;

        public static QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts self = new QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

    }

    public static class QueryAttackInstanceResponseBodyDataScenarioComponentValues extends TeaModel {
        @NameInMap("actions")
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions> actions;

        @NameInMap("hosts")
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts> hosts;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static QueryAttackInstanceResponseBodyDataScenarioComponentValues build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceResponseBodyDataScenarioComponentValues self = new QueryAttackInstanceResponseBodyDataScenarioComponentValues();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValues setActions(java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesActions> getActions() {
            return this.actions;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValues setHosts(java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValuesHosts> getHosts() {
            return this.hosts;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValues setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAttackInstanceResponseBodyDataScenarioComponentValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAttackInstanceResponseBodyData extends TeaModel {
        @NameInMap("attackName")
        public String attackName;

        @NameInMap("availablePoints")
        public java.util.List<String> availablePoints;

        @NameInMap("checkPoints")
        public java.util.List<QueryAttackInstanceResponseBodyDataCheckPoints> checkPoints;

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
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValues> scenarioComponentValues;

        @NameInMap("startTime")
        public Long startTime;

        public static QueryAttackInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceResponseBodyData self = new QueryAttackInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceResponseBodyData setAttackName(String attackName) {
            this.attackName = attackName;
            return this;
        }
        public String getAttackName() {
            return this.attackName;
        }

        public QueryAttackInstanceResponseBodyData setAvailablePoints(java.util.List<String> availablePoints) {
            this.availablePoints = availablePoints;
            return this;
        }
        public java.util.List<String> getAvailablePoints() {
            return this.availablePoints;
        }

        public QueryAttackInstanceResponseBodyData setCheckPoints(java.util.List<QueryAttackInstanceResponseBodyDataCheckPoints> checkPoints) {
            this.checkPoints = checkPoints;
            return this;
        }
        public java.util.List<QueryAttackInstanceResponseBodyDataCheckPoints> getCheckPoints() {
            return this.checkPoints;
        }

        public QueryAttackInstanceResponseBodyData setCheckpointMeasures(java.util.List<String> checkpointMeasures) {
            this.checkpointMeasures = checkpointMeasures;
            return this;
        }
        public java.util.List<String> getCheckpointMeasures() {
            return this.checkpointMeasures;
        }

        public QueryAttackInstanceResponseBodyData setCheckpointTypes(java.util.List<String> checkpointTypes) {
            this.checkpointTypes = checkpointTypes;
            return this;
        }
        public java.util.List<String> getCheckpointTypes() {
            return this.checkpointTypes;
        }

        public QueryAttackInstanceResponseBodyData setChosenPoints(java.util.List<String> chosenPoints) {
            this.chosenPoints = chosenPoints;
            return this;
        }
        public java.util.List<String> getChosenPoints() {
            return this.chosenPoints;
        }

        public QueryAttackInstanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAttackInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAttackInstanceResponseBodyData setScenarioComponentValues(java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValues> scenarioComponentValues) {
            this.scenarioComponentValues = scenarioComponentValues;
            return this;
        }
        public java.util.List<QueryAttackInstanceResponseBodyDataScenarioComponentValues> getScenarioComponentValues() {
            return this.scenarioComponentValues;
        }

        public QueryAttackInstanceResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
