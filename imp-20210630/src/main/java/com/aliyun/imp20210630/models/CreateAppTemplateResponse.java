// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateAppTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppTemplateResponseBody body;

    public static CreateAppTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTemplateResponse self = new CreateAppTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppTemplateResponse setBody(CreateAppTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppTemplateResponseBody getBody() {
        return this.body;
    }

}
