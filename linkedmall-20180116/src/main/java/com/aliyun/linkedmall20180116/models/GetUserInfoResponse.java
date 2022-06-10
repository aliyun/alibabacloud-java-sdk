// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
