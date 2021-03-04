// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateResponseBody self = new DeleteCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
