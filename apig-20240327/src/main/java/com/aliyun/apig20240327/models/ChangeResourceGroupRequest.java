// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>Target resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzdrfx2xdnaja</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource ID</p>
     * 
     * <strong>example:</strong>
     * <p>gw-ct4i14um1hkn0tpqfae0</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>Resource type</p>
     * 
     * <strong>example:</strong>
     * <p>gateway</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Service name, fixed value apig</p>
     * 
     * <strong>example:</strong>
     * <p>apig</p>
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
