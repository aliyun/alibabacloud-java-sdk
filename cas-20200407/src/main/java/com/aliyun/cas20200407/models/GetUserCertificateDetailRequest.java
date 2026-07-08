// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter the certificate content from the response. Valid values: <strong>true</strong>: The Cert, Key, EncryptCert, EncryptPrivateKey, SignCert, and SignPrivateKey parameters are not returned. <strong>false</strong> (default): All parameters are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CertFilter")
    public Boolean certFilter;

    /**
     * <p>The ID of the certificate. To get this ID, call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6055048</p>
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
