// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAliasResponseBody body;

    public static DeleteAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasResponse self = new DeleteAliasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAliasResponse setBody(DeleteAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAliasResponseBody getBody() {
        return this.body;
    }

}
