// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebInstanceRelationsRequest extends TeaModel {
    /**
     * <p>The domain names of the website. list</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebInstanceRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebInstanceRelationsRequest self = new DescribeWebInstanceRelationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebInstanceRelationsRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeWebInstanceRelationsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
