// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWebhookResponseBody body;

    public static CreateWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookResponse self = new CreateWebhookResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebhookResponse setBody(CreateWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebhookResponseBody getBody() {
        return this.body;
    }

}
