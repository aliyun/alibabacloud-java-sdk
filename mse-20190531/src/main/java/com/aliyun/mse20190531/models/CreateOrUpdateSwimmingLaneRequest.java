// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    // The language that the value of the **LocalName** response parameter uses. Valid values:
    // 
    // *   **zh-cn**: Chinese
    // *   **en-us**: English.
    // 
    // > Default value: **zh-CN**.
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to enable a lane.
    @NameInMap("Enable")
    public Boolean enable;

    // Specifies whether to set a routing rule for the lane. If an Ingress gateway is used, this parameter is not required.
    @NameInMap("EnableRules")
    public Boolean enableRules;

    // The JSON string.
    @NameInMap("EntryRule")
    public String entryRule;

    // The lane.
    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> entryRules;

    // Optional. The time when the lane was created.
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // Optional. The time when the lane was last modified.
    @NameInMap("GmtModified")
    public String gmtModified;

    // The group to which the lane belongs.
    @NameInMap("GroupId")
    public Long groupId;

    // The ID of the primary key. A value -1 specifies a request that is used to create a lane. A value greater than 0 specifies a request that is used to modify a lane.
    @NameInMap("Id")
    public Long id;

    // The license key in use.
    @NameInMap("LicenseKey")
    public String licenseKey;

    // The name of the lane.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The service source. Valid value: edasmsc.
    @NameInMap("Source")
    public String source;

    // The value 0 indicates that the lane is disabled.
    @NameInMap("Status")
    public Integer status;

    // The tag.
    @NameInMap("Tag")
    public String tag;

    // The Alibaba Cloud account. The format is a number, such as 136246975637\*\*\*\*. You can leave this parameter empty.
    @NameInMap("UserId")
    public String userId;

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

    public CreateOrUpdateSwimmingLaneRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateOrUpdateSwimmingLaneRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
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

    public CreateOrUpdateSwimmingLaneRequest setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public CreateOrUpdateSwimmingLaneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSwimmingLaneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateSwimmingLaneRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOrUpdateSwimmingLaneRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateOrUpdateSwimmingLaneRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateOrUpdateSwimmingLaneRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateOrUpdateSwimmingLaneRequestEntryRulesRestItems extends TeaModel {
        // The expression. =, >, <, >=, <=
        @NameInMap("Cond")
        public String cond;

        // The base value used for the rawvalue operator.
        @NameInMap("Datum")
        public String datum;

        // The divisor used for the mod operator.
        @NameInMap("Divisor")
        public Integer divisor;

        // The name of the rule. This parameter corresponds to the key of the type parameter.
        @NameInMap("Name")
        public String name;

        // The list of names.
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        // The operator type. Valid values: mod, list, rawvalue, and rate.
        @NameInMap("Operator")
        public String operator;

        // The rate.
        @NameInMap("Rate")
        public Integer rate;

        // The remainder used for the mod operator.
        @NameInMap("Remainder")
        public Integer remainder;

        // The type of the rule. Valid values: cookie, param, and header.
        @NameInMap("Type")
        public String type;

        // The content of the rule.
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
        // The common parameters in the JSON format.
        @NameInMap("Condition")
        public String condition;

        // Specifies whether to enable the rule. Valid values:
        // 
        // *   `true`: enables the rule.
        // *   `false`: disables the rule.
        @NameInMap("Enable")
        public Boolean enable;

        // The path.
        @NameInMap("Path")
        public String path;

        // The list of paths.
        @NameInMap("Paths")
        public java.util.List<String> paths;

        // The priority. A smaller value of this parameter indicates a higher priority.
        @NameInMap("Priority")
        public Integer priority;

        // The information about the rule for the REST method.
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

        public CreateOrUpdateSwimmingLaneRequestEntryRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateOrUpdateSwimmingLaneRequestEntryRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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

}
