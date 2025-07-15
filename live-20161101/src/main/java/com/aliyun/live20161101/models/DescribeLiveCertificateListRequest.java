// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListRequest extends TeaModel {
    /**
     * <p>The ingest domain or streaming domain. Separate multiple domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com,example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeLiveCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListRequest self = new DescribeLiveCertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveCertificateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveCertificateListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
