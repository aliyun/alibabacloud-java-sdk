// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocSummaryResponseBody body;

    public static RunDocSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocSummaryResponse self = new RunDocSummaryResponse();
        return TeaModel.build(map, self);
    }

    public RunDocSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocSummaryResponse setBody(RunDocSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocSummaryResponseBody getBody() {
        return this.body;
    }

}
