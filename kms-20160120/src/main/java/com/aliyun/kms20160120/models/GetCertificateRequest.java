// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    public static GetCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateRequest self = new GetCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

}
