// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteK8sConfigMapResponseBody body;

    public static DeleteK8sConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sConfigMapResponse self = new DeleteK8sConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteK8sConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteK8sConfigMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteK8sConfigMapResponse setBody(DeleteK8sConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sConfigMapResponseBody getBody() {
        return this.body;
    }

}
