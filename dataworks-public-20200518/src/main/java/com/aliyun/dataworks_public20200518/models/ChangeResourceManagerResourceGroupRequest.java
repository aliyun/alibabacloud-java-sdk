// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ChangeResourceManagerResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource. The value of this parameter depends on the value of the ResourceType parameter:</p>
     * <ul>
     * <li><p>If ResourceType is set to project, this parameter specifies the name of the workspace (ProjectIdentifier). You can call the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation to obtain the workspace name.</p>
     * </li>
     * <li><p>If ResourceType is set to tenantresourcegroup, this parameter specifies the identifier of the exclusive resource group (Identifier). You can call the <a href="https://help.aliyun.com/document_detail/2780075.html">ListResourceGroups</a> operation to obtain the identifier. This applies only to resource groups of type 7, 8, or 9.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the destination resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>project: a workspace. Select this value to change the resource group for a DataWorks edition.</p>
     * </li>
     * <li><p>tenantresourcegroup: an exclusive resource group. Select this value to change the resource group for a DataWorks exclusive resource group.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
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
