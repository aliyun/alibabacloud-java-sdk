// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordStatisticsSummaryResponseBody body;

    public static DescribeRecordStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsSummaryResponse self = new DescribeRecordStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordStatisticsSummaryResponse setBody(DescribeRecordStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
