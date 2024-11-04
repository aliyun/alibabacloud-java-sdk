// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAXBCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAXBCallResponseBody body;

    public static BindAXBCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAXBCallResponse self = new BindAXBCallResponse();
        return TeaModel.build(map, self);
    }

    public BindAXBCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAXBCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAXBCallResponse setBody(BindAXBCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAXBCallResponseBody getBody() {
        return this.body;
    }

}
