// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExtensionsResponseBody body;

    public static CreateExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionsResponse self = new CreateExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public CreateExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExtensionsResponse setBody(CreateExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExtensionsResponseBody getBody() {
        return this.body;
    }

}
