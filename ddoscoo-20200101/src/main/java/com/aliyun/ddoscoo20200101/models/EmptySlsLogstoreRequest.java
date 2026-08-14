// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static EmptySlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        EmptySlsLogstoreRequest self = new EmptySlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public EmptySlsLogstoreRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
