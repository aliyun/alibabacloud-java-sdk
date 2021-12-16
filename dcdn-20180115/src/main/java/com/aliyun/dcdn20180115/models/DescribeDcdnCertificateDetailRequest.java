// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateDetailRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDcdnCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateDetailRequest self = new DescribeDcdnCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateDetailRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeDcdnCertificateDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnCertificateDetailRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
