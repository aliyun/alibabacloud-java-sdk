// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEnvironmentProductVersionsResponseBody body;

    public static AddEnvironmentProductVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionsResponse self = new AddEnvironmentProductVersionsResponse();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnvironmentProductVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEnvironmentProductVersionsResponse setBody(AddEnvironmentProductVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnvironmentProductVersionsResponseBody getBody() {
        return this.body;
    }

}
