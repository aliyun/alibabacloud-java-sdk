// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeTaskInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTaskInstanceStatisticsResponseBody body;

    public static DescribeTaskInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInstanceStatisticsResponse self = new DescribeTaskInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskInstanceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskInstanceStatisticsResponse setBody(DescribeTaskInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
