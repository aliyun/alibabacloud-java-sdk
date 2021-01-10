// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPreSignedUrlResponseBody body;

    public static GetPreSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlResponse self = new GetPreSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPreSignedUrlResponse setBody(GetPreSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPreSignedUrlResponseBody getBody() {
        return this.body;
    }

}
