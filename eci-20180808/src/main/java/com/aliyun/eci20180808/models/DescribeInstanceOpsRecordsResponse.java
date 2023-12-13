// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeInstanceOpsRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceOpsRecordsResponseBody body;

    public static DescribeInstanceOpsRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceOpsRecordsResponse self = new DescribeInstanceOpsRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceOpsRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceOpsRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceOpsRecordsResponse setBody(DescribeInstanceOpsRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceOpsRecordsResponseBody getBody() {
        return this.body;
    }

}
