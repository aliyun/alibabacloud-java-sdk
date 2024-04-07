// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryAllSwimmingLaneResponseBodyData> data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAllSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneResponseBody self = new QueryAllSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneResponseBody setData(java.util.List<QueryAllSwimmingLaneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAllSwimmingLaneResponseBodyData> getData() {
        return this.data;
    }

    public QueryAllSwimmingLaneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryAllSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllSwimmingLaneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems extends TeaModel {
        @NameInMap("cond")
        public String cond;

        @NameInMap("datum")
        public String datum;

        @NameInMap("divisor")
        public Integer divisor;

        @NameInMap("name")
        public String name;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("operator")
        public String operator;

        @NameInMap("rate")
        public Integer rate;

        @NameInMap("remainder")
        public Integer remainder;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems self = new QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems();
            return TeaModel.build(map, self);
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAllSwimmingLaneResponseBodyDataEntryRules extends TeaModel {
        @NameInMap("condition")
        public String condition;

        @NameInMap("path")
        public String path;

        @NameInMap("paths")
        public java.util.List<String> paths;

        @NameInMap("restItems")
        public java.util.List<QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems> restItems;

        public static QueryAllSwimmingLaneResponseBodyDataEntryRules build(java.util.Map<String, ?> map) throws Exception {
            QueryAllSwimmingLaneResponseBodyDataEntryRules self = new QueryAllSwimmingLaneResponseBodyDataEntryRules();
            return TeaModel.build(map, self);
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRules setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public QueryAllSwimmingLaneResponseBodyDataEntryRules setRestItems(java.util.List<QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<QueryAllSwimmingLaneResponseBodyDataEntryRulesRestItems> getRestItems() {
            return this.restItems;
        }

    }

    public static class QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions extends TeaModel {
        @NameInMap("Cond")
        public String cond;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions build(java.util.Map<String, ?> map) throws Exception {
            QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions self = new QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions();
            return TeaModel.build(map, self);
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute extends TeaModel {
        @NameInMap("CanaryModel")
        public Integer canaryModel;

        @NameInMap("Conditions")
        public java.util.List<QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions> conditions;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("RouteIdList")
        public java.util.List<Long> routeIdList;

        public static QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute build(java.util.Map<String, ?> map) throws Exception {
            QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute self = new QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute();
            return TeaModel.build(map, self);
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute setCanaryModel(Integer canaryModel) {
            this.canaryModel = canaryModel;
            return this;
        }
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute setConditions(java.util.List<QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRouteConditions> getConditions() {
            return this.conditions;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute setRouteIdList(java.util.List<Long> routeIdList) {
            this.routeIdList = routeIdList;
            return this;
        }
        public java.util.List<Long> getRouteIdList() {
            return this.routeIdList;
        }

    }

    public static class QueryAllSwimmingLaneResponseBodyData extends TeaModel {
        @NameInMap("EntryRules")
        public java.util.List<QueryAllSwimmingLaneResponseBodyDataEntryRules> entryRules;

        @NameInMap("GatewaySwimmingLaneRoute")
        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute gatewaySwimmingLaneRoute;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MessageQueueFilterSide")
        public String messageQueueFilterSide;

        @NameInMap("MessageQueueGrayEnable")
        public Boolean messageQueueGrayEnable;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RecordCanaryDetail")
        public Boolean recordCanaryDetail;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("enableRules")
        public Boolean enableRules;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        public static QueryAllSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAllSwimmingLaneResponseBodyData self = new QueryAllSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAllSwimmingLaneResponseBodyData setEntryRules(java.util.List<QueryAllSwimmingLaneResponseBodyDataEntryRules> entryRules) {
            this.entryRules = entryRules;
            return this;
        }
        public java.util.List<QueryAllSwimmingLaneResponseBodyDataEntryRules> getEntryRules() {
            return this.entryRules;
        }

        public QueryAllSwimmingLaneResponseBodyData setGatewaySwimmingLaneRoute(QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute gatewaySwimmingLaneRoute) {
            this.gatewaySwimmingLaneRoute = gatewaySwimmingLaneRoute;
            return this;
        }
        public QueryAllSwimmingLaneResponseBodyDataGatewaySwimmingLaneRoute getGatewaySwimmingLaneRoute() {
            return this.gatewaySwimmingLaneRoute;
        }

        public QueryAllSwimmingLaneResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryAllSwimmingLaneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllSwimmingLaneResponseBodyData setMessageQueueFilterSide(String messageQueueFilterSide) {
            this.messageQueueFilterSide = messageQueueFilterSide;
            return this;
        }
        public String getMessageQueueFilterSide() {
            return this.messageQueueFilterSide;
        }

        public QueryAllSwimmingLaneResponseBodyData setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
            this.messageQueueGrayEnable = messageQueueGrayEnable;
            return this;
        }
        public Boolean getMessageQueueGrayEnable() {
            return this.messageQueueGrayEnable;
        }

        public QueryAllSwimmingLaneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllSwimmingLaneResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryAllSwimmingLaneResponseBodyData setRecordCanaryDetail(Boolean recordCanaryDetail) {
            this.recordCanaryDetail = recordCanaryDetail;
            return this;
        }
        public Boolean getRecordCanaryDetail() {
            return this.recordCanaryDetail;
        }

        public QueryAllSwimmingLaneResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryAllSwimmingLaneResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryAllSwimmingLaneResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryAllSwimmingLaneResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public QueryAllSwimmingLaneResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAllSwimmingLaneResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
