// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionResourcesRequest extends TeaModel {
    // product version resources
    @NameInMap("resources")
    public String resources;

    public static UpdateProductVersionResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionResourcesRequest self = new UpdateProductVersionResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionResourcesRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
