// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListKubernetesClusterResponseBody body;

    public static ListKubernetesClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKubernetesClusterResponse self = new ListKubernetesClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListKubernetesClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKubernetesClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKubernetesClusterResponse setBody(ListKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
