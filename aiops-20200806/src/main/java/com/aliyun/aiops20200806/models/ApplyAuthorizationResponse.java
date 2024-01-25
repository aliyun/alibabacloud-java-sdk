// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ApplyAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAuthorizationResponseBody body;

    public static ApplyAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAuthorizationResponse self = new ApplyAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAuthorizationResponse setBody(ApplyAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAuthorizationResponseBody getBody() {
        return this.body;
    }

}
