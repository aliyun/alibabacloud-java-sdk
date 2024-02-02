// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CommitContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommitContactFlowResponseBody body;

    public static CommitContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowResponse self = new CommitContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitContactFlowResponse setBody(CommitContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitContactFlowResponseBody getBody() {
        return this.body;
    }

}
