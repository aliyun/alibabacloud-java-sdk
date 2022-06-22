// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddNamespaceResponseBody body;

    public static AddNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNamespaceResponse self = new AddNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public AddNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddNamespaceResponse setBody(AddNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddNamespaceResponseBody getBody() {
        return this.body;
    }

}
