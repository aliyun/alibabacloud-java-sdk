// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserVipsByDomainRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the virtual IP addresses of only healthy CDN POPs. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: healthy CDN edge nodes.</li>
     * <li><strong>off</strong>: all CDN edge nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Available")
    public String available;

    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeUserVipsByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVipsByDomainRequest self = new DescribeUserVipsByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserVipsByDomainRequest setAvailable(String available) {
        this.available = available;
        return this;
    }
    public String getAvailable() {
        return this.available;
    }

    public DescribeUserVipsByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
