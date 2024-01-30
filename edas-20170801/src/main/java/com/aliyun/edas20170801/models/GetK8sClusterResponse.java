// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetK8sClusterResponseBody body;

    public static GetK8sClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetK8sClusterResponse self = new GetK8sClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetK8sClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetK8sClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetK8sClusterResponse setBody(GetK8sClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetK8sClusterResponseBody getBody() {
        return this.body;
    }

}
