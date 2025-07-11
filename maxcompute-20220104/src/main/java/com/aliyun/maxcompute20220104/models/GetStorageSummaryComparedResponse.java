// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSummaryComparedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageSummaryComparedResponseBody body;

    public static GetStorageSummaryComparedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSummaryComparedResponse self = new GetStorageSummaryComparedResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageSummaryComparedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageSummaryComparedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageSummaryComparedResponse setBody(GetStorageSummaryComparedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageSummaryComparedResponseBody getBody() {
        return this.body;
    }

}
