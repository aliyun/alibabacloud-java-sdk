// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetPreSignedUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPreSignedUrlResponse setBody(GetPreSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPreSignedUrlResponseBody getBody() {
        return this.body;
    }

}
