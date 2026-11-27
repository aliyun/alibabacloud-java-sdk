// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupInstance extends TeaModel {
    /**
     * <p>The entity category adapted from entityType.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The key-value pairs of the monitoring dimensions.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;1234567890123456&quot;,&quot;instanceId&quot;:&quot;i-bp1gj8wyq4fxk28k6iy2&quot;}</p>
     */
    @NameInMap("dimension")
    public java.util.Map<String, String> dimension;

    /**
     * <p>The entity domain, such as acs.</p>
     * 
     * <strong>example:</strong>
     * <p>acs</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>The UModel entity ID, which corresponds to the <strong>entity_id</strong> field of the entity and identifies a member of the observation group together with entityDomain and entityType.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1gj8wyq4fxk28k6iy2</p>
     */
    @NameInMap("entityId")
    public String entityId;

    /**
     * <p>The role of the entity in the observation group. main indicates the primary entity directly matched by the management rule. related indicates the child entity managed through associations.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("entityRole")
    public String entityRole;

    /**
     * <p>The entity type, such as acs.ecs.instance.</p>
     * 
     * <strong>example:</strong>
     * <p>acs.ecs.instance</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The ID of the observation group to which the entity belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>og-845e0a26455f437c</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1gj8wyq4fxk28k6iy2</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-prod-01</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The ID of the region to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3gn5i6bigbi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The key-value pairs of the instance tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prod&quot;}</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The UID of the user that owns the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
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
