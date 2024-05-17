// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group. You can call the ListResourceGroup operation to query the resource group ID. For more information, see [ListResourceGroup](https://help.aliyun.com/document_detail/62055.html).</p>
     * <br>
     * <p>You can specify multiple resource group IDs. Separate multiple resource group IDs with semicolons (;).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <p>The ID of the RAM user to be authorized.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetUserId")
    public String targetUserId;

    public static AuthorizeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceGroupRequest self = new AuthorizeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceGroupRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public AuthorizeResourceGroupRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
