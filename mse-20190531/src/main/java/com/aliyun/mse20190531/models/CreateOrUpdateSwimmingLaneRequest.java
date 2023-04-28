// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("EnableRules")
    public Boolean enableRules;

    @NameInMap("EntryRule")
    public String entryRule;

    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> entryRules;

    @NameInMap("GatewaySwimmingLaneRouteJson")
    public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    /**
     * <p>MSE命名空间名字</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public String tag;

    public static CreateOrUpdateSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneRequest self = new CreateOrUpdateSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateOrUpdateSwimmingLaneRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateOrUpdateSwimmingLaneRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    public CreateOrUpdateSwimmingLaneRequest setEntryRule(String entryRule) {
        this.entryRule = entryRule;
        return this;
    }
    public String getEntryRule() {
        return this.entryRule;
    }

    public CreateOrUpdateSwimmingLaneRequest setEntryRules(java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> getEntryRules() {
        return this.entryRules;
    }

    public CreateOrUpdateSwimmingLaneRequest setGatewaySwimmingLaneRouteJson(CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson) {
        this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
        return this;
    }
    public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson getGatewaySwimmingLaneRouteJson() {
        return this.gatewaySwimmingLaneRouteJson;
    }

    public CreateOrUpdateSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateSwimmingLaneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateSwimmingLaneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSwimmingLaneRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateOrUpdateSwimmingLaneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateSwimmingLaneRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public static class CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems extends TeaModel {
        @NameInMap("Cond")
        public String cond;

        @NameInMap("Datum")
        public String datum;

        @NameInMap("Divisor")
        public Integer divisor;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameList")
        public java.util.List<String> nameList;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("Remainder")
        public Integer remainder;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems self = new CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestEntryRules extends TeaModel {
        @NameInMap("Condition")
        public String condition;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RestItems")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems> restItems;

        public static CreateOrUpdateSwimmingLaneRequestEntryRules build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestEntryRules self = new CreateOrUpdateSwimmingLaneRequestEntryRules();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRules setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRules setRestItems(java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems> getRestItems() {
            return this.restItems;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions extends TeaModel {
        @NameInMap("Cond")
        public String cond;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions self = new CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions> conditions;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("RouteIdList")
        public java.util.List<Long> routeIdList;

        public static CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson self = new CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setConditions(java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions> getConditions() {
            return this.conditions;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setRouteIdList(java.util.List<Long> routeIdList) {
            this.routeIdList = routeIdList;
            return this;
        }
        public java.util.List<Long> getRouteIdList() {
            return this.routeIdList;
        }

    }

}
