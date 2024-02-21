// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMySQLAllSessionAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMySQLAllSessionAsyncResponseBody body;

    public static GetMySQLAllSessionAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMySQLAllSessionAsyncResponse self = new GetMySQLAllSessionAsyncResponse();
        return TeaModel.build(map, self);
    }

    public GetMySQLAllSessionAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMySQLAllSessionAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMySQLAllSessionAsyncResponse setBody(GetMySQLAllSessionAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMySQLAllSessionAsyncResponseBody getBody() {
        return this.body;
    }

}
