// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcesRequest extends TeaModel {
    @NameInMap("with_addon_resources")
    public Boolean withAddonResources;

    public static DescribeClusterResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcesRequest self = new DescribeClusterResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourcesRequest setWithAddonResources(Boolean withAddonResources) {
        this.withAddonResources = withAddonResources;
        return this;
    }
    public Boolean getWithAddonResources() {
        return this.withAddonResources;
    }

}
