// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertTemplateResponseBody body;

    public static CreateAlertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertTemplateResponse self = new CreateAlertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertTemplateResponse setBody(CreateAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertTemplateResponseBody getBody() {
        return this.body;
    }

}
