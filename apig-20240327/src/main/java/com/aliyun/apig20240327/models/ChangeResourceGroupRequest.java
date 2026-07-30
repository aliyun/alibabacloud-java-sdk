// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the destination resource group. You can view resource group IDs in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzuqyxxxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource to be moved. The value must match the specified ResourceType.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq2vmc93km41m3dm4bg0</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. The value is case-sensitive and must exactly match one of the valid values.</p>
     * 
     * <strong>example:</strong>
     * <p>Gateway</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The cloud service identifier. Fixed as APIG. You generally do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>APIG</p>
     */
    @NameInMap("Service")
    public String service;

    public static ChangeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupRequest self = new ChangeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ChangeResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ChangeResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ChangeResourceGroupRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
