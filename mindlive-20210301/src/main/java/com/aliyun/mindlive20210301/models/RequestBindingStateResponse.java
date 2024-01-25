// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBindingStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestBindingStateResponseBody body;

    public static RequestBindingStateResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestBindingStateResponse self = new RequestBindingStateResponse();
        return TeaModel.build(map, self);
    }

    public RequestBindingStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestBindingStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestBindingStateResponse setBody(RequestBindingStateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestBindingStateResponseBody getBody() {
        return this.body;
    }

}
