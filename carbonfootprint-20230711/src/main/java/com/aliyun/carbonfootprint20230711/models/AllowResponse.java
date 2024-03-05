// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class AllowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllowResponseBody body;

    public static AllowResponse build(java.util.Map<String, ?> map) throws Exception {
        AllowResponse self = new AllowResponse();
        return TeaModel.build(map, self);
    }

    public AllowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllowResponse setBody(AllowResponseBody body) {
        this.body = body;
        return this;
    }
    public AllowResponseBody getBody() {
        return this.body;
    }

}
