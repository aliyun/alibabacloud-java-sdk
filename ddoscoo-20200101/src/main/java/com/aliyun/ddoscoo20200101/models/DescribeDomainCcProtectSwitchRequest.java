// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainCcProtectSwitchRequest extends TeaModel {
    /**
     * <p>The domain names of the websites. You can specify up to five domain names.</p>
     * <blockquote>
     * <p>A website forwarding rule must be configured for the domain name. Call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro instance belongs in Resource Management. If you do not specify this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDomainCcProtectSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcProtectSwitchRequest self = new DescribeDomainCcProtectSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcProtectSwitchRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeDomainCcProtectSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
