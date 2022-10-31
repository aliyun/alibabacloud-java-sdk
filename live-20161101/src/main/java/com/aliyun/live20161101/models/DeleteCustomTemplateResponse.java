// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCustomTemplateResponseBody body;

    public static DeleteCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateResponse self = new DeleteCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomTemplateResponse setBody(DeleteCustomTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomTemplateResponseBody getBody() {
        return this.body;
    }

}
