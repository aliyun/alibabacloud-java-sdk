// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProcessInstanceStatisticsResponseBody body;

    public static DescribeProcessInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceStatisticsResponse self = new DescribeProcessInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessInstanceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessInstanceStatisticsResponse setBody(DescribeProcessInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
