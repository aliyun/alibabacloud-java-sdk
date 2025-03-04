// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartCallResponseBody body;

    public static StartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCallResponse self = new StartCallResponse();
        return TeaModel.build(map, self);
    }

    public StartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCallResponse setBody(StartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCallResponseBody getBody() {
        return this.body;
    }

}
