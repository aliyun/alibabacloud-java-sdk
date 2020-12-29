// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRecordStatisticsSummaryResponse setBody(DescribeRecordStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
