// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLdpsNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLdpsNamespaceResponseBody body;

    public static CreateLdpsNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLdpsNamespaceResponse self = new CreateLdpsNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLdpsNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLdpsNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLdpsNamespaceResponse setBody(CreateLdpsNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLdpsNamespaceResponseBody getBody() {
        return this.body;
    }

}
