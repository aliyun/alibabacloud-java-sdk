// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNamespaceResponseBody body;

    public static CreateNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceResponse self = new CreateNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNamespaceResponse setBody(CreateNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNamespaceResponseBody getBody() {
        return this.body;
    }

}
