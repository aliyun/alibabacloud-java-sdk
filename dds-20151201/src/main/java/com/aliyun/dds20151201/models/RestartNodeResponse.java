// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RestartNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartNodeResponseBody body;

    public static RestartNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartNodeResponse self = new RestartNodeResponse();
        return TeaModel.build(map, self);
    }

    public RestartNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartNodeResponse setBody(RestartNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartNodeResponseBody getBody() {
        return this.body;
    }

}
