// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRevokeClientCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRevokeClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRevokeClientCertificateResponseBody self = new CreateRevokeClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRevokeClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
