// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListEncryptWebhooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEncryptWebhooksResponseBody body;

    public static ListEncryptWebhooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEncryptWebhooksResponse self = new ListEncryptWebhooksResponse();
        return TeaModel.build(map, self);
    }

    public ListEncryptWebhooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEncryptWebhooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEncryptWebhooksResponse setBody(ListEncryptWebhooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEncryptWebhooksResponseBody getBody() {
        return this.body;
    }

}
