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
     * <p>The time when the group was created, in UTC format (yyyy-MM-ddTHH:mm:ssZ).</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the observability group, which describes the business purpose.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of entity discovery rules that define which entities the group automatically matches.</p>
     */
    @NameInMap("discoverRules")
    public String discoverRules;

    /**
     * <p>The number of entities in each category. The key is the category domain (such as acs for Alibaba Cloud services, apm, or rum, which is extensible). The value is the number of entities in that category that belong to this group. This parameter is returned only when withEntityCount is set to true.</p>
     */
    @NameInMap("entityCounts")
    public java.util.Map<String, Integer> entityCounts;

    /**
     * <p>The extended information, which is a JSON string that contains alert templates, alert contact groups, pause policies, and other settings.</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>Indicates whether the current user has favorited this group. This value is used as the filter criterion for the My Favorites feature.</p>
     */
    @NameInMap("favorited")
    public Boolean favorited;

    /**
     * <p>The globally unique ID of the observability group, in the format of og-&lt;16-character hash&gt;. This ID is used across metrics, alerts, and the console.</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The name of the observability group. The name must be unique within the workspace.</p>
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
     * <p>The time when the group was last modified, in UTC format (yyyy-MM-ddTHH:mm:ssZ). This value is automatically updated when any property of the resource changes.</p>
     */
    @NameInMap("modifyTime")
    public String modifyTime;

    /**
     * <p>The product_group.id of the version 1.0 application group. This parameter is returned only when sourceOrigin is set to synced_from_1_0.</p>
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
     * <p>The resource tags (Alibaba Cloud standard tags), which are an array of key-value pairs.</p>
     */
    @NameInMap("tags")
    public java.util.List<ObserveGroupTags> tags;

    /**
     * <p>The workspace ID to which the group belongs. This value is set at the workspace level and cannot be changed after the group is created.</p>
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

    public ObserveGroup setDiscoverRules(String discoverRules) {
        this.discoverRules = discoverRules;
        return this;
    }
    public String getDiscoverRules() {
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
