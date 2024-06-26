// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrdererLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrdererLogsResponseBody body;

    public static DescribeOrdererLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrdererLogsResponse self = new DescribeOrdererLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrdererLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrdererLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrdererLogsResponse setBody(DescribeOrdererLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrdererLogsResponseBody getBody() {
        return this.body;
    }

}
