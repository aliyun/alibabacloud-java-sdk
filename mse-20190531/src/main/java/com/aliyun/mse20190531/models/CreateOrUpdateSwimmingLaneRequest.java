// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh and en. Default value: zh. The value zh indicates Chinese, and the value en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to enable the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Specifies whether to configure a routing rule for the lane. If an Ingress gateway is used, this parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRules")
    public Boolean enableRules;

    /**
     * <p>The JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EntryRule")
    @Deprecated
    public String entryRule;

    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> entryRules;

    /**
     * <p>The information about the routing rule for the gateway. This parameter is required when a cloud-native gateway is used as the ingress.</p>
     */
    @NameInMap("GatewaySwimmingLaneRouteJson")
    public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson;

    /**
     * <p>The language of the response. Valid values:****</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US</strong>: English</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>zh-CN</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the primary key. The value -1 indicates a request that is used to create a lane. A value greater than 0 indicates a request that is used to modify a lane.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the lane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test lane</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PathIndependentPercentageEnable")
    public Boolean pathIndependentPercentageEnable;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tag.</p>
     * 
     * <strong>example:</strong>
     * <p>gray</p>
     */
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

    public CreateOrUpdateSwimmingLaneRequest setPathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
        this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
        return this;
    }
    public Boolean getPathIndependentPercentageEnable() {
        return this.pathIndependentPercentageEnable;
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
        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
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
        /**
         * <p>The matching condition. Valid values:</p>
         * <ul>
         * <li>PRE: prefix matching</li>
         * <li>EQUAL: exact matching</li>
         * <li>ERGULAR: regular expression matching</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Cond")
        public String cond;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the parameter. Valid values:</p>
         * <ul>
         * <li>header</li>
         * <li>param</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoming</p>
         */
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

    public static class CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList extends TeaModel {
        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("RouteId")
        public Long routeId;

        public static CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList self = new CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanaryModel")
        public Integer canaryModel;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonConditions> conditions;

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-84efde2ee1464260bdb17a5b****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The route IDs.</p>
         */
        @NameInMap("RouteIdList")
        public java.util.List<Long> routeIdList;

        @NameInMap("RouteIndependentPercentageEnable")
        public Boolean routeIndependentPercentageEnable;

        @NameInMap("RouteIndependentPercentageList")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList> routeIndependentPercentageList;

        public static CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson self = new CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setCanaryModel(Integer canaryModel) {
            this.canaryModel = canaryModel;
            return this;
        }
        public Integer getCanaryModel() {
            return this.canaryModel;
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

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setRouteIdList(java.util.List<Long> routeIdList) {
            this.routeIdList = routeIdList;
            return this;
        }
        public java.util.List<Long> getRouteIdList() {
            return this.routeIdList;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setRouteIndependentPercentageEnable(Boolean routeIndependentPercentageEnable) {
            this.routeIndependentPercentageEnable = routeIndependentPercentageEnable;
            return this;
        }
        public Boolean getRouteIndependentPercentageEnable() {
            return this.routeIndependentPercentageEnable;
        }

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setRouteIndependentPercentageList(java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList> routeIndependentPercentageList) {
            this.routeIndependentPercentageList = routeIndependentPercentageList;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJsonRouteIndependentPercentageList> getRouteIndependentPercentageList() {
            return this.routeIndependentPercentageList;
        }

    }

}
