// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailRequest extends TeaModel {
    @NameInMap("CertId")
    public Long certId;

    public static GetUserCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserCertificateDetailRequest self = new GetUserCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetUserCertificateDetailRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

}
