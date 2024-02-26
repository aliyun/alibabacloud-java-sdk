// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Alias body;

    public static CreateAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasResponse self = new CreateAliasResponse();
        return TeaModel.build(map, self);
    }

    public CreateAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAliasResponse setBody(Alias body) {
        this.body = body;
        return this;
    }
    public Alias getBody() {
        return this.body;
    }

}
