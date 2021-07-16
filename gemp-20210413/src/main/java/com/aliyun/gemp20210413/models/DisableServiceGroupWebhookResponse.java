// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableServiceGroupWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableServiceGroupWebhookResponseBody body;

    public static DisableServiceGroupWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableServiceGroupWebhookResponse self = new DisableServiceGroupWebhookResponse();
        return TeaModel.build(map, self);
    }

    public DisableServiceGroupWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableServiceGroupWebhookResponse setBody(DisableServiceGroupWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableServiceGroupWebhookResponseBody getBody() {
        return this.body;
    }

}
