// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteSecurityStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityStrategyResponseBody body;

    public static DeleteSecurityStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityStrategyResponse self = new DeleteSecurityStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityStrategyResponse setBody(DeleteSecurityStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityStrategyResponseBody getBody() {
        return this.body;
    }

}
