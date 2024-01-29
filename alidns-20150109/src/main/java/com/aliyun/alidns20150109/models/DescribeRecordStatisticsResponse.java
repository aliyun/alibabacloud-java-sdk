// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordStatisticsResponseBody body;

    public static DescribeRecordStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsResponse self = new DescribeRecordStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordStatisticsResponse setBody(DescribeRecordStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordStatisticsResponseBody getBody() {
        return this.body;
    }

}
