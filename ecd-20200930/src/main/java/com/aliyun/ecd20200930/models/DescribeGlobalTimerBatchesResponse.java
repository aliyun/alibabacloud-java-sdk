// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerBatchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalTimerBatchesResponseBody body;

    public static DescribeGlobalTimerBatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalTimerBatchesResponse self = new DescribeGlobalTimerBatchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalTimerBatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalTimerBatchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalTimerBatchesResponse setBody(DescribeGlobalTimerBatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalTimerBatchesResponseBody getBody() {
        return this.body;
    }

}
