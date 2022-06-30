// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCacheConfigsRequest extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebCacheConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCacheConfigsRequest self = new DescribeWebCacheConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebCacheConfigsRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeWebCacheConfigsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
