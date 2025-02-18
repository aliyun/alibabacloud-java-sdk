// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeQuotaPlanResponseBody body;

    public static UpdateComputeQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeQuotaPlanResponse self = new UpdateComputeQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeQuotaPlanResponse setBody(UpdateComputeQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
