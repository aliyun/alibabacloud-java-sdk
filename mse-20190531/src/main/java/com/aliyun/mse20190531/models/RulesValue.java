// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RulesValue extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("Rate")
    public Integer rate;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Tag")
    public String tag;

    /**
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceNum")
    public Integer instanceNum;

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
        @NameInMap("datum")
        public String datum;

        @NameInMap("operator")
        public String operator;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("cond")
        public String cond;

        @NameInMap("divisor")
        public Integer divisor;

        @NameInMap("remainder")
        public Integer remainder;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("rate")
        public Integer rate;

        @NameInMap("type")
        public String type;

        @NameInMap("name")
        public String name;

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
        @NameInMap("condition")
        public String condition;

        @NameInMap("restItems")
        public java.util.List<RulesValueRulesSpringcloudRestItems> restItems;

        @NameInMap("triggerPolicy")
        public String triggerPolicy;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("appId")
        public String appId;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("paths")
        public java.util.List<String> paths;

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
        @NameInMap("operator")
        public String operator;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("datum")
        public String datum;

        @NameInMap("cond")
        public String cond;

        @NameInMap("divisor")
        public Integer divisor;

        @NameInMap("remainder")
        public Integer remainder;

        @NameInMap("rate")
        public Integer rate;

        @NameInMap("index")
        public Integer index;

        @NameInMap("expr")
        public String expr;

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
        @NameInMap("appId")
        public String appId;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("triggerPolicy")
        public String triggerPolicy;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("group")
        public String group;

        @NameInMap("version")
        public String version;

        @NameInMap("methodName")
        public String methodName;

        @NameInMap("paramTypes")
        public java.util.List<String> paramTypes;

        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

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
        @NameInMap("springcloud")
        public java.util.List<RulesValueRulesSpringcloud> springcloud;

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
