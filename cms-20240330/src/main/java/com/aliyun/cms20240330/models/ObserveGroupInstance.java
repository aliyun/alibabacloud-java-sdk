// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupInstance extends TeaModel {
    /**
     * <p>实体分类（由 entityType 适配）。</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>监控维度键值对。</p>
     */
    @NameInMap("dimension")
    public java.util.Map<String, String> dimension;

    /**
     * <p>实体域（如 acs）。</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>UModel 实体 ID，与实体域和类型共同标识成员。</p>
     */
    @NameInMap("entityId")
    public String entityId;

    /**
     * <p>实体角色，main 为主实体、related 为关联子实体。</p>
     */
    @NameInMap("entityRole")
    public String entityRole;

    /**
     * <p>实体类型（如 acs.ecs.instance）。</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>所属观测分组 ID。</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>实例 ID。</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>实例名称。</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>实例所属地域 ID。</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>实例所属资源组 ID。</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>实例标签键值对。</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>实例归属的用户 UID。</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ObserveGroupInstance build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupInstance self = new ObserveGroupInstance();
        return TeaModel.build(map, self);
    }

    public ObserveGroupInstance setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ObserveGroupInstance setDimension(java.util.Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }
    public java.util.Map<String, String> getDimension() {
        return this.dimension;
    }

    public ObserveGroupInstance setEntityDomain(String entityDomain) {
        this.entityDomain = entityDomain;
        return this;
    }
    public String getEntityDomain() {
        return this.entityDomain;
    }

    public ObserveGroupInstance setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public ObserveGroupInstance setEntityRole(String entityRole) {
        this.entityRole = entityRole;
        return this;
    }
    public String getEntityRole() {
        return this.entityRole;
    }

    public ObserveGroupInstance setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ObserveGroupInstance setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ObserveGroupInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ObserveGroupInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ObserveGroupInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ObserveGroupInstance setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ObserveGroupInstance setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public ObserveGroupInstance setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
