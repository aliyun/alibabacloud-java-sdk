// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiStageDetailResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("Variables")
    public DescribeApiStageDetailResponseBodyVariables variables;

    public static DescribeApiStageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiStageDetailResponseBody self = new DescribeApiStageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiStageDetailResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiStageDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiStageDetailResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiStageDetailResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiStageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiStageDetailResponseBody setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public DescribeApiStageDetailResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApiStageDetailResponseBody setVariables(DescribeApiStageDetailResponseBodyVariables variables) {
        this.variables = variables;
        return this;
    }
    public DescribeApiStageDetailResponseBodyVariables getVariables() {
        return this.variables;
    }

    public static class DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem extends TeaModel {
        @NameInMap("ConditionValue")
        public String conditionValue;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("ResultValue")
        public String resultValue;

        public static DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem self = new DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem setResultValue(String resultValue) {
            this.resultValue = resultValue;
            return this;
        }
        public String getResultValue() {
            return this.resultValue;
        }

    }

    public static class DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules extends TeaModel {
        @NameInMap("RouteRuleItem")
        public java.util.List<DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem> routeRuleItem;

        public static DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules self = new DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules setRouteRuleItem(java.util.List<DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem> routeRuleItem) {
            this.routeRuleItem = routeRuleItem;
            return this;
        }
        public java.util.List<DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRulesRouteRuleItem> getRouteRuleItem() {
            return this.routeRuleItem;
        }

    }

    public static class DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel extends TeaModel {
        @NameInMap("Location")
        public String location;

        @NameInMap("ParameterCatalog")
        public String parameterCatalog;

        @NameInMap("ParameterType")
        public String parameterType;

        @NameInMap("RouteMatchSymbol")
        public String routeMatchSymbol;

        @NameInMap("RouteRules")
        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules routeRules;

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel self = new DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel setParameterCatalog(String parameterCatalog) {
            this.parameterCatalog = parameterCatalog;
            return this;
        }
        public String getParameterCatalog() {
            return this.parameterCatalog;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel setRouteMatchSymbol(String routeMatchSymbol) {
            this.routeMatchSymbol = routeMatchSymbol;
            return this;
        }
        public String getRouteMatchSymbol() {
            return this.routeMatchSymbol;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel setRouteRules(DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModelRouteRules getRouteRules() {
            return this.routeRules;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiStageDetailResponseBodyVariablesVariableItem extends TeaModel {
        @NameInMap("StageRouteModel")
        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel stageRouteModel;

        @NameInMap("SupportRoute")
        public Boolean supportRoute;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableValue")
        public String variableValue;

        public static DescribeApiStageDetailResponseBodyVariablesVariableItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageDetailResponseBodyVariablesVariableItem self = new DescribeApiStageDetailResponseBodyVariablesVariableItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItem setStageRouteModel(DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel stageRouteModel) {
            this.stageRouteModel = stageRouteModel;
            return this;
        }
        public DescribeApiStageDetailResponseBodyVariablesVariableItemStageRouteModel getStageRouteModel() {
            return this.stageRouteModel;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItem setSupportRoute(Boolean supportRoute) {
            this.supportRoute = supportRoute;
            return this;
        }
        public Boolean getSupportRoute() {
            return this.supportRoute;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItem setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public DescribeApiStageDetailResponseBodyVariablesVariableItem setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class DescribeApiStageDetailResponseBodyVariables extends TeaModel {
        @NameInMap("VariableItem")
        public java.util.List<DescribeApiStageDetailResponseBodyVariablesVariableItem> variableItem;

        public static DescribeApiStageDetailResponseBodyVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiStageDetailResponseBodyVariables self = new DescribeApiStageDetailResponseBodyVariables();
            return TeaModel.build(map, self);
        }

        public DescribeApiStageDetailResponseBodyVariables setVariableItem(java.util.List<DescribeApiStageDetailResponseBodyVariablesVariableItem> variableItem) {
            this.variableItem = variableItem;
            return this;
        }
        public java.util.List<DescribeApiStageDetailResponseBodyVariablesVariableItem> getVariableItem() {
            return this.variableItem;
        }

    }

}
