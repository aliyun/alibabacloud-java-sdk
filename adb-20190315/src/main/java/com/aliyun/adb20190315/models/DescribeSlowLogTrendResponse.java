// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowLogTrendResponseBody body;

    public static DescribeSlowLogTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendResponse self = new DescribeSlowLogTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowLogTrendResponse setBody(DescribeSlowLogTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogTrendResponseBody getBody() {
        return this.body;
    }

}
