// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserInfoResponseBody body;

    public static GetUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponse self = new GetUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserInfoResponse setBody(GetUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserInfoResponseBody getBody() {
        return this.body;
    }

}
