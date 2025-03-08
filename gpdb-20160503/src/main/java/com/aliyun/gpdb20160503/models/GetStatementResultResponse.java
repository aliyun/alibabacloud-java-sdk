// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetStatementResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStatementResultResponseBody body;

    public static GetStatementResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatementResultResponse self = new GetStatementResultResponse();
        return TeaModel.build(map, self);
    }

    public GetStatementResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStatementResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStatementResultResponse setBody(GetStatementResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStatementResultResponseBody getBody() {
        return this.body;
    }

}
