// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class OpenHttpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenHttpsResponseBody body;

    public static OpenHttpsResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenHttpsResponse self = new OpenHttpsResponse();
        return TeaModel.build(map, self);
    }

    public OpenHttpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenHttpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenHttpsResponse setBody(OpenHttpsResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenHttpsResponseBody getBody() {
        return this.body;
    }

}
