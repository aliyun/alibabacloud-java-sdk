// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneShrinkRequest extends TeaModel {
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

    /**
     * <p>The lane.</p>
     */
    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRules> entryRules;

    /**
     * <p>The information about the routing rule for the gateway. This parameter is required when a cloud-native gateway is used as the ingress.</p>
     */
    @NameInMap("GatewaySwimmingLaneRouteJson")
    public String gatewaySwimmingLaneRouteJsonShrink;

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
         * <p>The matching character.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Cond")
        public String cond;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>.params[0]</p>
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
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The matching list.</p>
         */
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>mod</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The remainder.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Remainder")
        public Integer remainder;

        /**
         * <p>The matching type.</p>
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
         * <p>&quot;&quot;</p>
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
         * <p>Specifies how RESTful items are combined into the final condition.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The paths.</p>
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
         * <p>The matching list.</p>
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
