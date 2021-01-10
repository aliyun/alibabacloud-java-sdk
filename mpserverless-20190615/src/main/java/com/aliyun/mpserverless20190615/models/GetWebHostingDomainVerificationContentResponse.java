// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingDomainVerificationContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebHostingDomainVerificationContentResponseBody body;

    public static GetWebHostingDomainVerificationContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingDomainVerificationContentResponse self = new GetWebHostingDomainVerificationContentResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingDomainVerificationContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingDomainVerificationContentResponse setBody(GetWebHostingDomainVerificationContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingDomainVerificationContentResponseBody getBody() {
        return this.body;
    }

}
