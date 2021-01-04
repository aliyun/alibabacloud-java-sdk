// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class GetExecutionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExecutionHistoryResponseBody body;

    public static GetExecutionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionHistoryResponse self = new GetExecutionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetExecutionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecutionHistoryResponse setBody(GetExecutionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecutionHistoryResponseBody getBody() {
        return this.body;
    }

}
