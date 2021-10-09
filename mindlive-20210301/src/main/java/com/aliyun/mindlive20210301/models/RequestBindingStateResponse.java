// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBindingStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RequestBindingStateResponse setBody(RequestBindingStateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestBindingStateResponseBody getBody() {
        return this.body;
    }

}
