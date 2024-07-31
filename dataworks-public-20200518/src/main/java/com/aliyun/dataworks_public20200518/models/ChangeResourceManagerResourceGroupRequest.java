// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ChangeResourceManagerResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource type.</p>
     * <ul>
     * <li>If you set ResourceType to project, set this parameter to the value of ProjectIdentifier. You can call the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation to obtain the value of ProjectIdentifier.</li>
     * <li>If you set ResourceType to tenantresourcegroup, set this parameter to the value of ResourceGroupType. You can call the <a href="https://help.aliyun.com/document_detail/2780075.html">ListResourceGroups</a> operation to obtain the value of ResourceGroupType. Only the values 7, 8, and 9 are valid.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the new resource group.</p>
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
     * <li>project: workspace. If you want to change the resource group that you specify when you activate DataWorks, set the value to project.</li>
     * <li>tenantresourcegroup: exclusive resource group. If you want to change the resource group that you specify when you purchase a DataWorks exclusive resource group, set the value to tenantresourcegroup.</li>
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
