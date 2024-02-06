// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertTemplateResponseBody body;

    public static DeleteAlertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertTemplateResponse self = new DeleteAlertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertTemplateResponse setBody(DeleteAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertTemplateResponseBody getBody() {
        return this.body;
    }

}
