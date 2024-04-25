// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetTemporaryFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemporaryFileUrlResponseBody body;

    public static GetTemporaryFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemporaryFileUrlResponse self = new GetTemporaryFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTemporaryFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemporaryFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemporaryFileUrlResponse setBody(GetTemporaryFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemporaryFileUrlResponseBody getBody() {
        return this.body;
    }

}
