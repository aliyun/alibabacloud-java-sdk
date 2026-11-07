// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    /**
     * <p>The data overview.</p>
     */
    @NameInMap("Data")
    public ListApplicationsWithTagRulesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, the cause of the failure is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7466566F-F30F-4A29-965D-3E0AF21D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The comparison operator. Valid values: &gt;=, &lt;=, &gt;, &lt;, and ==.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The value to be compared for operators such as rawvalue.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("datum")
        public String datum;

        /**
         * <p>The field required for the mod operator, which is the divisor.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("divisor")
        public Integer divisor;

        /**
         * <p>The expression. For more information, see the descriptions of other fields.</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The parameter position, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The list of names.</p>
         */
        @NameInMap("nameList")
        public java.util.List<String> nameList;

        /**
         * <p>The operator. A value of rawvalue indicates direct comparison, mode indicates modulo operation, and list indicates a whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The proportion rule, where 20% of traffic is routed to the node corresponding to this tag.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("rate")
        public Integer rate;

        /**
         * <p>The field required for the percentage operation, which is the percentage value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("remainder")
        public Integer remainder;

        /**
         * <p>The value used for comparison. The value obtained from the expression is compared with this value. If the operator is a list whitelist, separate multiple values with commas (,), such as 1,2,3.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>@</strong></em></p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The list of parameter arguments.</p>
         */
        @NameInMap("argumentItems")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubboArgumentItems> argumentItems;

        /**
         * <p>The logical relationship among the following items. Valid values: AND and OR.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The Dubbo service group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The Dubbo service method name.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("methodName")
        public String methodName;

        /**
         * <p>The list of parameter types.</p>
         */
        @NameInMap("paramTypes")
        public java.util.List<String> paramTypes;

        /**
         * <p>The service name (interface).</p>
         * 
         * <strong>example:</strong>
         * <p>HelloService</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT</p>
         */
        @NameInMap("triggerPolicy")
        public String triggerPolicy;

        /**
         * <p>The Dubbo service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
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
        /**
         * <p>The comparison operator. Valid values: &gt;=, &lt;=, &gt;, &lt;, and ==.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The value to be compared for operators such as rawvalue.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("datum")
        public String datum;

        /**
         * <p>The field required for the mod operator, which is the divisor.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("divisor")
        public Integer divisor;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The field required for the list operator.</p>
         */
        @NameInMap("nameList")
        public java.util.List<String> nameList;

        /**
         * <p>The operator. A value of rawvalue indicates direct comparison, mode indicates modulo operation, and list indicates a whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The proportion rule, where 20% of traffic is routed to the node corresponding to this tag.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("rate")
        public Integer rate;

        /**
         * <p>The field required for the percentage operation, which is the percentage value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("remainder")
        public Integer remainder;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>@</strong></em></p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The logical relationship among the following items. Valid values: AND and OR.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>Specifies whether the feature is enabled.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/hello</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The list of paths.</p>
         */
        @NameInMap("paths")
        public java.util.List<String> paths;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>The list of matching conditions for REST requests.</p>
         */
        @NameInMap("restItems")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesSpringcloudRestItems> restItems;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT</p>
         */
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
        /**
         * <p>The Dubbo rule.</p>
         */
        @NameInMap("dubbo")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRulesDubbo> dubbo;

        /**
         * <p>The Spring Cloud rule.</p>
         */
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
         * <p>The enabling status of the alert rule. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>653</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>dubbo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The proportion.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The applicable routes of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;dubbo&quot;: [{
         *     &quot;serviceName&quot;: &quot;com.taobao.hsf.common.DemoService&quot;,
         *     &quot;group&quot;: &quot;&quot;,
         *     &quot;version&quot;: &quot;&quot;,
         *     &quot;methodName&quot;: &quot;sayHello&quot;,
         *     &quot;condition&quot;: &quot;AND&quot;,
         *     &quot;argumentItems&quot;: [{
         *         &quot;index&quot;: 0,
         *         &quot;expr&quot;: &quot;&quot;,
         *         &quot;operator&quot;: &quot;rawvalue&quot;,
         *         &quot;value&quot;: &quot;jim&quot;,
         *         &quot;cond&quot;: &quot;==&quot;
         *     }]
         *       }]
         *   }</p>
         */
        @NameInMap("Rules")
        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRulesRules rules;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>daqijp6c31@xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>service-lottery-core</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The MSE namespace to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The list of rules.</p>
         */
        @NameInMap("RouteRules")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules;

        /**
         * <p>The routing status. Valid values:</p>
         * <ul>
         * <li><p>0: Disabled.</p>
         * </li>
         * <li><p>1: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The data structure.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
