// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class StartAppServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAppServerResponseBody body;

    public static StartAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAppServerResponse self = new StartAppServerResponse();
        return TeaModel.build(map, self);
    }

    public StartAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAppServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAppServerResponse setBody(StartAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAppServerResponseBody getBody() {
        return this.body;
    }

}
