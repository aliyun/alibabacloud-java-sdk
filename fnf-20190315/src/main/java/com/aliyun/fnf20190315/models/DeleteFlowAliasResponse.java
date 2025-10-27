// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFlowAliasResponseBody body;

    public static DeleteFlowAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowAliasResponse self = new DeleteFlowAliasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowAliasResponse setBody(DeleteFlowAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowAliasResponseBody getBody() {
        return this.body;
    }

}
