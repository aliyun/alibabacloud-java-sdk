// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTotalPublicUrlResponseBody body;

    public static GetTotalPublicUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTotalPublicUrlResponse self = new GetTotalPublicUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTotalPublicUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTotalPublicUrlResponse setBody(GetTotalPublicUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTotalPublicUrlResponseBody getBody() {
        return this.body;
    }

}
