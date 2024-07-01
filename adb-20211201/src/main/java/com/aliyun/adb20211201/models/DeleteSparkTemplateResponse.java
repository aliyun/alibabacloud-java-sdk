// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSparkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSparkTemplateResponseBody body;

    public static DeleteSparkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSparkTemplateResponse self = new DeleteSparkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSparkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSparkTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSparkTemplateResponse setBody(DeleteSparkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSparkTemplateResponseBody getBody() {
        return this.body;
    }

}
