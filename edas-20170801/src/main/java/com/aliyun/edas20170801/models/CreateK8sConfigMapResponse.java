// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateK8sConfigMapResponseBody body;

    public static CreateK8sConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sConfigMapResponse self = new CreateK8sConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public CreateK8sConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateK8sConfigMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateK8sConfigMapResponse setBody(CreateK8sConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateK8sConfigMapResponseBody getBody() {
        return this.body;
    }

}
