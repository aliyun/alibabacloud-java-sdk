// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The language in which the results are returned. Valid values: zh (Chinese, default) and en (English).</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether the lane is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Specifies whether to configure routing rules for the lane. Configuration is not required if the ingress is a gateway.</p>
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
     * <p>[{&quot;Priority&quot;:1,&quot;Paths&quot;:[],&quot;Condition&quot;:&quot;AND&quot;,&quot;RestItems&quot;:[{&quot;Type&quot;:&quot;param&quot;,&quot;Name&quot;:&quot;name&quot;,&quot;Value&quot;:&quot;xiaoming&quot;,&quot;Cond&quot;:&quot;==&quot;,&quot;Operator&quot;:&quot;rawvalue&quot;}]}]</p>
     */
    @NameInMap("EntryRule")
    @Deprecated
    public String entryRule;

    /**
     * <p>The collection of lane rules.</p>
     */
    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> entryRules;

    /**
     * <p>The gateway routing information. This parameter is used when a cloud-native gateway is used as the ingress.</p>
     */
    @NameInMap("GatewaySwimmingLaneRouteJson")
    public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson;

    /**
     * <p>The ID of the lane group to which the lane belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The primary key ID. A value of -1 indicates that a lane is created. A value greater than 0 indicates that a specified lane is updated.</p>
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
     * <p>gray</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the MSE namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p><strong>[Deprecated]</strong> The Java gateway-related configuration for percentage-based routing by path.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PathIndependentPercentageEnable")
    public Boolean pathIndependentPercentageEnable;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The identifier.</p>
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

    @Deprecated
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
        /**
         * <p>The match operator.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Cond")
        public String cond;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("Datum")
        public String datum;

        /**
         * <p>The divisor.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Divisor")
        public Integer divisor;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>x-mse-tag</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of matching items.</p>
         */
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The remainder.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Remainder")
        public Integer remainder;

        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
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
         * <p>Specifies how RestItems are combined to form the final condition.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The list of paths.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The list of matching items.</p>
         */
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
         * <p>If you use the legacy version of end-to-end canary release (swimversion is 0, which uses tag-based routing and canary routing), the following values are supported:</p>
         * <ul>
         * <li>PRE: prefix match</li>
         * <li>ERGULAR: regular expression match</li>
         * <li>EQUAL: exact match</li>
         * </ul>
         * <p>If you use the new version of end-to-end canary release (swimversion is 1 or 2, which uses single-service routing), the following values are supported:</p>
         * <ul>
         * <li>PRE: prefix match</li>
         * <li>regexp: regular expression match</li>
         * <li>==: equal to</li>
         * <li>!=: not equal to</li>
         * <li>list: in</li>
         * <li>%: percentage</li>
         * </ul>
         * <p>The new version of end-to-end canary release provides the same features as the legacy version but delivers better performance and simpler configuration. Migrate to the new version of end-to-end canary release.</p>
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
         * <li>header: header</li>
         * <li>param: parameter</li>
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
        /**
         * <p>The traffic percentage. This parameter is used for percentage-based routing. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
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
         * <p>The end-to-end canary release mode. Valid values:</p>
         * <ul>
         * <li><p>0: route by request content</p>
         * </li>
         * <li><p>1: route by percentage</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanaryModel")
        public Integer canaryModel;

        /**
         * <p>The canary release condition. Valid values: AND (all conditions must be met) and OR (any condition must be met).</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The list of matching conditions.</p>
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
         * <p>The traffic percentage. This parameter is used for percentage-based routing. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The list of route IDs.</p>
         */
        @NameInMap("RouteIdList")
        public java.util.List<Long> routeIdList;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is used to specify the percentage-based routing setting by route when an MSE cloud-native gateway is used as the ingress.</p>
         */
        @NameInMap("RouteIndependentPercentageEnable")
        public Boolean routeIndependentPercentageEnable;

        /**
         * <p><strong>[Deprecated]</strong> The list of routes for independent percentage-based canary releases by route.</p>
         */
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

        public CreateOrUpdateSwimmingLaneRequestGatewaySwimmingLaneRouteJson setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
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
