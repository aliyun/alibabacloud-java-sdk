// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteControlStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteControlStrategyResponseBody body;

    public static DeleteControlStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlStrategyResponse self = new DeleteControlStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteControlStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteControlStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteControlStrategyResponse setBody(DeleteControlStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteControlStrategyResponseBody getBody() {
        return this.body;
    }

}
