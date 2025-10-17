// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteApsWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApsWebhookResponseBody body;

    public static DeleteApsWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApsWebhookResponse self = new DeleteApsWebhookResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApsWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApsWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApsWebhookResponse setBody(DeleteApsWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApsWebhookResponseBody getBody() {
        return this.body;
    }

}
