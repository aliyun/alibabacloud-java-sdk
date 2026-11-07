// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneShrinkRequest extends TeaModel {
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
    public java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRules> entryRules;

    /**
     * <p>The gateway routing information. This parameter is used when a cloud-native gateway is used as the ingress.</p>
     */
    @NameInMap("GatewaySwimmingLaneRouteJson")
    public String gatewaySwimmingLaneRouteJsonShrink;

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

    public static CreateOrUpdateSwimmingLaneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneShrinkRequest self = new CreateOrUpdateSwimmingLaneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    @Deprecated
    public CreateOrUpdateSwimmingLaneShrinkRequest setEntryRule(String entryRule) {
        this.entryRule = entryRule;
        return this;
    }
    public String getEntryRule() {
        return this.entryRule;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setEntryRules(java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRules> entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRules> getEntryRules() {
        return this.entryRules;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setGatewaySwimmingLaneRouteJsonShrink(String gatewaySwimmingLaneRouteJsonShrink) {
        this.gatewaySwimmingLaneRouteJsonShrink = gatewaySwimmingLaneRouteJsonShrink;
        return this;
    }
    public String getGatewaySwimmingLaneRouteJsonShrink() {
        return this.gatewaySwimmingLaneRouteJsonShrink;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setPathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
        this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
        return this;
    }
    public Boolean getPathIndependentPercentageEnable() {
        return this.pathIndependentPercentageEnable;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public static class CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems extends TeaModel {
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

        public static CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems self = new CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSwimmingLaneShrinkRequestEntryRules extends TeaModel {
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
        public java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems> restItems;

        public static CreateOrUpdateSwimmingLaneShrinkRequestEntryRules build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneShrinkRequestEntryRules self = new CreateOrUpdateSwimmingLaneShrinkRequestEntryRules();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRules setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRules setRestItems(java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems> getRestItems() {
            return this.restItems;
        }

    }

}
