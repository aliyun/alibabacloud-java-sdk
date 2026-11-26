// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityInfoResponseBody body;

    public static GetSecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityInfoResponse self = new GetSecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityInfoResponse setBody(GetSecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityInfoResponseBody getBody() {
        return this.body;
    }

}
