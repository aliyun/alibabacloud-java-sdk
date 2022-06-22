// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeRdsErrorLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsErrorLogsResponseBody body;

    public static DescribeRdsErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsErrorLogsResponse self = new DescribeRdsErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsErrorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsErrorLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsErrorLogsResponse setBody(DescribeRdsErrorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsErrorLogsResponseBody getBody() {
        return this.body;
    }

}
