// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSparkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSparkTemplateResponseBody body;

    public static CreateSparkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSparkTemplateResponse self = new CreateSparkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSparkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSparkTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSparkTemplateResponse setBody(CreateSparkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSparkTemplateResponseBody getBody() {
        return this.body;
    }

}
