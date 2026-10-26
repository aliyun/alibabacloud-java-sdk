// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupDiscoverRule extends TeaModel {
    /**
     * <p>规则是否启用；false 时数据面跳过该规则（不匹配 / 不打标 / 不下发）。</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>（旧）单实体类型，向后兼容，优先用 entityTypes。</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>实体类型列表，支持一条规则跨多类型匹配（如 acs.ecs.instance/acs.rds.instance/acs.arms.service）。</p>
     */
    @NameInMap("entityTypes")
    public java.util.List<String> entityTypes;

    /**
     * <p>规则创建时间（Unix 毫秒时间戳），控制台展示用。</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>手动指定的实例 ID 列表（枚举型，含 1.0 手动实例同步）。</p>
     */
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>名称匹配规则。</p>
     */
    @NameInMap("nameRules")
    public ObserveGroupDiscoverRuleNameRules nameRules;

    /**
     * <p>按地域过滤的 region ID 列表。</p>
     */
    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>按资源组过滤。</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>规则稳定 ID（编辑/删除/启停锚点），格式 dr-&lt;16位hash&gt;。</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>匹配方式：byTag / byResourceGroup / byInstanceName / byManual / bySpl。</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

    /**
     * <p>适用范围：all（全部实体类型，独占）/ entity（指定实体类型）。</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>完整 SPL 表达式（高级配置）；非空时优先生效，覆盖其它过滤字段。</p>
     */
    @NameInMap("spl")
    public String spl;

    /**
     * <p>标签匹配规则。</p>
     */
    @NameInMap("tagRules")
    public ObserveGroupDiscoverRuleTagRules tagRules;

    /**
     * <p>规则所属用户 UID。</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ObserveGroupDiscoverRule build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupDiscoverRule self = new ObserveGroupDiscoverRule();
        return TeaModel.build(map, self);
    }

    public ObserveGroupDiscoverRule setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ObserveGroupDiscoverRule setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ObserveGroupDiscoverRule setEntityTypes(java.util.List<String> entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    public ObserveGroupDiscoverRule setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ObserveGroupDiscoverRule setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ObserveGroupDiscoverRule setNameRules(ObserveGroupDiscoverRuleNameRules nameRules) {
        this.nameRules = nameRules;
        return this;
    }
    public ObserveGroupDiscoverRuleNameRules getNameRules() {
        return this.nameRules;
    }

    public ObserveGroupDiscoverRule setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public ObserveGroupDiscoverRule setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ObserveGroupDiscoverRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ObserveGroupDiscoverRule setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ObserveGroupDiscoverRule setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ObserveGroupDiscoverRule setSpl(String spl) {
        this.spl = spl;
        return this;
    }
    public String getSpl() {
        return this.spl;
    }

    public ObserveGroupDiscoverRule setTagRules(ObserveGroupDiscoverRuleTagRules tagRules) {
        this.tagRules = tagRules;
        return this;
    }
    public ObserveGroupDiscoverRuleTagRules getTagRules() {
        return this.tagRules;
    }

    public ObserveGroupDiscoverRule setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ObserveGroupDiscoverRuleNameRulesTags extends TeaModel {
        /**
         * <p>匹配操作。</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>匹配值列表。</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static ObserveGroupDiscoverRuleNameRulesTags build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupDiscoverRuleNameRulesTags self = new ObserveGroupDiscoverRuleNameRulesTags();
            return TeaModel.build(map, self);
        }

        public ObserveGroupDiscoverRuleNameRulesTags setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ObserveGroupDiscoverRuleNameRulesTags setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class ObserveGroupDiscoverRuleNameRules extends TeaModel {
        /**
         * <p>名称匹配逻辑。</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>名称条件列表。</p>
         */
        @NameInMap("tags")
        public java.util.List<ObserveGroupDiscoverRuleNameRulesTags> tags;

        public static ObserveGroupDiscoverRuleNameRules build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupDiscoverRuleNameRules self = new ObserveGroupDiscoverRuleNameRules();
            return TeaModel.build(map, self);
        }

        public ObserveGroupDiscoverRuleNameRules setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ObserveGroupDiscoverRuleNameRules setTags(java.util.List<ObserveGroupDiscoverRuleNameRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ObserveGroupDiscoverRuleNameRulesTags> getTags() {
            return this.tags;
        }

    }

    public static class ObserveGroupDiscoverRuleTagRulesTags extends TeaModel {
        /**
         * <p>匹配操作。</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>标签键。</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>标签值列表。</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static ObserveGroupDiscoverRuleTagRulesTags build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupDiscoverRuleTagRulesTags self = new ObserveGroupDiscoverRuleTagRulesTags();
            return TeaModel.build(map, self);
        }

        public ObserveGroupDiscoverRuleTagRulesTags setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ObserveGroupDiscoverRuleTagRulesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ObserveGroupDiscoverRuleTagRulesTags setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class ObserveGroupDiscoverRuleTagRules extends TeaModel {
        /**
         * <p>标签匹配逻辑。</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>标签条件列表。</p>
         */
        @NameInMap("tags")
        public java.util.List<ObserveGroupDiscoverRuleTagRulesTags> tags;

        public static ObserveGroupDiscoverRuleTagRules build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupDiscoverRuleTagRules self = new ObserveGroupDiscoverRuleTagRules();
            return TeaModel.build(map, self);
        }

        public ObserveGroupDiscoverRuleTagRules setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ObserveGroupDiscoverRuleTagRules setTags(java.util.List<ObserveGroupDiscoverRuleTagRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ObserveGroupDiscoverRuleTagRulesTags> getTags() {
            return this.tags;
        }

    }

}
