// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRecordStatisticsResponse setBody(DescribeRecordStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordStatisticsResponseBody getBody() {
        return this.body;
    }

}
