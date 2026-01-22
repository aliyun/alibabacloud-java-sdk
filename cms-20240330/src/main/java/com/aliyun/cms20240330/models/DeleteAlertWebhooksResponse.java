// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertWebhooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertWebhooksResponseBody body;

    public static DeleteAlertWebhooksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertWebhooksResponse self = new DeleteAlertWebhooksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertWebhooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertWebhooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertWebhooksResponse setBody(DeleteAlertWebhooksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertWebhooksResponseBody getBody() {
        return this.body;
    }

}
