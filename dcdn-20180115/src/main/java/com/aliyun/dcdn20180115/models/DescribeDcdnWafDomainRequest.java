// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. If you do not specify an accelerated domain name, all accelerated domain names are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The region where WAF is enabled.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you leave this parameter empty, the default resource group is used.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDcdnWafDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainRequest self = new DescribeDcdnWafDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnWafDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDcdnWafDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
