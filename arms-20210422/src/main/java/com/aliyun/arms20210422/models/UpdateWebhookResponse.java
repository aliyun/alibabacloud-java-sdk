// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class UpdateWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWebhookResponseBody body;

    public static UpdateWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebhookResponse self = new UpdateWebhookResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebhookResponse setBody(UpdateWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebhookResponseBody getBody() {
        return this.body;
    }

}
