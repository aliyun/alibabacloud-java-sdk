// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListClientSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientSecretsResponseBody body;

    public static ListClientSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientSecretsResponse self = new ListClientSecretsResponse();
        return TeaModel.build(map, self);
    }

    public ListClientSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientSecretsResponse setBody(ListClientSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientSecretsResponseBody getBody() {
        return this.body;
    }

}
