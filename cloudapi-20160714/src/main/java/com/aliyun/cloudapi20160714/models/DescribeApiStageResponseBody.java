// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiStageResponseBody extends TeaModel {
    @NameInMap("StageId")
    public String stageId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Description")
    public String description;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Variables")
    public DescribeApiStageResponseBodyVariables variables;

    public static DescribeApiStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiStageResponseBody self = new DescribeApiStageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiStageResponseBody setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public DescribeApiStageResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiStageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiStageResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiStageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiStageResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApiStageResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiStageResponseBody setVariables(DescribeApiStageResponseBodyVariables variables) {
        this.variables = variables;
        return this;
    }
    public DescribeApiStageResponseBodyVariables getVariables() {
        return this.variables;
    }

    public static class DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem extends TeaModel {
        @NameInMap("ResultValue")
        public String resultValue;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("ConditionValue")
        public String conditionValue;

        @NameInMap("MaxValue")
        public Long maxValue;

        public static DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem self = new DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setResultValue(String resultValue) {
            this.resultValue = resultValue;
            return this;
        }
        public String getResultValue() {
            return this.resultValue;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

    }

    public static class DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules extends TeaModel {
        @NameInMap("RouteRuleItem")
        public java.util.List<DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem> routeRuleItem;

        public static DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules self = new DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules setRouteRuleItem(java.util.List<DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem> routeRuleItem) {
            this.routeRuleItem = routeRuleItem;
            return this;
        }
        public java.util.List<DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem> getRouteRuleItem() {
            return this.routeRuleItem;
        }

    }

    public static class DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel extends TeaModel {
        @NameInMap("RouteMatchSymbol")
        public String routeMatchSymbol;

        @NameInMap("ParameterType")
        public String parameterType;

        @NameInMap("Location")
        public String location;

        @NameInMap("ParameterCatalog")
        public String parameterCatalog;

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        @NameInMap("RouteRules")
        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules routeRules;

        public static DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel self = new DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel setRouteMatchSymbol(String routeMatchSymbol) {
            this.routeMatchSymbol = routeMatchSymbol;
            return this;
        }
        public String getRouteMatchSymbol() {
            return this.routeMatchSymbol;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel setParameterCatalog(String parameterCatalog) {
            this.parameterCatalog = parameterCatalog;
            return this;
        }
        public String getParameterCatalog() {
            return this.parameterCatalog;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel setRouteRules(DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModelRouteRules getRouteRules() {
            return this.routeRules;
        }

    }

    public static class DescribeApiStageResponseBodyVariablesVariableItem extends TeaModel {
        @NameInMap("VariableValue")
        public String variableValue;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("SupportRoute")
        public Boolean supportRoute;

        @NameInMap("StageRouteModel")
        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel stageRouteModel;

        public static DescribeApiStageResponseBodyVariablesVariableItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageResponseBodyVariablesVariableItem self = new DescribeApiStageResponseBodyVariablesVariableItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageResponseBodyVariablesVariableItem setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public DescribeApiStageResponseBodyVariablesVariableItem setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public DescribeApiStageResponseBodyVariablesVariableItem setSupportRoute(Boolean supportRoute) {
            this.supportRoute = supportRoute;
            return this;
        }
        public Boolean getSupportRoute() {
            return this.supportRoute;
        }

        public DescribeApiStageResponseBodyVariablesVariableItem setStageRouteModel(DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel stageRouteModel) {
            this.stageRouteModel = stageRouteModel;
            return this;
        }
        public DescribeApiStageResponseBodyVariablesVariableItemStageRouteModel getStageRouteModel() {
            return this.stageRouteModel;
        }

    }

    public static class DescribeApiStageResponseBodyVariables extends TeaModel {
        @NameInMap("VariableItem")
        public java.util.List<DescribeApiStageResponseBodyVariablesVariableItem> variableItem;

        public static DescribeApiStageResponseBodyVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageResponseBodyVariables self = new DescribeApiStageResponseBodyVariables();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageResponseBodyVariables setVariableItem(java.util.List<DescribeApiStageResponseBodyVariablesVariableItem> variableItem) {
            this.variableItem = variableItem;
            return this;
        }
        public java.util.List<DescribeApiStageResponseBodyVariablesVariableItem> getVariableItem() {
            return this.variableItem;
        }

    }

}
