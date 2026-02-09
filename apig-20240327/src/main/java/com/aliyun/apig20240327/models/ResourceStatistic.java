// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResourceStatistic extends TeaModel {
    /**
     * <p>The number of online resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("resourceCount")
    public Integer resourceCount;

    /**
     * <p>The resource type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HttpApi</li>
     * <li>GatewayRoute</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
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
