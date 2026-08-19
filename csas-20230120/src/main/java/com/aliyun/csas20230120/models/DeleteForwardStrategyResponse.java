// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteForwardStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteForwardStrategyResponseBody body;

    public static DeleteForwardStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardStrategyResponse self = new DeleteForwardStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteForwardStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteForwardStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteForwardStrategyResponse setBody(DeleteForwardStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteForwardStrategyResponseBody getBody() {
        return this.body;
    }

}
