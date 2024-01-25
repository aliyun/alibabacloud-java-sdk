// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertIgnoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutAlertIgnoreResponseBody body;

    public static PutAlertIgnoreResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertIgnoreResponse self = new PutAlertIgnoreResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertIgnoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertIgnoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAlertIgnoreResponse setBody(PutAlertIgnoreResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertIgnoreResponseBody getBody() {
        return this.body;
    }

}
