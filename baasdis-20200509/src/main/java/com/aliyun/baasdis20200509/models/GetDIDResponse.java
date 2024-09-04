// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class GetDIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDIDResponseBody body;

    public static GetDIDResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDIDResponse self = new GetDIDResponse();
        return TeaModel.build(map, self);
    }

    public GetDIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDIDResponse setBody(GetDIDResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDIDResponseBody getBody() {
        return this.body;
    }

}
