// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class GetAlipayUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlipayUrlResponseBody body;

    public static GetAlipayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlResponse self = new GetAlipayUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlipayUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlipayUrlResponse setBody(GetAlipayUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlipayUrlResponseBody getBody() {
        return this.body;
    }

}
