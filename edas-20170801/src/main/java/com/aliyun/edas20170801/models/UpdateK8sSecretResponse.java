// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sSecretResponseBody body;

    public static UpdateK8sSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sSecretResponse self = new UpdateK8sSecretResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sSecretResponse setBody(UpdateK8sSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sSecretResponseBody getBody() {
        return this.body;
    }

}
