// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteRepositoryWebhookResponse setBody(DeleteRepositoryWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryWebhookResponseBody getBody() {
        return this.body;
    }

}
