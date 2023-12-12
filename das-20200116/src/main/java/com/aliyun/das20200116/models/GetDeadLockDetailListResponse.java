// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeadLockDetailListResponseBody body;

    public static GetDeadLockDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockDetailListResponse self = new GetDeadLockDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetDeadLockDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeadLockDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeadLockDetailListResponse setBody(GetDeadLockDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeadLockDetailListResponseBody getBody() {
        return this.body;
    }

}
