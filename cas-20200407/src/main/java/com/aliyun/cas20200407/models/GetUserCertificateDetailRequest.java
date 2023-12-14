// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailRequest extends TeaModel {
    /**
     * <p>值为true时Cert、Key、EncryptCert、EncryptPrivateKey、SignCert、SignPrivateKey信息不返回，false时则返回，默认是false。</p>
     */
    @NameInMap("CertFilter")
    public Boolean certFilter;

    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertId")
    public Long certId;

    public static GetUserCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserCertificateDetailRequest self = new GetUserCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetUserCertificateDetailRequest setCertFilter(Boolean certFilter) {
        this.certFilter = certFilter;
        return this;
    }
    public Boolean getCertFilter() {
        return this.certFilter;
    }

    public GetUserCertificateDetailRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

}
