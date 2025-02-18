// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeQuotaPlanResponseBody body;

    public static ListComputeQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeQuotaPlanResponse self = new ListComputeQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeQuotaPlanResponse setBody(ListComputeQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
