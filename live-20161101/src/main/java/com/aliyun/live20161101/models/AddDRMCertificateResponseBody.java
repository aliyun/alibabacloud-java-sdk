// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddDRMCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertId")
    public String certId;

    public static AddDRMCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDRMCertificateResponseBody self = new AddDRMCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDRMCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDRMCertificateResponseBody setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

}
