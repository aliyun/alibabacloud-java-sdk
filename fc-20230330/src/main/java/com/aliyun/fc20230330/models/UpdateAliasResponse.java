// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Alias body;

    public static UpdateAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasResponse self = new UpdateAliasResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAliasResponse setBody(Alias body) {
        this.body = body;
        return this;
    }
    public Alias getBody() {
        return this.body;
    }

}
