// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroup extends TeaModel {
    /**
     * <p>分组归属的阿里云主账号 UID。</p>
     */
    @NameInMap("aliUid")
    public String aliUid;

    /**
     * <p>创建时间，UTC 格式 yyyy-MM-ddTHH:mm:ssZ。</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>观测分组描述（业务用途说明）。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>实体发现规则列表，定义分组自动匹配哪些实体。</p>
     */
    @NameInMap("discoverRules")
    public java.util.List<ObserveGroupDiscoverRule> discoverRules;

    /**
     * <p>各分类实体数量。key=分类 domain（acs=云产品 / apm / rum，可扩展），value=该分类下属于本分组的实体数。仅 withEntityCount=true 时返回。</p>
     */
    @NameInMap("entityCounts")
    public java.util.Map<String, Integer> entityCounts;

    /**
     * <p>扩展信息（JSON 字符串，承载告警模板/联系人组/暂停策略等）。</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>当前用户是否已关注该分组（「我的关注」筛选依据）。</p>
     */
    @NameInMap("favorited")
    public Boolean favorited;

    /**
     * <p>观测分组全局唯一 ID，格式 og-&lt;16位hash&gt;，指标/告警/控制台统一使用。</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>观测分组名称（同 workspace 下唯一）。</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>观测分组类型。</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>分组健康状态：-1 未知（占位）/ 1 健康 / 0 不健康。</p>
     */
    @NameInMap("health")
    public Integer health;

    /**
     * <p>最后修改时间，UTC 格式 yyyy-MM-ddTHH:mm:ssZ。资源任意属性变更时自动更新。</p>
     */
    @NameInMap("modifyTime")
    public String modifyTime;

    /**
     * <p>是否开启 og_entity_info 指标输出。开启后数据面会把本分组归属写入目标 Prometheus 实例。</p>
     */
    @NameInMap("ogEntityInfoEnabled")
    public Boolean ogEntityInfoEnabled;

    /**
     * <p>写入 og_entity_info 的 Prometheus 实例集合，包含系统自动识别(system)和用户自定义(custom)两类来源。</p>
     */
    @NameInMap("ogEntityInfoPromInstances")
    public java.util.List<ObserveGroupPromInstance> ogEntityInfoPromInstances;

    /**
     * <p>仅 synced_from_1_0 时填值，存 1.0 应用分组的 product_group.id。</p>
     */
    @NameInMap("originGroupId")
    public String originGroupId;

    /**
     * <p>分组所属地域 ID。</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>阿里云资源组 ID。</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>数据来源：native_2_0（2.0 原生）/ synced_from_1_0（从 1.0 应用分组同步）。</p>
     */
    @NameInMap("sourceOrigin")
    public String sourceOrigin;

    /**
     * <p>资源标签（阿里云标准标签），键值对数组。</p>
     */
    @NameInMap("tags")
    public java.util.List<ObserveGroupTags> tags;

    /**
     * <p>分组归属的 workspace ID（workspace 级归属，创建后不可变）。</p>
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
         * <p>标签键。</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>标签值。</p>
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
