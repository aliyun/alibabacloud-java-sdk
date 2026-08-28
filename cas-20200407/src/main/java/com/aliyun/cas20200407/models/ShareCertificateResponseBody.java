// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ShareCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A79D2C05-4B0B-57CA-873D-4FA985F2D26E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ShareCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShareCertificateResponseBody self = new ShareCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ShareCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
