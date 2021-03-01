// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeResourceGroupRequest extends TeaModel {
    @NameInMap("TargetUserId")
    public String targetUserId;

    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    public static AuthorizeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceGroupRequest self = new AuthorizeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceGroupRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public AuthorizeResourceGroupRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
