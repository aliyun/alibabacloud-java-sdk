// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadUserCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadUserCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadUserCertificateResponseBody self = new UploadUserCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadUserCertificateResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public UploadUserCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
