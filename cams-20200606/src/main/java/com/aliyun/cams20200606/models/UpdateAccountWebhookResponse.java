// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAccountWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccountWebhookResponseBody body;

    public static UpdateAccountWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountWebhookResponse self = new UpdateAccountWebhookResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccountWebhookResponse setBody(UpdateAccountWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountWebhookResponseBody getBody() {
        return this.body;
    }

}
