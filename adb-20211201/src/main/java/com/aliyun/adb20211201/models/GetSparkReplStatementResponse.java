// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkReplStatementResponseBody body;

    public static GetSparkReplStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkReplStatementResponse self = new GetSparkReplStatementResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkReplStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkReplStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkReplStatementResponse setBody(GetSparkReplStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkReplStatementResponseBody getBody() {
        return this.body;
    }

}
