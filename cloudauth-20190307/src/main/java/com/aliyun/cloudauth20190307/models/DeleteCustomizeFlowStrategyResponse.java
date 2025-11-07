// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteCustomizeFlowStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomizeFlowStrategyResponseBody body;

    public static DeleteCustomizeFlowStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeFlowStrategyResponse self = new DeleteCustomizeFlowStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeFlowStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizeFlowStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomizeFlowStrategyResponse setBody(DeleteCustomizeFlowStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizeFlowStrategyResponseBody getBody() {
        return this.body;
    }

}
