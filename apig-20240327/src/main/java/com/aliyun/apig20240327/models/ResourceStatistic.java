// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResourceStatistic extends TeaModel {
    @NameInMap("resourceCount")
    public Integer resourceCount;

    @NameInMap("resourceType")
    public String resourceType;

    public static ResourceStatistic build(java.util.Map<String, ?> map) throws Exception {
        ResourceStatistic self = new ResourceStatistic();
        return TeaModel.build(map, self);
    }

    public ResourceStatistic setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public Integer getResourceCount() {
        return this.resourceCount;
    }

    public ResourceStatistic setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
