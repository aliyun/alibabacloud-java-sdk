// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebHostingCertificateDetailResponseBody body;

    public static GetWebHostingCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingCertificateDetailResponse self = new GetWebHostingCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingCertificateDetailResponse setBody(GetWebHostingCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
