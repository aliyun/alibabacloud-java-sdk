// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class CalMcpToolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CalMcpToolResponseBody body;

    public static CalMcpToolResponse build(java.util.Map<String, ?> map) throws Exception {
        CalMcpToolResponse self = new CalMcpToolResponse();
        return TeaModel.build(map, self);
    }

    public CalMcpToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalMcpToolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalMcpToolResponse setBody(CalMcpToolResponseBody body) {
        this.body = body;
        return this;
    }
    public CalMcpToolResponseBody getBody() {
        return this.body;
    }

}
