// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebAccessLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableWebAccessLogConfigResponseBody body;

    public static EnableWebAccessLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWebAccessLogConfigResponse self = new EnableWebAccessLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public EnableWebAccessLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWebAccessLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableWebAccessLogConfigResponse setBody(EnableWebAccessLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWebAccessLogConfigResponseBody getBody() {
        return this.body;
    }

}
