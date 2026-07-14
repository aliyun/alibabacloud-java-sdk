// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupDiscoverRule extends TeaModel {
    /**
     * <p>Indicates whether the rule is enabled. If set to false, the data plane skips this rule and does not perform matching, tagging, or delivery.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The entity type (legacy). Retained for backward compatibility. Use entityTypes instead.</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The list of entity types. A single rule can match multiple types, such as acs.ecs.instance, acs.rds.instance, and acs.arms.service.</p>
     */
    @NameInMap("entityTypes")
    public java.util.List<String> entityTypes;

    /**
     * <p>The time when the rule was created, in UNIX millisecond timestamp format. This value is used for display in the console.</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The list of manually specified instance IDs in enumeration mode, including instances synchronized manually in version 1.0.</p>
     */
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The name matching rules.</p>
     */
    @NameInMap("nameRules")
    public ObserveGroupDiscoverRuleNameRules nameRules;

    /**
     * <p>The list of region IDs used for filtering by region.</p>
     */
    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The resource group ID used for filtering.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The stable rule ID used as an anchor for editing, deleting, and enabling or disabling operations. Format: dr-&lt;16-character hash&gt;.</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>The matching method. Valid values: byTag, byResourceGroup, byInstanceName, byManual, and bySpl.</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

    /**
     * <p>The applicable scope. Valid values: all (all entity types, exclusive) and entity (specified entity types).</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The full SPL expression for advanced configuration. If this parameter is not empty, it takes precedence over other filter fields.</p>
     */
    @NameInMap("spl")
    public String spl;

    /**
     * <p>The tag matching rules.</p>
     */
    @NameInMap("tagRules")
    public ObserveGroupDiscoverRuleTagRules tagRules;

    /**
     * <p>The UID of the user to whom the rule belongs.</p>
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
         * <p>The matching operation.</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The matching value list.</p>
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
         * <p>The name matching logic.</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The name condition list.</p>
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
         * <p>The matching operation.</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value list.</p>
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
         * <p>The tag matching logic.</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The tag condition list.</p>
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
