// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EntityDiscoverRule extends TeaModel {
    /**
     * <p>注解匹配集合。</p>
     */
    @NameInMap("annotations")
    public java.util.List<EntityDiscoverRuleAnnotations> annotations;

    /**
     * <p>实体类型集合。</p>
     */
    @NameInMap("entityTypes")
    public java.util.List<String> entityTypes;

    /**
     * <p>属性匹配规则。</p>
     */
    @NameInMap("fieldRules")
    public java.util.List<EntityDiscoverRuleFieldRules> fieldRules;

    /**
     * <p>实例ID集合。</p>
     */
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>IP匹配规则集合。</p>
     */
    @NameInMap("ipMatchRule")
    public java.util.List<EntityDiscoverRuleIpMatchRule> ipMatchRule;

    /**
     * <p>标签匹配集合。</p>
     */
    @NameInMap("labels")
    public java.util.List<EntityDiscoverRuleLabels> labels;

    /**
     * <p>地域ID集合。</p>
     */
    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>资源组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2m7atreujs1</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>通过Tag进行服务发现。</p>
     */
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
        /**
         * <p>操作。</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>注解的Key。</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>注解的值集合。</p>
         */
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
        /**
         * <p>属性的Key。</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("fieldKey")
        public String fieldKey;

        /**
         * <p>属性的值集合。</p>
         */
        @NameInMap("fieldValues")
        public java.util.List<String> fieldValues;

        /**
         * <p>操作。</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
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
        /**
         * <p>IP的CIDR。</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/10</p>
         */
        @NameInMap("ipCIDR")
        public String ipCIDR;

        /**
         * <p>IP字段的Key。</p>
         * 
         * <strong>example:</strong>
         * <p>hostIp</p>
         */
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
        /**
         * <p>操作。</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>标签的Key。</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>标签的值集合。</p>
         */
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
        /**
         * <p>操作。</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>Tag的Key。</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>Tag的值集合。</p>
         */
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
