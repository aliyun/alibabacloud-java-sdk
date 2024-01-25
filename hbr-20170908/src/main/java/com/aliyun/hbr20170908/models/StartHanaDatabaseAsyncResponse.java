// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class StartHanaDatabaseAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartHanaDatabaseAsyncResponseBody body;

    public static StartHanaDatabaseAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        StartHanaDatabaseAsyncResponse self = new StartHanaDatabaseAsyncResponse();
        return TeaModel.build(map, self);
    }

    public StartHanaDatabaseAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartHanaDatabaseAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartHanaDatabaseAsyncResponse setBody(StartHanaDatabaseAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public StartHanaDatabaseAsyncResponseBody getBody() {
        return this.body;
    }

}
