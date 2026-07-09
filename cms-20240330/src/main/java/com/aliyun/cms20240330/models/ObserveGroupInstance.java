// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupInstance extends TeaModel {
    /**
     * <p>The entity category (adapted by entityType).</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The key-value pairs of monitoring dimensions.</p>
     */
    @NameInMap("dimension")
    public java.util.Map<String, String> dimension;

    /**
     * <p>The entity domain (such as acs).</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>The entity type (such as acs.ecs.instance).</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The ID of the observation group to which the entity belongs.</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource group ID of the instance.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The key-value pairs of instance tags.</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The UID of the user to which the instance belongs.</p>
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
