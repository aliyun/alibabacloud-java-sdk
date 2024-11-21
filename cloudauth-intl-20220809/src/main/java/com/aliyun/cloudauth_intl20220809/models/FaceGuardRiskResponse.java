// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceGuardRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceGuardRiskResponseBody body;

    public static FaceGuardRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceGuardRiskResponse self = new FaceGuardRiskResponse();
        return TeaModel.build(map, self);
    }

    public FaceGuardRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceGuardRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceGuardRiskResponse setBody(FaceGuardRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceGuardRiskResponseBody getBody() {
        return this.body;
    }

}
