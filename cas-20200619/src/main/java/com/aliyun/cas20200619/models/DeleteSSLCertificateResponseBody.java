// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DeleteSSLCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSSLCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSSLCertificateResponseBody self = new DeleteSSLCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSSLCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
