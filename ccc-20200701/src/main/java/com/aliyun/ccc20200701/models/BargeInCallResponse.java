// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BargeInCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BargeInCallResponseBody body;

    public static BargeInCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BargeInCallResponse self = new BargeInCallResponse();
        return TeaModel.build(map, self);
    }

    public BargeInCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BargeInCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BargeInCallResponse setBody(BargeInCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BargeInCallResponseBody getBody() {
        return this.body;
    }

}
