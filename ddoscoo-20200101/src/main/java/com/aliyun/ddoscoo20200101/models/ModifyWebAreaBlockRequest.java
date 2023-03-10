// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockRequest extends TeaModel {
    /**
     * <p>The domain name whose configurations you want to modify.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The regions from which you block requests.</p>
     * <br>
     * <p>> If you do not configure this parameter, the Blocked Regions (Domain Names) policy is disabled.</p>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](~~94485~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyWebAreaBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockRequest self = new ModifyWebAreaBlockRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebAreaBlockRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public ModifyWebAreaBlockRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
