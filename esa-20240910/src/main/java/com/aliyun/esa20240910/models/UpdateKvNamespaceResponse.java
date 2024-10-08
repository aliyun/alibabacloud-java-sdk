// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKvNamespaceResponseBody body;

    public static UpdateKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKvNamespaceResponse self = new UpdateKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKvNamespaceResponse setBody(UpdateKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
