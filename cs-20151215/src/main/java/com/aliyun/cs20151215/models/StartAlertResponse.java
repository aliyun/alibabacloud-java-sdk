// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartAlertResponseBody body;

    public static StartAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAlertResponse self = new StartAlertResponse();
        return TeaModel.build(map, self);
    }

    public StartAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAlertResponse setBody(StartAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAlertResponseBody getBody() {
        return this.body;
    }

}
