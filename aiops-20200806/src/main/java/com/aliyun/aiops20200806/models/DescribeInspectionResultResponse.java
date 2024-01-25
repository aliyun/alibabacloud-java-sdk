// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionResultResponseBody body;

    public static DescribeInspectionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionResultResponse self = new DescribeInspectionResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionResultResponse setBody(DescribeInspectionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionResultResponseBody getBody() {
        return this.body;
    }

}
