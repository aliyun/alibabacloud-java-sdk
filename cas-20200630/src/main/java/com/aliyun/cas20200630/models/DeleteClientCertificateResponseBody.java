// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DeleteClientCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCertificateResponseBody self = new DeleteClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
