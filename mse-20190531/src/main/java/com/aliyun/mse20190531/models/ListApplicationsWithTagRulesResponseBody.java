// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ListApplicationsWithTagRulesResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned.</p>
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

    public static ListApplicationsWithTagRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsWithTagRulesResponseBody self = new ListApplicationsWithTagRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsWithTagRulesResponseBody setData(ListApplicationsWithTagRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApplicationsWithTagRulesResponseBodyData getData() {
        return this.data;
    }

    public ListApplicationsWithTagRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApplicationsWithTagRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationsWithTagRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsWithTagRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems extends TeaModel {
        @NameInMap("cond")
        public String cond;

        @NameInMap("datum")
        public String datum;

        @NameInMap("divisor")
        public Integer divisor;

        @NameInMap("expr")
        public String expr;

        @NameInMap("index")
        public Integer index;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("operator")
        public String operator;

        @NameInMap("rate")
        public Integer rate;

        @NameInMap("remainder")
        public Integer remainder;

        @NameInMap("value")
        public String value;

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("argumentItems")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems> argumentItems;

        @NameInMap("condition")
        public String condition;

        @NameInMap("group")
        public String group;

        @NameInMap("methodName")
        public String methodName;

        @NameInMap("paramTypes")
        public java.util.List<String> paramTypes;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("triggerPolicy")
        public String triggerPolicy;

        @NameInMap("version")
        public String version;

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setArgumentItems(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems> argumentItems) {
            this.argumentItems = argumentItems;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems> getArgumentItems() {
            return this.argumentItems;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setParamTypes(java.util.List<String> paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public java.util.List<String> getParamTypes() {
            return this.paramTypes;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems extends TeaModel {
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

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("condition")
        public String condition;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("path")
        public String path;

        @NameInMap("paths")
        public java.util.List<String> paths;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("restItems")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems> restItems;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("triggerPolicy")
        public String triggerPolicy;

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setRestItems(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems> getRestItems() {
            return this.restItems;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules extends TeaModel {
        @NameInMap("dubbo")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo> dubbo;

        @NameInMap("springcloud")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud> springcloud;

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules setDubbo(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo> dubbo) {
            this.dubbo = dubbo;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo> getDubbo() {
            return this.dubbo;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules setSpringcloud(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud> springcloud) {
            this.springcloud = springcloud;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloud> getSpringcloud() {
            return this.springcloud;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRules extends TeaModel {
        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        /**
         * <p>The rule name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rate.</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The details of the routing rule.</p>
         */
        @NameInMap("Rules")
        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules rules;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRules build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRules self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRules();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setRules(ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules rules) {
            this.rules = rules;
            return this;
        }
        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules getRules() {
            return this.rules;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResult extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The MSE namespace to which the application belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The queried rules.</p>
         */
        @NameInMap("RouteRules")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules;

        /**
         * <p>The route state. Valid values:</p>
         * <br>
         * <p>*   0: disabled</p>
         * <p>*   1: enabled</p>
         */
        @NameInMap("RouteStatus")
        public Long routeStatus;

        public static ListApplicationsWithTagRulesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResult self = new ListApplicationsWithTagRulesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setRouteRules(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> getRouteRules() {
            return this.routeRules;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setRouteStatus(Long routeStatus) {
            this.routeStatus = routeStatus;
            return this;
        }
        public Long getRouteStatus() {
            return this.routeStatus;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListApplicationsWithTagRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyData self = new ListApplicationsWithTagRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListApplicationsWithTagRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApplicationsWithTagRulesResponseBodyData setResult(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListApplicationsWithTagRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
