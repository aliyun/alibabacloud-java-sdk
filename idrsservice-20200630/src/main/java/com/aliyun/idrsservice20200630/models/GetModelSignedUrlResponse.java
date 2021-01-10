// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetModelSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelSignedUrlResponseBody body;

    public static GetModelSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelSignedUrlResponse self = new GetModelSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetModelSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelSignedUrlResponse setBody(GetModelSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelSignedUrlResponseBody getBody() {
        return this.body;
    }

}
