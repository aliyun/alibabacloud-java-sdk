// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelPendingCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelPendingCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPendingCertificateResponseBody self = new CancelPendingCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPendingCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
