// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateDetailRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeLiveCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateDetailRequest self = new DescribeLiveCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateDetailRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeLiveCertificateDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveCertificateDetailRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
