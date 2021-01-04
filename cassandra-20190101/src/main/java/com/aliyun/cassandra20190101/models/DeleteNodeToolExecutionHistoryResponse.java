// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteNodeToolExecutionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNodeToolExecutionHistoryResponseBody body;

    public static DeleteNodeToolExecutionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeToolExecutionHistoryResponse self = new DeleteNodeToolExecutionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodeToolExecutionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodeToolExecutionHistoryResponse setBody(DeleteNodeToolExecutionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodeToolExecutionHistoryResponseBody getBody() {
        return this.body;
    }

}
