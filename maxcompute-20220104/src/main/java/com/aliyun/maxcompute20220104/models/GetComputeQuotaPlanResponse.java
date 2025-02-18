// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeQuotaPlanResponseBody body;

    public static GetComputeQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeQuotaPlanResponse self = new GetComputeQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeQuotaPlanResponse setBody(GetComputeQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
