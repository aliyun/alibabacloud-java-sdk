// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CheckLdpsColumnarIndexStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLdpsColumnarIndexStatusResponseBody body;

    public static CheckLdpsColumnarIndexStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLdpsColumnarIndexStatusResponse self = new CheckLdpsColumnarIndexStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckLdpsColumnarIndexStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLdpsColumnarIndexStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLdpsColumnarIndexStatusResponse setBody(CheckLdpsColumnarIndexStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLdpsColumnarIndexStatusResponseBody getBody() {
        return this.body;
    }

}
