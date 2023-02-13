// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCACertificateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCACertificateStatusResponseBody self = new UpdateCACertificateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCACertificateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
