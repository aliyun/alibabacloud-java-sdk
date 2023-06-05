// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ChangeResourceManagerResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the new resource group.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>Indicates whether the resource group was successfully modified.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the resource type. Valid values:</p>
     * <br>
     * <p>*   If you set the ResourceType parameter to project, set this parameter to the value of ProjectIdentifier. You can call the [ListProjects](~~178393~~) operation to obtain the value of ProjectIdentifier.</p>
     * <p>*   If you set the ResourceType parameter to tenantresourcegroup, set this parameter to the value of ResourceGroupType. You can call the [ListResourceGroups](~~173913~~) operation to obtain the value of ResourceGroupType. Only the values 7, 8, and 9 are valid.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ChangeResourceManagerResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceManagerResourceGroupRequest self = new ChangeResourceManagerResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceManagerResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ChangeResourceManagerResourceGroupRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ChangeResourceManagerResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
