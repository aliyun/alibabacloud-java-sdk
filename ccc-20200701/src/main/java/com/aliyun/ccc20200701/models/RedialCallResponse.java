// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RedialCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedialCallResponseBody body;

    public static RedialCallResponse build(java.util.Map<String, ?> map) throws Exception {
        RedialCallResponse self = new RedialCallResponse();
        return TeaModel.build(map, self);
    }

    public RedialCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedialCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedialCallResponse setBody(RedialCallResponseBody body) {
        this.body = body;
        return this;
    }
    public RedialCallResponseBody getBody() {
        return this.body;
    }

}
