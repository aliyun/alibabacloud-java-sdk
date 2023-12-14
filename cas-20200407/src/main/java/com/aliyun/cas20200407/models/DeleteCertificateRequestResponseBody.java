// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCertificateRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequestResponseBody self = new DeleteCertificateRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
