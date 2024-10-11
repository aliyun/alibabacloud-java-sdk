// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeLatestTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLatestTaskResponseBody body;

    public static DescribeLatestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestTaskResponse self = new DescribeLatestTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatestTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatestTaskResponse setBody(DescribeLatestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatestTaskResponseBody getBody() {
        return this.body;
    }

}
