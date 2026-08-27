// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListK8sClusterSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8sClusterSourcesResponseBody body;

    public static ListK8sClusterSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sClusterSourcesResponse self = new ListK8sClusterSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sClusterSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sClusterSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sClusterSourcesResponse setBody(ListK8sClusterSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sClusterSourcesResponseBody getBody() {
        return this.body;
    }

}
