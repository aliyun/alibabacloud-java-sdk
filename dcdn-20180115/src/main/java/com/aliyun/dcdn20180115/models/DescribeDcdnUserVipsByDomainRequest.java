// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserVipsByDomainRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the virtual IP addresses of only healthy POPs. Valid value:</p>
     * <ul>
     * <li><strong>on</strong>: queries healthy VIPs.</li>
     * <li><strong>off</strong>: queries all VIPs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Available")
    public String available;

    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     * <p>Enumeration values: example.com</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnUserVipsByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserVipsByDomainRequest self = new DescribeDcdnUserVipsByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserVipsByDomainRequest setAvailable(String available) {
        this.available = available;
        return this;
    }
    public String getAvailable() {
        return this.available;
    }

    public DescribeDcdnUserVipsByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
