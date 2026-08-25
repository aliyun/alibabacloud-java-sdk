// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class EnableImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableImageResponseBody body;

    public static EnableImageResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableImageResponse self = new EnableImageResponse();
        return TeaModel.build(map, self);
    }

    public EnableImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableImageResponse setBody(EnableImageResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableImageResponseBody getBody() {
        return this.body;
    }

}
