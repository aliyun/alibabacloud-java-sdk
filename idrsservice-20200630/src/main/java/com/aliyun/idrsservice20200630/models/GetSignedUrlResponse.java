// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSignedUrlResponseBody body;

    public static GetSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSignedUrlResponse self = new GetSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSignedUrlResponse setBody(GetSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSignedUrlResponseBody getBody() {
        return this.body;
    }

}
