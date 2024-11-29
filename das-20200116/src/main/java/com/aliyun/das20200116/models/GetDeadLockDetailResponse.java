// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeadLockDetailResponseBody body;

    public static GetDeadLockDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockDetailResponse self = new GetDeadLockDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDeadLockDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeadLockDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeadLockDetailResponse setBody(GetDeadLockDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeadLockDetailResponseBody getBody() {
        return this.body;
    }

}
