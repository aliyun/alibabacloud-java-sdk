// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportIntervenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportIntervenesResponseBody body;

    public static ExportIntervenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportIntervenesResponse self = new ExportIntervenesResponse();
        return TeaModel.build(map, self);
    }

    public ExportIntervenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportIntervenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportIntervenesResponse setBody(ExportIntervenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportIntervenesResponseBody getBody() {
        return this.body;
    }

}
