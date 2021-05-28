// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CreateAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAlertTemplateResponse setBody(CreateAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertTemplateResponseBody getBody() {
        return this.body;
    }

}
