// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroup extends TeaModel {
    /**
     * <p>The UID of the Alibaba Cloud account to which the group belongs.</p>
     */
    @NameInMap("aliUid")
    public String aliUid;

    /**
     * <p>The creation time in UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
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
     * <p>The number of entities in each category. The key is the category domain (acs for cloud services, apm, or rum, which is extensible). The value is the number of entities in that category that belong to this group. Returned only when withEntityCount is set to true.</p>
     */
    @NameInMap("entityCounts")
    public java.util.Map<String, Integer> entityCounts;

    /**
     * <p>The extended information as a JSON string, which carries alert templates, alert contact groups, and suspension policies.</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>Indicates whether the current user has followed this group. This value is used as the filter criterion for the My Favorites feature.</p>
     */
    @NameInMap("favorited")
    public Boolean favorited;

    /**
     * <p>The globally unique ID of the observability group. Format: og-&lt;16-character hash&gt;. Used uniformly across metrics, alerts, and consoles.</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The name of the observability group. Must be unique within the same workspace.</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The type of the observability group.</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The health status of the group. Valid values:</p>
     * <ul>
     * <li>-1: unknown (placeholder).</li>
     * <li>1: healthy.</li>
     * <li>0: unhealthy.</li>
     * </ul>
     */
    @NameInMap("health")
    public Integer health;

    /**
     * <p>The last modification time in UTC format: yyyy-MM-ddTHH:mm:ssZ. Automatically updated when any resource attribute changes.</p>
     */
    @NameInMap("modifyTime")
    public String modifyTime;

    /**
     * <p>Specifies whether og_entity_info metric output is enabled. When enabled, the data plane writes the group membership information to the target Prometheus instance.</p>
     */
    @NameInMap("ogEntityInfoEnabled")
    public Boolean ogEntityInfoEnabled;

    /**
     * <p>The set of Prometheus instances to which og_entity_info is written. Includes two source types: system (automatically identified by the system) and custom (user-defined).</p>
     */
    @NameInMap("ogEntityInfoPromInstances")
    public java.util.List<ObserveGroupPromInstance> ogEntityInfoPromInstances;

    /**
     * <p>The product_group.id of the version 1.0 application group. This parameter is valid only when sourceOrigin is set to synced_from_1_0.</p>
     */
    @NameInMap("originGroupId")
    public String originGroupId;

    /**
     * <p>The region ID to which the group belongs.</p>
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
     * <p>The resource tags (Alibaba Cloud standard tags) as an array of key-value pairs.</p>
     */
    @NameInMap("tags")
    public java.util.List<ObserveGroupTags> tags;

    /**
     * <p>The workspace ID to which the group belongs. This value is set at the workspace level and cannot be changed after creation.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ObserveGroup build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroup self = new ObserveGroup();
        return TeaModel.build(map, self);
    }

    public ObserveGroup setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ObserveGroup setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ObserveGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ObserveGroup setDiscoverRules(java.util.List<ObserveGroupDiscoverRule> discoverRules) {
        this.discoverRules = discoverRules;
        return this;
    }
    public java.util.List<ObserveGroupDiscoverRule> getDiscoverRules() {
        return this.discoverRules;
    }

    public ObserveGroup setEntityCounts(java.util.Map<String, Integer> entityCounts) {
        this.entityCounts = entityCounts;
        return this;
    }
    public java.util.Map<String, Integer> getEntityCounts() {
        return this.entityCounts;
    }

    public ObserveGroup setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ObserveGroup setFavorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }
    public Boolean getFavorited() {
        return this.favorited;
    }

    public ObserveGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ObserveGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ObserveGroup setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ObserveGroup setHealth(Integer health) {
        this.health = health;
        return this;
    }
    public Integer getHealth() {
        return this.health;
    }

    public ObserveGroup setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public ObserveGroup setOgEntityInfoEnabled(Boolean ogEntityInfoEnabled) {
        this.ogEntityInfoEnabled = ogEntityInfoEnabled;
        return this;
    }
    public Boolean getOgEntityInfoEnabled() {
        return this.ogEntityInfoEnabled;
    }

    public ObserveGroup setOgEntityInfoPromInstances(java.util.List<ObserveGroupPromInstance> ogEntityInfoPromInstances) {
        this.ogEntityInfoPromInstances = ogEntityInfoPromInstances;
        return this;
    }
    public java.util.List<ObserveGroupPromInstance> getOgEntityInfoPromInstances() {
        return this.ogEntityInfoPromInstances;
    }

    public ObserveGroup setOriginGroupId(String originGroupId) {
        this.originGroupId = originGroupId;
        return this;
    }
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    public ObserveGroup setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ObserveGroup setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ObserveGroup setSourceOrigin(String sourceOrigin) {
        this.sourceOrigin = sourceOrigin;
        return this;
    }
    public String getSourceOrigin() {
        return this.sourceOrigin;
    }

    public ObserveGroup setTags(java.util.List<ObserveGroupTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ObserveGroupTags> getTags() {
        return this.tags;
    }

    public ObserveGroup setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ObserveGroupTags extends TeaModel {
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

        public static ObserveGroupTags build(java.util.Map<String, ?> map) throws Exception {
            ObserveGroupTags self = new ObserveGroupTags();
            return TeaModel.build(map, self);
        }

        public ObserveGroupTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ObserveGroupTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
