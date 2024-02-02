// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartBack2BackCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartBack2BackCallResponseBody body;

    public static StartBack2BackCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBack2BackCallResponse self = new StartBack2BackCallResponse();
        return TeaModel.build(map, self);
    }

    public StartBack2BackCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBack2BackCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartBack2BackCallResponse setBody(StartBack2BackCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBack2BackCallResponseBody getBody() {
        return this.body;
    }

}
