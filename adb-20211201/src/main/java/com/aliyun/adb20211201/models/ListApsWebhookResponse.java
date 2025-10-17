// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApsWebhookResponseBody body;

    public static ListApsWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApsWebhookResponse self = new ListApsWebhookResponse();
        return TeaModel.build(map, self);
    }

    public ListApsWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApsWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApsWebhookResponse setBody(ListApsWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApsWebhookResponseBody getBody() {
        return this.body;
    }

}
