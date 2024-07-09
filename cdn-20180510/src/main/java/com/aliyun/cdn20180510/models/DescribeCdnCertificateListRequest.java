// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateListRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     * <p>If you do not specify an accelerated domain name, SSL certificates of all your accelerated domain names are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCdnCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateListRequest self = new DescribeCdnCertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnCertificateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnCertificateListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
