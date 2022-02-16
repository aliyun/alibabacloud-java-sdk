// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 是否开启。
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("EnableRules")
    public Boolean enableRules;

    // json string
    @NameInMap("EntryRule")
    public String entryRule;

    // SwimmingLane
    @NameInMap("EntryRules")
    public java.util.List<CreateOrUpdateSwimmingLaneRequestEntryRules> entryRules;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 更新时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 所属泳道组
    @NameInMap("GroupId")
    public Long groupId;

    // 主键ID。由SP生成(数据库自增主键)。
    @NameInMap("Id")
    public Long id;

    // 格式为UUID。比如48bd91e9-41d5-4dae-8a9a-439611742b45
    @NameInMap("LicenseKey")
    public String licenseKey;

    // 名称
    @NameInMap("Name")
    public String name;

    // region
    @NameInMap("RegionId")
    public String regionId;

    // 来源。可选值为: EDAS。
    @NameInMap("Source")
    public String source;

    // 0 未生效
    @NameInMap("Status")
    public Integer status;

    // 标识
    @NameInMap("Tag")
    public String tag;

    // EDAS账号。格式为数字，比如1362469756373809。
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

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Path")
        public String path;

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
