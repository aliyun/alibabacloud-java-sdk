// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ExportResResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportResResponseBody body;

    public static ExportResResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportResResponse self = new ExportResResponse();
        return TeaModel.build(map, self);
    }

    public ExportResResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportResResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportResResponse setBody(ExportResResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportResResponseBody getBody() {
        return this.body;
    }

}
