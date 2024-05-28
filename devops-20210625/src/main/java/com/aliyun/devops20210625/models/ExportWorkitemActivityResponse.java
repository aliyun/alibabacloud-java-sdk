// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportWorkitemActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportWorkitemActivityResponseBody body;

    public static ExportWorkitemActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkitemActivityResponse self = new ExportWorkitemActivityResponse();
        return TeaModel.build(map, self);
    }

    public ExportWorkitemActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportWorkitemActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportWorkitemActivityResponse setBody(ExportWorkitemActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportWorkitemActivityResponseBody getBody() {
        return this.body;
    }

}
