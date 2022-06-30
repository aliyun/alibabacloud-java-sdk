// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAreaBlockConfigsRequest extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebAreaBlockConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAreaBlockConfigsRequest self = new DescribeWebAreaBlockConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebAreaBlockConfigsRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeWebAreaBlockConfigsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
