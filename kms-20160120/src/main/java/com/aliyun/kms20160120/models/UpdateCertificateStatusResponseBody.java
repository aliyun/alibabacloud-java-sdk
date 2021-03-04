// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateCertificateStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCertificateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCertificateStatusResponseBody self = new UpdateCertificateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCertificateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
