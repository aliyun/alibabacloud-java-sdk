// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertWebhooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertWebhooksResponseBody body;

    public static ListAlertWebhooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertWebhooksResponse self = new ListAlertWebhooksResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertWebhooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertWebhooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertWebhooksResponse setBody(ListAlertWebhooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertWebhooksResponseBody getBody() {
        return this.body;
    }

}
