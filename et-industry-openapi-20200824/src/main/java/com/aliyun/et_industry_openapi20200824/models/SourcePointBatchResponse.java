// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class SourcePointBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SourcePointBatchResponseBody body;

    public static SourcePointBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SourcePointBatchResponse self = new SourcePointBatchResponse();
        return TeaModel.build(map, self);
    }

    public SourcePointBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SourcePointBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SourcePointBatchResponse setBody(SourcePointBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SourcePointBatchResponseBody getBody() {
        return this.body;
    }

}
