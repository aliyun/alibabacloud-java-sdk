// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSparkTemplateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSparkTemplateFileResponseBody body;

    public static DeleteSparkTemplateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSparkTemplateFileResponse self = new DeleteSparkTemplateFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSparkTemplateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSparkTemplateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSparkTemplateFileResponse setBody(DeleteSparkTemplateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSparkTemplateFileResponseBody getBody() {
        return this.body;
    }

}
