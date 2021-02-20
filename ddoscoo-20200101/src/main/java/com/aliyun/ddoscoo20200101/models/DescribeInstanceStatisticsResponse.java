// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceStatisticsResponseBody body;

    public static DescribeInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsResponse self = new DescribeInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStatisticsResponse setBody(DescribeInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
