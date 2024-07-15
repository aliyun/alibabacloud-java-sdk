// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterKubeconfigStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterKubeconfigStatesResponseBody body;

    public static ListClusterKubeconfigStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterKubeconfigStatesResponse self = new ListClusterKubeconfigStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterKubeconfigStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterKubeconfigStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterKubeconfigStatesResponse setBody(ListClusterKubeconfigStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterKubeconfigStatesResponseBody getBody() {
        return this.body;
    }

}
