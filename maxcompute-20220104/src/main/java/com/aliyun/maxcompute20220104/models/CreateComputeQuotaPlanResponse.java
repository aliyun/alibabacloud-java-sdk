// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateComputeQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeQuotaPlanResponseBody body;

    public static CreateComputeQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeQuotaPlanResponse self = new CreateComputeQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeQuotaPlanResponse setBody(CreateComputeQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
