// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAliasResponseBody body;

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

    public UpdateAliasResponse setBody(UpdateAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAliasResponseBody getBody() {
        return this.body;
    }

}
