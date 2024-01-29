// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetKubernetesSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKubernetesSourceResponseBody body;

    public static GetKubernetesSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesSourceResponse self = new GetKubernetesSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetKubernetesSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKubernetesSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKubernetesSourceResponse setBody(GetKubernetesSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKubernetesSourceResponseBody getBody() {
        return this.body;
    }

}
