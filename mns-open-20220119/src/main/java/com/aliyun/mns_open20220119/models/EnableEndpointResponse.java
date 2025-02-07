// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class EnableEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableEndpointResponseBody body;

    public static EnableEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableEndpointResponse self = new EnableEndpointResponse();
        return TeaModel.build(map, self);
    }

    public EnableEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableEndpointResponse setBody(EnableEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableEndpointResponseBody getBody() {
        return this.body;
    }

}
