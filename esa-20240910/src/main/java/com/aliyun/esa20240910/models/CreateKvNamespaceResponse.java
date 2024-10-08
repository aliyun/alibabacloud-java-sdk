// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKvNamespaceResponseBody body;

    public static CreateKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKvNamespaceResponse self = new CreateKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKvNamespaceResponse setBody(CreateKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
