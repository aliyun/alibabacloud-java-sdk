// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardLockReasonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardLockReasonResponseBody body;

    public static GetCardLockReasonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardLockReasonResponse self = new GetCardLockReasonResponse();
        return TeaModel.build(map, self);
    }

    public GetCardLockReasonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardLockReasonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardLockReasonResponse setBody(GetCardLockReasonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardLockReasonResponseBody getBody() {
        return this.body;
    }

}
