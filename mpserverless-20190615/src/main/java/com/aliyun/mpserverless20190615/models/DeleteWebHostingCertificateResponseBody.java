// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWebHostingCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWebHostingCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebHostingCertificateResponseBody self = new DeleteWebHostingCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWebHostingCertificateResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteWebHostingCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
