// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordResolveStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordResolveStatisticsSummaryResponseBody body;

    public static DescribeRecordResolveStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordResolveStatisticsSummaryResponse self = new DescribeRecordResolveStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordResolveStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordResolveStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordResolveStatisticsSummaryResponse setBody(DescribeRecordResolveStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordResolveStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
