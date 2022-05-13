// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyTagPoliciesResponseBody body;

    public static ApplyTagPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTagPoliciesResponse self = new ApplyTagPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTagPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyTagPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyTagPoliciesResponse setBody(ApplyTagPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyTagPoliciesResponseBody getBody() {
        return this.body;
    }

}
