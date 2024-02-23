// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StopListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopListenerResponseBody body;

    public static StopListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopListenerResponse self = new StopListenerResponse();
        return TeaModel.build(map, self);
    }

    public StopListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopListenerResponse setBody(StopListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopListenerResponseBody getBody() {
        return this.body;
    }

}
