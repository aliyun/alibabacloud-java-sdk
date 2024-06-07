// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetTotalPublicUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTotalPublicUrlResponse setBody(GetTotalPublicUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTotalPublicUrlResponseBody getBody() {
        return this.body;
    }

}
