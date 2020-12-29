// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class CreateUserCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertId")
    public Long certId;

    public static CreateUserCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserCertificateResponseBody self = new CreateUserCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserCertificateResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

}
