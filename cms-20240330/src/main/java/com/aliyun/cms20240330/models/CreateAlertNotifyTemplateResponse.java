// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertNotifyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertNotifyTemplateResponseBody body;

    public static CreateAlertNotifyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertNotifyTemplateResponse self = new CreateAlertNotifyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertNotifyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertNotifyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertNotifyTemplateResponse setBody(CreateAlertNotifyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertNotifyTemplateResponseBody getBody() {
        return this.body;
    }

}
