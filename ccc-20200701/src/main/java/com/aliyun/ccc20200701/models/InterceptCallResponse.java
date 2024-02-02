// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InterceptCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InterceptCallResponseBody body;

    public static InterceptCallResponse build(java.util.Map<String, ?> map) throws Exception {
        InterceptCallResponse self = new InterceptCallResponse();
        return TeaModel.build(map, self);
    }

    public InterceptCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InterceptCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InterceptCallResponse setBody(InterceptCallResponseBody body) {
        this.body = body;
        return this;
    }
    public InterceptCallResponseBody getBody() {
        return this.body;
    }

}
