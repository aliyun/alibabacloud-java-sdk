// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UploadCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UploadCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCertificateResponseBody self = new UploadCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
