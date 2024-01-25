// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetUserLoginInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserLoginInfoResponseBody body;

    public static GetUserLoginInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserLoginInfoResponse self = new GetUserLoginInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserLoginInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserLoginInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserLoginInfoResponse setBody(GetUserLoginInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserLoginInfoResponseBody getBody() {
        return this.body;
    }

}
