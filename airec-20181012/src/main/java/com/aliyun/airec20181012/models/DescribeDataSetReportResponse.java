// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeDataSetReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataSetReportResponseBody body;

    public static DescribeDataSetReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSetReportResponse self = new DescribeDataSetReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSetReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSetReportResponse setBody(DescribeDataSetReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSetReportResponseBody getBody() {
        return this.body;
    }

}
