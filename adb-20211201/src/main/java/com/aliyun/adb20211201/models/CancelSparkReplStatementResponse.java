// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSparkReplStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSparkReplStatementResponseBody body;

    public static CancelSparkReplStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkReplStatementResponse self = new CancelSparkReplStatementResponse();
        return TeaModel.build(map, self);
    }

    public CancelSparkReplStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSparkReplStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSparkReplStatementResponse setBody(CancelSparkReplStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSparkReplStatementResponseBody getBody() {
        return this.body;
    }

}
