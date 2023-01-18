// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class RequestTableQAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RequestTableQAResponseBody body;

    public static RequestTableQAResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestTableQAResponse self = new RequestTableQAResponse();
        return TeaModel.build(map, self);
    }

    public RequestTableQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestTableQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestTableQAResponse setBody(RequestTableQAResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestTableQAResponseBody getBody() {
        return this.body;
    }

}
