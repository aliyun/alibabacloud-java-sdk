// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificateDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18594156</p>
     */
    @NameInMap("CertificateId")
    public Long certificateId;

    public static GetCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateDetailRequest self = new GetCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCertificateDetailRequest setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

}
