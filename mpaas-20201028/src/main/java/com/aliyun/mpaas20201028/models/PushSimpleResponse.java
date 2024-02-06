// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushSimpleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushSimpleResponseBody body;

    public static PushSimpleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSimpleResponse self = new PushSimpleResponse();
        return TeaModel.build(map, self);
    }

    public PushSimpleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSimpleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushSimpleResponse setBody(PushSimpleResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSimpleResponseBody getBody() {
        return this.body;
    }

}
