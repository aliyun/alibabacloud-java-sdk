// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeadLockHistoryResponseBody body;

    public static GetDeadLockHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockHistoryResponse self = new GetDeadLockHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetDeadLockHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeadLockHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeadLockHistoryResponse setBody(GetDeadLockHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeadLockHistoryResponseBody getBody() {
        return this.body;
    }

}
