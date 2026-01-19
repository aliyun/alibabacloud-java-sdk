// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteResourceServerScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceServerScopeResponseBody body;

    public static DeleteResourceServerScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceServerScopeResponse self = new DeleteResourceServerScopeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceServerScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceServerScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceServerScopeResponse setBody(DeleteResourceServerScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceServerScopeResponseBody getBody() {
        return this.body;
    }

}
