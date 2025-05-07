// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class GetSecurityEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityEventDetailResponseBody body;

    public static GetSecurityEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityEventDetailResponse self = new GetSecurityEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityEventDetailResponse setBody(GetSecurityEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityEventDetailResponseBody getBody() {
        return this.body;
    }

}
