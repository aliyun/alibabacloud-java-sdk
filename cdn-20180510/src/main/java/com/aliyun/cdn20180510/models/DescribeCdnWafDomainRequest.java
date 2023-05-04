// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnWafDomainRequest extends TeaModel {
    /**
     * <p>The domain name that you want to query.</p>
     * <br>
     * <p>You can specify only one domain name in each request. You have three options to configure this parameter:</p>
     * <br>
     * <p>*   Specify an exact domain name. For example, if you set this parameter to example.com, configuration information of example.com is queried.</p>
     * <p>*   Specify a keyword. For example, if you set this parameter to example, configuration information about all domain names that contain example is queried.</p>
     * <p>*   Leave this parameter empty. If this parameter is left empty, all accelerated domain names for which WAF is configured are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The region where WAF is enabled. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: inside the Chinese mainland</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland</p>
     * <br>
     * <p>> ap-southeast-1 includes Hong Kong (China), Macao (China), Taiwan (China), and other countries and regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeCdnWafDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnWafDomainRequest self = new DescribeCdnWafDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnWafDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnWafDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCdnWafDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
