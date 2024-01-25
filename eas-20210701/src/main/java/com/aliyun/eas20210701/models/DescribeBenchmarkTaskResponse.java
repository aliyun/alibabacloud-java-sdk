// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBenchmarkTaskResponseBody body;

    public static DescribeBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBenchmarkTaskResponse self = new DescribeBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBenchmarkTaskResponse setBody(DescribeBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
