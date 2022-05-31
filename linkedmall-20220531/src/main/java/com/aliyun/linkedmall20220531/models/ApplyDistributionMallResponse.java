// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyDistributionMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyDistributionMallResponseBody body;

    public static ApplyDistributionMallResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributionMallResponse self = new ApplyDistributionMallResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDistributionMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDistributionMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDistributionMallResponse setBody(ApplyDistributionMallResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDistributionMallResponseBody getBody() {
        return this.body;
    }

}
