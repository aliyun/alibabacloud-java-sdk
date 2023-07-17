// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class EnableAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAlertTemplateResponseBody body;

    public static EnableAlertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAlertTemplateResponse self = new EnableAlertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public EnableAlertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAlertTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAlertTemplateResponse setBody(EnableAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAlertTemplateResponseBody getBody() {
        return this.body;
    }

}
