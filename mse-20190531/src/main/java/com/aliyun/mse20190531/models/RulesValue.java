// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RulesValue extends TeaModel {
    /**
     * <p>The status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>0</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The routing rule does not take effect</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>1</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The routing rule takes effect</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>2</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The routing rule is invalid</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Rate")
    public Integer rate;

    /**
     * <p>Specifies whether to enable the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The environment of the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The name of the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceNum")
    public Integer instanceNum;

    /**
     * <p>The details of the routing rule.</p>
     */
    @NameInMap("Rules")
    public RulesValueRules rules;

    public static RulesValue build(java.util.Map<String, ?> map) throws Exception {
        RulesValue self = new RulesValue();
        return TeaModel.build(map, self);
    }

    public RulesValue setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public RulesValue setRate(Integer rate) {
        this.rate = rate;
        return this;
    }
    public Integer getRate() {
        return this.rate;
    }

    public RulesValue setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public RulesValue setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public RulesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RulesValue setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RulesValue setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }
    public Integer getInstanceNum() {
        return this.instanceNum;
    }

    public RulesValue setRules(RulesValueRules rules) {
        this.rules = rules;
        return this;
    }
    public RulesValueRules getRules() {
        return this.rules;
    }

    public static class RulesValueRulesSpringcloudRestItems extends TeaModel {
        /**
         * <p>The value on which operators such as rawvalue are performed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("datum")
        public String datum;

        /**
         * <p>The operator. A value of rawvalue indicates direct comparison. A value of mode indicates the modulo operation. A value of list indicates using a whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Information about the fields that are required by the list operator.</p>
         */
        @NameInMap("nameList")
        public java.util.List<String> nameList;

        /**
         * <p>The comparison operator. Valid values: &gt;=, &lt;=, &gt;, &lt;, and ==.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The divisor that is required by the mod operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("divisor")
        public Integer divisor;

        /**
         * <p>The remainder.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("remainder")
        public Integer remainder;

        /**
         * <p>The rate. A value of 20 indicates that 20% of the traffic is routed to the tagged node.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("rate")
        public Integer rate;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public Object value;

        public static RulesValueRulesSpringcloudRestItems build(java.util.Map<String, ?> map) throws Exception {
            RulesValueRulesSpringcloudRestItems self = new RulesValueRulesSpringcloudRestItems();
            return TeaModel.build(map, self);
        }

        public RulesValueRulesSpringcloudRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public RulesValueRulesSpringcloudRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RulesValueRulesSpringcloudRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public RulesValueRulesSpringcloudRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public RulesValueRulesSpringcloudRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public RulesValueRulesSpringcloudRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public RulesValueRulesSpringcloudRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public RulesValueRulesSpringcloudRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RulesValueRulesSpringcloudRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RulesValueRulesSpringcloudRestItems setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class RulesValueRulesSpringcloud extends TeaModel {
        /**
         * <p>The logical operation relationships. Valid values: AND and OR.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        @NameInMap("restItems")
        public java.util.List<RulesValueRulesSpringcloudRestItems> restItems;

        /**
         * <p>The policy type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PERCENT</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONTENT</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTENT</p>
         */
        @NameInMap("triggerPolicy")
        public String triggerPolicy;

        /**
         * <p>Specifies whether to enable the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>@</strong></em></p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        /**
         * <p>The list of paths.</p>
         */
        @NameInMap("paths")
        public java.util.List<String> paths;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/hello</p>
         */
        @NameInMap("path")
        public String path;

        public static RulesValueRulesSpringcloud build(java.util.Map<String, ?> map) throws Exception {
            RulesValueRulesSpringcloud self = new RulesValueRulesSpringcloud();
            return TeaModel.build(map, self);
        }

        public RulesValueRulesSpringcloud setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public RulesValueRulesSpringcloud setRestItems(java.util.List<RulesValueRulesSpringcloudRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<RulesValueRulesSpringcloudRestItems> getRestItems() {
            return this.restItems;
        }

        public RulesValueRulesSpringcloud setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        public RulesValueRulesSpringcloud setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public RulesValueRulesSpringcloud setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public RulesValueRulesSpringcloud setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public RulesValueRulesSpringcloud setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public RulesValueRulesSpringcloud setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public RulesValueRulesSpringcloud setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class RulesValueRulesDubboArgumentItems extends TeaModel {
        /**
         * <p>The operator. A value of rawvalue indicates direct comparison. A value of mode indicates the modulo operation. A value of list indicates using a whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The list of names.</p>
         */
        @NameInMap("nameList")
        public java.util.List<String> nameList;

        /**
         * <p>The value on which operators such as rawvalue are performed.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("datum")
        public String datum;

        /**
         * <p>The comparison operator. Valid values: &gt;=, &lt;=, &gt;, &lt;, and ==.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The divisor that is required by the mod operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("divisor")
        public Integer divisor;

        /**
         * <p>The remainder.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("remainder")
        public Integer remainder;

        /**
         * <p>The rate. A value of 20 indicates that 20% of the traffic is routed to the tagged node.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("rate")
        public Integer rate;

        /**
         * <p>The position of the parameter, which starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The expression.</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The value that is used for comparison. The value obtained by the expression is compared with this value. If the list operator is used, data of the value parameter is separated by commas (,). For example, 1,2,3.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("value")
        public Object value;

        public static RulesValueRulesDubboArgumentItems build(java.util.Map<String, ?> map) throws Exception {
            RulesValueRulesDubboArgumentItems self = new RulesValueRulesDubboArgumentItems();
            return TeaModel.build(map, self);
        }

        public RulesValueRulesDubboArgumentItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RulesValueRulesDubboArgumentItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public RulesValueRulesDubboArgumentItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public RulesValueRulesDubboArgumentItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public RulesValueRulesDubboArgumentItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public RulesValueRulesDubboArgumentItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public RulesValueRulesDubboArgumentItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public RulesValueRulesDubboArgumentItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RulesValueRulesDubboArgumentItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public RulesValueRulesDubboArgumentItems setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class RulesValueRulesDubbo extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>@</strong></em></p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The tags.</p>
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
         * <p>The service name (interface).</p>
         * 
         * <strong>example:</strong>
         * <p>HelloService</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The group of the Dubbo application.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The version of the Dubbo application.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The method name of the Dubbo application.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("methodName")
        public String methodName;

        /**
         * <p>The list of parameter data types.</p>
         */
        @NameInMap("paramTypes")
        public java.util.List<String> paramTypes;

        /**
         * <p>The logical operation relationships. Valid values: AND and OR.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The list of parameter contents.</p>
         */
        @NameInMap("argumentItems")
        public java.util.List<RulesValueRulesDubboArgumentItems> argumentItems;

        public static RulesValueRulesDubbo build(java.util.Map<String, ?> map) throws Exception {
            RulesValueRulesDubbo self = new RulesValueRulesDubbo();
            return TeaModel.build(map, self);
        }

        public RulesValueRulesDubbo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public RulesValueRulesDubbo setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public RulesValueRulesDubbo setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        public RulesValueRulesDubbo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public RulesValueRulesDubbo setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public RulesValueRulesDubbo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public RulesValueRulesDubbo setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public RulesValueRulesDubbo setParamTypes(java.util.List<String> paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public java.util.List<String> getParamTypes() {
            return this.paramTypes;
        }

        public RulesValueRulesDubbo setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public RulesValueRulesDubbo setArgumentItems(java.util.List<RulesValueRulesDubboArgumentItems> argumentItems) {
            this.argumentItems = argumentItems;
            return this;
        }
        public java.util.List<RulesValueRulesDubboArgumentItems> getArgumentItems() {
            return this.argumentItems;
        }

    }

    public static class RulesValueRules extends TeaModel {
        /**
         * <p>The rule of the Spring Cloud application.</p>
         */
        @NameInMap("springcloud")
        public java.util.List<RulesValueRulesSpringcloud> springcloud;

        /**
         * <p>The rules of the Dubbo application.</p>
         */
        @NameInMap("dubbo")
        public java.util.List<RulesValueRulesDubbo> dubbo;

        public static RulesValueRules build(java.util.Map<String, ?> map) throws Exception {
            RulesValueRules self = new RulesValueRules();
            return TeaModel.build(map, self);
        }

        public RulesValueRules setSpringcloud(java.util.List<RulesValueRulesSpringcloud> springcloud) {
            this.springcloud = springcloud;
            return this;
        }
        public java.util.List<RulesValueRulesSpringcloud> getSpringcloud() {
            return this.springcloud;
        }

        public RulesValueRules setDubbo(java.util.List<RulesValueRulesDubbo> dubbo) {
            this.dubbo = dubbo;
            return this;
        }
        public java.util.List<RulesValueRulesDubbo> getDubbo() {
            return this.dubbo;
        }

    }

}
