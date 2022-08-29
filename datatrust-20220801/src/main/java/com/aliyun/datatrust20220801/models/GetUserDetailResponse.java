// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetUserDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserDetailResponseBody body;

    public static GetUserDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailResponse self = new GetUserDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserDetailResponse setBody(GetUserDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDetailResponseBody getBody() {
        return this.body;
    }

}
