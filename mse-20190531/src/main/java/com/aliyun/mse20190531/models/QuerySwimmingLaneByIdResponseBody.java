// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySwimmingLaneByIdResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public QuerySwimmingLaneByIdResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
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

    public static QuerySwimmingLaneByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySwimmingLaneByIdResponseBody self = new QuerySwimmingLaneByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySwimmingLaneByIdResponseBody setData(QuerySwimmingLaneByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySwimmingLaneByIdResponseBodyData getData() {
        return this.data;
    }

    public QuerySwimmingLaneByIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QuerySwimmingLaneByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySwimmingLaneByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySwimmingLaneByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems extends TeaModel {
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

        public static QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems self = new QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems();
            return TeaModel.build(map, self);
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QuerySwimmingLaneByIdResponseBodyDataEntryRules extends TeaModel {
        @NameInMap("condition")
        public String condition;

        @NameInMap("path")
        public String path;

        @NameInMap("paths")
        public java.util.List<String> paths;

        @NameInMap("restItems")
        public java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems> restItems;

        public static QuerySwimmingLaneByIdResponseBodyDataEntryRules build(java.util.Map<String, ?> map) throws Exception {
            QuerySwimmingLaneByIdResponseBodyDataEntryRules self = new QuerySwimmingLaneByIdResponseBodyDataEntryRules();
            return TeaModel.build(map, self);
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRules setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public QuerySwimmingLaneByIdResponseBodyDataEntryRules setRestItems(java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRulesRestItems> getRestItems() {
            return this.restItems;
        }

    }

    public static class QuerySwimmingLaneByIdResponseBodyData extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("enableRules")
        public Boolean enableRules;

        @NameInMap("entryRule")
        public String entryRule;

        @NameInMap("entryRules")
        public java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRules> entryRules;

        @NameInMap("gatewaySwimmingLaneRouteJson")
        public String gatewaySwimmingLaneRouteJson;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("groupId")
        public Long groupId;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("tag")
        public String tag;

        public static QuerySwimmingLaneByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySwimmingLaneByIdResponseBodyData self = new QuerySwimmingLaneByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySwimmingLaneByIdResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QuerySwimmingLaneByIdResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public QuerySwimmingLaneByIdResponseBodyData setEntryRule(String entryRule) {
            this.entryRule = entryRule;
            return this;
        }
        public String getEntryRule() {
            return this.entryRule;
        }

        public QuerySwimmingLaneByIdResponseBodyData setEntryRules(java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRules> entryRules) {
            this.entryRules = entryRules;
            return this;
        }
        public java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRules> getEntryRules() {
            return this.entryRules;
        }

        public QuerySwimmingLaneByIdResponseBodyData setGatewaySwimmingLaneRouteJson(String gatewaySwimmingLaneRouteJson) {
            this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
            return this;
        }
        public String getGatewaySwimmingLaneRouteJson() {
            return this.gatewaySwimmingLaneRouteJson;
        }

        public QuerySwimmingLaneByIdResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySwimmingLaneByIdResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QuerySwimmingLaneByIdResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QuerySwimmingLaneByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySwimmingLaneByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySwimmingLaneByIdResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QuerySwimmingLaneByIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QuerySwimmingLaneByIdResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
