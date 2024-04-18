// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRestoreSummaryResponseBody body;

    public static DescribeRestoreSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreSummaryResponse self = new DescribeRestoreSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreSummaryResponse setBody(DescribeRestoreSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreSummaryResponseBody getBody() {
        return this.body;
    }

}
