// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationResourceSummaryResponseBody body;

    public static DescribeApplicationResourceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResourceSummaryResponse self = new DescribeApplicationResourceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResourceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationResourceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationResourceSummaryResponse setBody(DescribeApplicationResourceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationResourceSummaryResponseBody getBody() {
        return this.body;
    }

}
