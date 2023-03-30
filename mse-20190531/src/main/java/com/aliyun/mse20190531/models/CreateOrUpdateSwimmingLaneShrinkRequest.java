// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:****</p>
     * <br>
     * <p>*   **zh-CN**: Chinese</p>
     * <p>*   **en-US**: English.</p>
     * <br>
     * <p>> Default value: **zh-CN**.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to enable a lane.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Specifies whether to set a routing rule for the lane. If an Ingress gateway is used, this parameter is not required.</p>
     */
    @NameInMap("EnableRules")
    public Boolean enableRules;

    /**
     * <p>The JSON string.</p>
     */
    @NameInMap("EntryRule")
    public String entryRule;

    /**
     * <p>The lane.</p>
     */
    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneShrinkRequestEntryRules> entryRules;

    @NameInMap("GatewaySwimmingLaneRouteJson")
    public String gatewaySwimmingLaneRouteJsonShrink;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The group to which the lane belongs.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the primary key. A value -1 specifies a request that is used to create a lane. A value greater than 0 specifies a request that is used to modify a lane.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The license key in use.</p>
     */
    @NameInMap("LicenseKey")
    public String licenseKey;

    /**
     * <p>The name of the lane.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service source. Valid value: edasmsc.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The value 0 indicates that the lane is disabled.</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The Alibaba Cloud account. The format is a number, such as 136246975637\*\*\*\*. You can leave this parameter empty.</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public CreateOrUpdateSwimmingLaneShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
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

    public CreateOrUpdateSwimmingLaneShrinkRequest setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
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

    public CreateOrUpdateSwimmingLaneShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateOrUpdateSwimmingLaneShrinkRequestEntryRulesRestItems extends TeaModel {
        /**
         * <p>The expression. =, >, <, >=, <=</p>
         */
        @NameInMap("Cond")
        public String cond;

        /**
         * <p>The base value used for the rawvalue operator.</p>
         */
        @NameInMap("Datum")
        public String datum;

        /**
         * <p>The divisor used for the mod operator.</p>
         */
        @NameInMap("Divisor")
        public Integer divisor;

        /**
         * <p>The name of the rule. This parameter corresponds to the key of the Type parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of names.</p>
         */
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        /**
         * <p>The operator type. Valid values: mod, list, rawvalue, and rate.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The rate.</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The remainder used for the mod operator.</p>
         */
        @NameInMap("Remainder")
        public Integer remainder;

        /**
         * <p>The type of the rule. Valid values: cookie, param, and header.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the rule.</p>
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
         * <p>The common parameters in the JSON format.</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <br>
         * <p>*   `true`: enables the rule.</p>
         * <p>*   `false`: disables the rule.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The list of paths.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The priority. A smaller value of this parameter indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The information about the rule for the REST method.</p>
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

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateOrUpdateSwimmingLaneShrinkRequestEntryRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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
