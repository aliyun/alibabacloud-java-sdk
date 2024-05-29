// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCacheConfigsRequest extends TeaModel {
    /**
     * <p>An array consisting of domain names for which you want to query the Static Page Caching configurations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
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
