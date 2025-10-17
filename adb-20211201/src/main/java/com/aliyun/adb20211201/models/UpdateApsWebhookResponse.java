// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateApsWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApsWebhookResponseBody body;

    public static UpdateApsWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApsWebhookResponse self = new UpdateApsWebhookResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApsWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApsWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApsWebhookResponse setBody(UpdateApsWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApsWebhookResponseBody getBody() {
        return this.body;
    }

}
