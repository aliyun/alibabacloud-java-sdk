// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutAlertContactResponseBody body;

    public static PutAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactResponse self = new PutAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAlertContactResponse setBody(PutAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertContactResponseBody getBody() {
        return this.body;
    }

}
