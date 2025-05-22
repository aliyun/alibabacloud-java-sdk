// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupRequest extends TeaModel {
    /**
     * <blockquote>
     * <p> The ID of the resource group that you want to delete.</p>
     * </blockquote>
     * <ul>
     * <li>If you also specify ResourceGroupIds, both parameters take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-aj01tck67a0szp***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <blockquote>
     * <p> The IDs of the resource groups that you want to delete.</p>
     * </blockquote>
     * <ul>
     * <li>If you also specify ResourceGroupId, both parameters take effect.</li>
     * </ul>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    public static DeleteResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupRequest self = new DeleteResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteResourceGroupRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
