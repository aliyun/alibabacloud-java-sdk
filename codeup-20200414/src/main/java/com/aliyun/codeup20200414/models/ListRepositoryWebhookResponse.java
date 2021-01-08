// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryWebhookResponseBody body;

    public static ListRepositoryWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryWebhookResponse self = new ListRepositoryWebhookResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryWebhookResponse setBody(ListRepositoryWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryWebhookResponseBody getBody() {
        return this.body;
    }

}
