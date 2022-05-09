// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSynchronousJobListResponseBody body;

    public static DescribeSynchronousJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobListResponse self = new DescribeSynchronousJobListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronousJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronousJobListResponse setBody(DescribeSynchronousJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronousJobListResponseBody getBody() {
        return this.body;
    }

}
