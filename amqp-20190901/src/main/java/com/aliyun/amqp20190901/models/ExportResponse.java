// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportResponseBody body;

    public static ExportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportResponse self = new ExportResponse();
        return TeaModel.build(map, self);
    }

    public ExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportResponse setBody(ExportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportResponseBody getBody() {
        return this.body;
    }

}
