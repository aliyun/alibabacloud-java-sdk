// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterHealthReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterHealthReportResponseBody body;

    public static DescribeDBClusterHealthReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterHealthReportResponse self = new DescribeDBClusterHealthReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterHealthReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterHealthReportResponse setBody(DescribeDBClusterHealthReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterHealthReportResponseBody getBody() {
        return this.body;
    }

}
