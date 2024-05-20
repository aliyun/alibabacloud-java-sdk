// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeManualTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeManualTaskResponseBody body;

    public static DescribeManualTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeManualTaskResponse self = new DescribeManualTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeManualTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeManualTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeManualTaskResponse setBody(DescribeManualTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeManualTaskResponseBody getBody() {
        return this.body;
    }

}
