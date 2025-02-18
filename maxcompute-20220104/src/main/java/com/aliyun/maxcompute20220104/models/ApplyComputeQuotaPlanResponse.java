// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ApplyComputeQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyComputeQuotaPlanResponseBody body;

    public static ApplyComputeQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyComputeQuotaPlanResponse self = new ApplyComputeQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public ApplyComputeQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyComputeQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyComputeQuotaPlanResponse setBody(ApplyComputeQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyComputeQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
