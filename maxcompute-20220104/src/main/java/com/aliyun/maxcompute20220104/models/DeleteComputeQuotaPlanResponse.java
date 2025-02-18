// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteComputeQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComputeQuotaPlanResponseBody body;

    public static DeleteComputeQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeQuotaPlanResponse self = new DeleteComputeQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComputeQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComputeQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComputeQuotaPlanResponse setBody(DeleteComputeQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComputeQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
