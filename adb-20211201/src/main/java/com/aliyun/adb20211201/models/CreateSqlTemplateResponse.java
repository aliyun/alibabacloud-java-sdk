// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSqlTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSqlTemplateResponseBody body;

    public static CreateSqlTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlTemplateResponse self = new CreateSqlTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlTemplateResponse setBody(CreateSqlTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlTemplateResponseBody getBody() {
        return this.body;
    }

}
