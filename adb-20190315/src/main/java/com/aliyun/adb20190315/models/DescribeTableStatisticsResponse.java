// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTableStatisticsResponseBody body;

    public static DescribeTableStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableStatisticsResponse self = new DescribeTableStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableStatisticsResponse setBody(DescribeTableStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableStatisticsResponseBody getBody() {
        return this.body;
    }

}
