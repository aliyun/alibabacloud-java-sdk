// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePhoneWebhookResponseBody body;

    public static UpdatePhoneWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneWebhookResponse self = new UpdatePhoneWebhookResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhoneWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePhoneWebhookResponse setBody(UpdatePhoneWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhoneWebhookResponseBody getBody() {
        return this.body;
    }

}
