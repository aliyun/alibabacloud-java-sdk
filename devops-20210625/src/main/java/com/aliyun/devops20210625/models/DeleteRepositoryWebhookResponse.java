// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRepositoryWebhookResponseBody body;

    public static DeleteRepositoryWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryWebhookResponse self = new DeleteRepositoryWebhookResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepositoryWebhookResponse setBody(DeleteRepositoryWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryWebhookResponseBody getBody() {
        return this.body;
    }

}
