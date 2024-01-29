// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListRepositoryWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryWebhookResponse setBody(ListRepositoryWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryWebhookResponseBody getBody() {
        return this.body;
    }

}
