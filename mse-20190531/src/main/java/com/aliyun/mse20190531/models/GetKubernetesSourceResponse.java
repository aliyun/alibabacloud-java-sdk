// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetKubernetesSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetKubernetesSourceResponse setBody(GetKubernetesSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKubernetesSourceResponseBody getBody() {
        return this.body;
    }

}
