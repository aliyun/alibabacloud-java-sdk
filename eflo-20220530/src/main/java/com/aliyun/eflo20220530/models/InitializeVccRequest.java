// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class InitializeVccRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static InitializeVccRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeVccRequest self = new InitializeVccRequest();
        return TeaModel.build(map, self);
    }

    public InitializeVccRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
