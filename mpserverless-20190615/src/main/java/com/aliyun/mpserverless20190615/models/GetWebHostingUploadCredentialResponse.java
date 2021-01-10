// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingUploadCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebHostingUploadCredentialResponseBody body;

    public static GetWebHostingUploadCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingUploadCredentialResponse self = new GetWebHostingUploadCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingUploadCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingUploadCredentialResponse setBody(GetWebHostingUploadCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingUploadCredentialResponseBody getBody() {
        return this.body;
    }

}
