// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCdnCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailRequest self = new DescribeCdnCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeCdnCertificateDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnCertificateDetailRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
