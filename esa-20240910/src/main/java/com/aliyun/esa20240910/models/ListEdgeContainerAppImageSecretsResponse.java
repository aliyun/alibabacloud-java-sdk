// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppImageSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeContainerAppImageSecretsResponseBody body;

    public static ListEdgeContainerAppImageSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppImageSecretsResponse self = new ListEdgeContainerAppImageSecretsResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppImageSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeContainerAppImageSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeContainerAppImageSecretsResponse setBody(ListEdgeContainerAppImageSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeContainerAppImageSecretsResponseBody getBody() {
        return this.body;
    }

}
