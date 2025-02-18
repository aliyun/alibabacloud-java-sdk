// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeSubQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeSubQuotaResponseBody body;

    public static UpdateComputeSubQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeSubQuotaResponse self = new UpdateComputeSubQuotaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeSubQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeSubQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeSubQuotaResponse setBody(UpdateComputeSubQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeSubQuotaResponseBody getBody() {
        return this.body;
    }

}
