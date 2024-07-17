// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeregisterLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeregisterLocationResponseBody body;

    public static DeregisterLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterLocationResponse self = new DeregisterLocationResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeregisterLocationResponse setBody(DeregisterLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterLocationResponseBody getBody() {
        return this.body;
    }

}
