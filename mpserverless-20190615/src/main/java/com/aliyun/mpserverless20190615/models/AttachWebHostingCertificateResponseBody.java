// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachWebHostingCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static AttachWebHostingCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachWebHostingCertificateResponseBody self = new AttachWebHostingCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachWebHostingCertificateResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AttachWebHostingCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
