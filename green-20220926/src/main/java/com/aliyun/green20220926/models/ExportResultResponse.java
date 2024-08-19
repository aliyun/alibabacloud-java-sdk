// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportResultResponseBody body;

    public static ExportResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportResultResponse self = new ExportResultResponse();
        return TeaModel.build(map, self);
    }

    public ExportResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportResultResponse setBody(ExportResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportResultResponseBody getBody() {
        return this.body;
    }

}
