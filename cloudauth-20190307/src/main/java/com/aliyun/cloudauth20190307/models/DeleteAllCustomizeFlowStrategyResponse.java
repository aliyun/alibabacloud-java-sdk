// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteAllCustomizeFlowStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAllCustomizeFlowStrategyResponseBody body;

    public static DeleteAllCustomizeFlowStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllCustomizeFlowStrategyResponse self = new DeleteAllCustomizeFlowStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAllCustomizeFlowStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAllCustomizeFlowStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAllCustomizeFlowStrategyResponse setBody(DeleteAllCustomizeFlowStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAllCustomizeFlowStrategyResponseBody getBody() {
        return this.body;
    }

}
