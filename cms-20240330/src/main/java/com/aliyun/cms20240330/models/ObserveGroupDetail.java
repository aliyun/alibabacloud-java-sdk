// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupDetail extends TeaModel {
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
     * <p>分组内实体按类型的统计。</p>
     */
    @NameInMap("entitySummaries")
    public java.util.List<ObserveGroupDetailEntitySummaries> entitySummaries;

    /**
     * <p>扩展信息（JSON 字符串，承载告警模板/联系人组/暂停策略等）。</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>当前用户是否已关注该分组。</p>
     */
    @NameInMap("favorited")
    public Boolean favorited;

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
    public java.util.List<ObserveGroupDetailTags> tags;

    /**
     * <p>分组归属的 workspace ID（workspace 级归属，创建后不可变）。</p>
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
         * <p>实体分类。</p>
         */
        @NameInMap("entityCategory")
        public String entityCategory;

        /**
         * <p>实体数量。</p>
         */
        @NameInMap("entityCount")
        public Integer entityCount;

        /**
         * <p>实体域。</p>
         */
        @NameInMap("entityDomain")
        public String entityDomain;

        /**
         * <p>实体类型。</p>
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
         * <p>标签键。</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>标签值。</p>
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
