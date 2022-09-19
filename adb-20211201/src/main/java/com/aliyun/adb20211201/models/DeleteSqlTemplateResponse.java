// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSqlTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSqlTemplateResponseBody body;

    public static DeleteSqlTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSqlTemplateResponse self = new DeleteSqlTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSqlTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSqlTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSqlTemplateResponse setBody(DeleteSqlTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSqlTemplateResponseBody getBody() {
        return this.body;
    }

}
