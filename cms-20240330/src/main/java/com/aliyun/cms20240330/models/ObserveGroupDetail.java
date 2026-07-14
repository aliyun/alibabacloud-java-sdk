// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupDetail extends TeaModel {
    /**
     * <p>The UID of the Alibaba Cloud account to which the group belongs.</p>
     */
    @NameInMap("aliUid")
    public String aliUid;

    /**
     * <p>The time when the group was created, in UTC format (yyyy-MM-ddTHH:mm:ssZ).</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the observability group, which explains its business purpose.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of entity discovery rules that define which entities the group automatically matches.</p>
     */
    @NameInMap("discoverRules")
    public java.util.List<ObserveGroupDiscoverRule> discoverRules;

    /**
     * <p>The statistics of entities in the group, categorized by entity type.</p>
     */
    @NameInMap("entitySummaries")
    public java.util.List<ObserveGroupDetailEntitySummaries> entitySummaries;

    /**
     * <p>The extended information in JSON string format, which carries alert templates, alert contact groups, suspension policies, and other configurations.</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>Indicates whether the current user has followed the group.</p>
     */
    @NameInMap("favorited")
    public Boolean favorited;

    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The name of the observability group. The name must be unique within the same workspace.</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The type of the observability group.</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The time when the group was last modified, in UTC format (yyyy-MM-ddTHH:mm:ssZ). This value is automatically updated when any property of the resource changes.</p>
     */
    @NameInMap("modifyTime")
    public String modifyTime;

    /**
     * <p>Specifies whether to enable the og_entity_info metric output. When enabled, the data plane writes the group ownership information to the target Prometheus instance.</p>
     */
    @NameInMap("ogEntityInfoEnabled")
    public Boolean ogEntityInfoEnabled;

    /**
     * <p>The set of Prometheus instances to which og_entity_info is written. This includes two source types: system (automatically identified by the system) and custom (user-defined).</p>
     */
    @NameInMap("ogEntityInfoPromInstances")
    public java.util.List<ObserveGroupPromInstance> ogEntityInfoPromInstances;

    /**
     * <p>The product_group.id of the version 1.0 application group. This parameter is valid only when sourceOrigin is set to synced_from_1_0.</p>
     */
    @NameInMap("originGroupId")
    public String originGroupId;

    /**
     * <p>The region ID of the group.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li>native_2_0: created natively in version 2.0.</li>
     * <li>synced_from_1_0: synchronized from a version 1.0 application group.</li>
     * </ul>
     */
    @NameInMap("sourceOrigin")
    public String sourceOrigin;

    /**
     * <p>The resource tags (Alibaba Cloud standard tags), represented as an array of key-value pairs.</p>
     */
    @NameInMap("tags")
    public java.util.List<ObserveGroupDetailTags> tags;

    /**
     * <p>The workspace ID to which the group belongs. This value is set at the workspace level and cannot be changed after the group is created.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ObserveGroupDetail build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupDetail self = new ObserveGroupDetail();
        return TeaModel.build(map, self);
    }

    public ObserveGroupDetail setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ObserveGroupDetail setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ObserveGroupDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ObserveGroupDetail setDiscoverRules(java.util.List<ObserveGroupDiscoverRule> discoverRules) {
        this.discoverRules = discoverRules;
        return this;
    }
    public java.util.List<ObserveGroupDiscoverRule> getDiscoverRules() {
        return this.discoverRules;
    }

    public ObserveGroupDetail setEntitySummaries(java.util.List<ObserveGroupDetailEntitySummaries> entitySummaries) {
        this.entitySummaries = entitySummaries;
        return this;
    }
    public java.util.List<ObserveGroupDetailEntitySummaries> getEntitySummaries() {
        return this.entitySummaries;
    }

    public ObserveGroupDetail setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ObserveGroupDetail setFavorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }
    public Boolean getFavorited() {
        return this.favorited;
    }

    public ObserveGroupDetail setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ObserveGroupDetail setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ObserveGroupDetail setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ObserveGroupDetail setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public ObserveGroupDetail setOgEntityInfoEnabled(Boolean ogEntityInfoEnabled) {
        this.ogEntityInfoEnabled = ogEntityInfoEnabled;
        return this;
    }
    public Boolean getOgEntityInfoEnabled() {
        return this.ogEntityInfoEnabled;
    }

    public ObserveGroupDetail setOgEntityInfoPromInstances(java.util.List<ObserveGroupPromInstance> ogEntityInfoPromInstances) {
        this.ogEntityInfoPromInstances = ogEntityInfoPromInstances;
        return this;
    }
    public java.util.List<ObserveGroupPromInstance> getOgEntityInfoPromInstances() {
        return this.ogEntityInfoPromInstances;
    }

    public ObserveGroupDetail setOriginGroupId(String originGroupId) {
        this.originGroupId = originGroupId;
        return this;
    }
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    public ObserveGroupDetail setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ObserveGroupDetail setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ObserveGroupDetail setSourceOrigin(String sourceOrigin) {
        this.sourceOrigin = sourceOrigin;
        return this;
    }
    public String getSourceOrigin() {
        return this.sourceOrigin;
    }

    public ObserveGroupDetail setTags(java.util.List<ObserveGroupDetailTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ObserveGroupDetailTags> getTags() {
        return this.tags;
    }

    public ObserveGroupDetail setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ObserveGroupDetailEntitySummaries extends TeaModel {
        /**
         * <p>The entity category.</p>
         */
        @NameInMap("entityCategory")
        public String entityCategory;

        /**
         * <p>The number of entities.</p>
         */
        @NameInMap("entityCount")
        public Integer entityCount;

        /**
         * <p>The entity domain.</p>
         */
        @NameInMap("entityDomain")
        public String entityDomain;

        /**
         * <p>The entity type.</p>
         */
        @NameInMap("entityType")
        public String entityType;

        public static ObserveGroupDetailEntitySummaries build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupDetailEntitySummaries self = new ObserveGroupDetailEntitySummaries();
            return TeaModel.build(map, self);
        }

        public ObserveGroupDetailEntitySummaries setEntityCategory(String entityCategory) {
            this.entityCategory = entityCategory;
            return this;
        }
        public String getEntityCategory() {
            return this.entityCategory;
        }

        public ObserveGroupDetailEntitySummaries setEntityCount(Integer entityCount) {
            this.entityCount = entityCount;
            return this;
        }
        public Integer getEntityCount() {
            return this.entityCount;
        }

        public ObserveGroupDetailEntitySummaries setEntityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }
        public String getEntityDomain() {
            return this.entityDomain;
        }

        public ObserveGroupDetailEntitySummaries setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class ObserveGroupDetailTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ObserveGroupDetailTags build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupDetailTags self = new ObserveGroupDetailTags();
            return TeaModel.build(map, self);
        }

        public ObserveGroupDetailTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ObserveGroupDetailTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
