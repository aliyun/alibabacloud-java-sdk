// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EntityDiscoverRule extends TeaModel {
    @NameInMap("annotations")
    public java.util.List<EntityDiscoverRuleAnnotations> annotations;

    @NameInMap("entityTypes")
    public java.util.List<String> entityTypes;

    @NameInMap("fieldRules")
    public java.util.List<EntityDiscoverRuleFieldRules> fieldRules;

    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ipMatchRule")
    public java.util.List<EntityDiscoverRuleIpMatchRule> ipMatchRule;

    @NameInMap("labels")
    public java.util.List<EntityDiscoverRuleLabels> labels;

    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<EntityDiscoverRuleTags> tags;

    public static EntityDiscoverRule build(java.util.Map<String, ?> map) throws Exception {
        EntityDiscoverRule self = new EntityDiscoverRule();
        return TeaModel.build(map, self);
    }

    public EntityDiscoverRule setAnnotations(java.util.List<EntityDiscoverRuleAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<EntityDiscoverRuleAnnotations> getAnnotations() {
        return this.annotations;
    }

    public EntityDiscoverRule setEntityTypes(java.util.List<String> entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    public EntityDiscoverRule setFieldRules(java.util.List<EntityDiscoverRuleFieldRules> fieldRules) {
        this.fieldRules = fieldRules;
        return this;
    }
    public java.util.List<EntityDiscoverRuleFieldRules> getFieldRules() {
        return this.fieldRules;
    }

    public EntityDiscoverRule setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public EntityDiscoverRule setIpMatchRule(java.util.List<EntityDiscoverRuleIpMatchRule> ipMatchRule) {
        this.ipMatchRule = ipMatchRule;
        return this;
    }
    public java.util.List<EntityDiscoverRuleIpMatchRule> getIpMatchRule() {
        return this.ipMatchRule;
    }

    public EntityDiscoverRule setLabels(java.util.List<EntityDiscoverRuleLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<EntityDiscoverRuleLabels> getLabels() {
        return this.labels;
    }

    public EntityDiscoverRule setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public EntityDiscoverRule setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public EntityDiscoverRule setTags(java.util.List<EntityDiscoverRuleTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<EntityDiscoverRuleTags> getTags() {
        return this.tags;
    }

    public static class EntityDiscoverRuleAnnotations extends TeaModel {
        @NameInMap("op")
        public String op;

        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static EntityDiscoverRuleAnnotations build(java.util.Map<String, ?> map) throws Exception {
            EntityDiscoverRuleAnnotations self = new EntityDiscoverRuleAnnotations();
            return TeaModel.build(map, self);
        }

        public EntityDiscoverRuleAnnotations setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public EntityDiscoverRuleAnnotations setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public EntityDiscoverRuleAnnotations setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class EntityDiscoverRuleFieldRules extends TeaModel {
        @NameInMap("fieldKey")
        public String fieldKey;

        @NameInMap("fieldValues")
        public java.util.List<String> fieldValues;

        @NameInMap("op")
        public String op;

        public static EntityDiscoverRuleFieldRules build(java.util.Map<String, ?> map) throws Exception {
            EntityDiscoverRuleFieldRules self = new EntityDiscoverRuleFieldRules();
            return TeaModel.build(map, self);
        }

        public EntityDiscoverRuleFieldRules setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public EntityDiscoverRuleFieldRules setFieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            return this;
        }
        public java.util.List<String> getFieldValues() {
            return this.fieldValues;
        }

        public EntityDiscoverRuleFieldRules setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

    public static class EntityDiscoverRuleIpMatchRule extends TeaModel {
        @NameInMap("ipCIDR")
        public String ipCIDR;

        @NameInMap("ipFieldKey")
        public String ipFieldKey;

        public static EntityDiscoverRuleIpMatchRule build(java.util.Map<String, ?> map) throws Exception {
            EntityDiscoverRuleIpMatchRule self = new EntityDiscoverRuleIpMatchRule();
            return TeaModel.build(map, self);
        }

        public EntityDiscoverRuleIpMatchRule setIpCIDR(String ipCIDR) {
            this.ipCIDR = ipCIDR;
            return this;
        }
        public String getIpCIDR() {
            return this.ipCIDR;
        }

        public EntityDiscoverRuleIpMatchRule setIpFieldKey(String ipFieldKey) {
            this.ipFieldKey = ipFieldKey;
            return this;
        }
        public String getIpFieldKey() {
            return this.ipFieldKey;
        }

    }

    public static class EntityDiscoverRuleLabels extends TeaModel {
        @NameInMap("op")
        public String op;

        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static EntityDiscoverRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            EntityDiscoverRuleLabels self = new EntityDiscoverRuleLabels();
            return TeaModel.build(map, self);
        }

        public EntityDiscoverRuleLabels setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public EntityDiscoverRuleLabels setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public EntityDiscoverRuleLabels setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class EntityDiscoverRuleTags extends TeaModel {
        @NameInMap("op")
        public String op;

        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static EntityDiscoverRuleTags build(java.util.Map<String, ?> map) throws Exception {
            EntityDiscoverRuleTags self = new EntityDiscoverRuleTags();
            return TeaModel.build(map, self);
        }

        public EntityDiscoverRuleTags setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public EntityDiscoverRuleTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public EntityDiscoverRuleTags setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

}
