// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationClientSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationClientSecretsResponseBody body;

    public static ListApplicationClientSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationClientSecretsResponse self = new ListApplicationClientSecretsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationClientSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationClientSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationClientSecretsResponse setBody(ListApplicationClientSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationClientSecretsResponseBody getBody() {
        return this.body;
    }

}
