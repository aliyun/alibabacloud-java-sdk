// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class StopAppServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAppServerResponseBody body;

    public static StopAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppServerResponse self = new StopAppServerResponse();
        return TeaModel.build(map, self);
    }

    public StopAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAppServerResponse setBody(StopAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppServerResponseBody getBody() {
        return this.body;
    }

}
