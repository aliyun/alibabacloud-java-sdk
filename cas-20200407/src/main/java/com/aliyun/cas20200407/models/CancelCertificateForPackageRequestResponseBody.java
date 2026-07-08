// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelCertificateForPackageRequestResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request. Alibaba Cloud generates this ID for each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelCertificateForPackageRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCertificateForPackageRequestResponseBody self = new CancelCertificateForPackageRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCertificateForPackageRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
