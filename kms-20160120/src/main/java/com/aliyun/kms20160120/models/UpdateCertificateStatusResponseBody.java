// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateCertificateStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>e3f57fe0-9ded-40b0-9caf-a3815f2148c1</p>
     */
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
