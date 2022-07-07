// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ApplyDistributorMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyDistributorMallResponseBody body;

    public static ApplyDistributorMallResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorMallResponse self = new ApplyDistributorMallResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDistributorMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDistributorMallResponse setBody(ApplyDistributorMallResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDistributorMallResponseBody getBody() {
        return this.body;
    }

}
