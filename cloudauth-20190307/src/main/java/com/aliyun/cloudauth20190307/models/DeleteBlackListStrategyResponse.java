// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteBlackListStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBlackListStrategyResponseBody body;

    public static DeleteBlackListStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackListStrategyResponse self = new DeleteBlackListStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlackListStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBlackListStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBlackListStrategyResponse setBody(DeleteBlackListStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBlackListStrategyResponseBody getBody() {
        return this.body;
    }

}
