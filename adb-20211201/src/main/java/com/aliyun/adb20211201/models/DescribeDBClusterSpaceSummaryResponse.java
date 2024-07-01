// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSpaceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterSpaceSummaryResponseBody body;

    public static DescribeDBClusterSpaceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSpaceSummaryResponse self = new DescribeDBClusterSpaceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterSpaceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterSpaceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterSpaceSummaryResponse setBody(DescribeDBClusterSpaceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterSpaceSummaryResponseBody getBody() {
        return this.body;
    }

}
