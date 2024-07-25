// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RevokeK8sClusterKubeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeK8sClusterKubeConfigResponseBody body;

    public static RevokeK8sClusterKubeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeK8sClusterKubeConfigResponse self = new RevokeK8sClusterKubeConfigResponse();
        return TeaModel.build(map, self);
    }

    public RevokeK8sClusterKubeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeK8sClusterKubeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeK8sClusterKubeConfigResponse setBody(RevokeK8sClusterKubeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeK8sClusterKubeConfigResponseBody getBody() {
        return this.body;
    }

}
