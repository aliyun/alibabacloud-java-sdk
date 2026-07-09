// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeDeductLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeductLogsResponseBody body;

    public static DescribeDeductLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductLogsResponse self = new DescribeDeductLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeductLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeductLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeductLogsResponse setBody(DescribeDeductLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeductLogsResponseBody getBody() {
        return this.body;
    }

}
