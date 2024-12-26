// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogHistogramAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowLogHistogramAsyncResponseBody body;

    public static DescribeSlowLogHistogramAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogHistogramAsyncResponse self = new DescribeSlowLogHistogramAsyncResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogHistogramAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogHistogramAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowLogHistogramAsyncResponse setBody(DescribeSlowLogHistogramAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogHistogramAsyncResponseBody getBody() {
        return this.body;
    }

}
