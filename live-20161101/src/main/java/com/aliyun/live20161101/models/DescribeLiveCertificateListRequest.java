// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeLiveCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListRequest self = new DescribeLiveCertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveCertificateListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
