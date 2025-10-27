// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowAliasResponseBody body;

    public static CreateFlowAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowAliasResponse self = new CreateFlowAliasResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowAliasResponse setBody(CreateFlowAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowAliasResponseBody getBody() {
        return this.body;
    }

}
