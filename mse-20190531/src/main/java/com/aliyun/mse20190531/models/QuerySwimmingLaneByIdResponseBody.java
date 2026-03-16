// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySwimmingLaneByIdResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>{id:102,name:&quot;test&quot;}</p>
     */
    @NameInMap("Data")
    public QuerySwimmingLaneByIdResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69AD2AA7-DB47-449B-941B-B14409DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>匹配符</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>数值</p>
         * 
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("datum")
        public String datum;

        /**
         * <p>除数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("divisor")
        public Integer divisor;

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>名称列表</p>
         */
        @NameInMap("nameList")
        public java.util.List<String> nameList;

        /**
         * <p>操作符</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>百分比</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("rate")
        public Integer rate;

        /**
         * <p>余数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("remainder")
        public Integer remainder;

        /**
         * <p>匹配类型</p>
         * 
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>值</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
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
        /**
         * <p>条件</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>路径</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>路径列表</p>
         */
        @NameInMap("paths")
        public java.util.List<String> paths;

        /**
         * <p>Rest匹配规则列表</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PathIndependentPercentageEnable")
        public Boolean pathIndependentPercentageEnable;

        /**
         * <p>泳道开关</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>是否开启规则。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableRules")
        public Boolean enableRules;

        /**
         * <p>入口应用规则</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("entryRule")
        public String entryRule;

        /**
         * <p>入口应用规则详情</p>
         */
        @NameInMap("entryRules")
        public java.util.List<QuerySwimmingLaneByIdResponseBodyDataEntryRules> entryRules;

        /**
         * <p>MSE网关路由规则</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("gatewaySwimmingLaneRouteJson")
        public String gatewaySwimmingLaneRouteJson;

        /**
         * <p>规则创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1683598484000</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>规则修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1683598484000</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>泳道组Id。</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("groupId")
        public Long groupId;

        /**
         * <p>泳道ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>泳道名称</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>区域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>泳道状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>泳道对应的标签。</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        @NameInMap("tag")
        public String tag;

        public static QuerySwimmingLaneByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySwimmingLaneByIdResponseBodyData self = new QuerySwimmingLaneByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySwimmingLaneByIdResponseBodyData setPathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
            this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
            return this;
        }
        public Boolean getPathIndependentPercentageEnable() {
            return this.pathIndependentPercentageEnable;
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
