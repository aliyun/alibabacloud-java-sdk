// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class JoinResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the region in which you want to create the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   cluster: cluster</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static JoinResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupRequest self = new JoinResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public JoinResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public JoinResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public JoinResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
