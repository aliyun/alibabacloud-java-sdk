// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportGeneratedContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportGeneratedContentResponseBody body;

    public static ExportGeneratedContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportGeneratedContentResponse self = new ExportGeneratedContentResponse();
        return TeaModel.build(map, self);
    }

    public ExportGeneratedContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportGeneratedContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportGeneratedContentResponse setBody(ExportGeneratedContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportGeneratedContentResponseBody getBody() {
        return this.body;
    }

}
