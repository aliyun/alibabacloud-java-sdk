// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rg-aj01tck67a0szp***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
