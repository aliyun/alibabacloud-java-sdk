// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateDemoInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDemoInstanceResponseBody body;

    public static CreateDemoInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoInstanceResponse self = new CreateDemoInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDemoInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDemoInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDemoInstanceResponse setBody(CreateDemoInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDemoInstanceResponseBody getBody() {
        return this.body;
    }

}
