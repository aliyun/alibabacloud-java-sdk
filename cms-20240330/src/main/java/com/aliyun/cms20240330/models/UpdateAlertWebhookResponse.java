// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertWebhookResponseBody body;

    public static UpdateAlertWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertWebhookResponse self = new UpdateAlertWebhookResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertWebhookResponse setBody(UpdateAlertWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertWebhookResponseBody getBody() {
        return this.body;
    }

}
