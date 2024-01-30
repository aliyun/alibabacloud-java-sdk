// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sConfigMapResponseBody body;

    public static UpdateK8sConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sConfigMapResponse self = new UpdateK8sConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sConfigMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sConfigMapResponse setBody(UpdateK8sConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sConfigMapResponseBody getBody() {
        return this.body;
    }

}
