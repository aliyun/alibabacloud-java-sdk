// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionProgressResponseBody body;

    public static DescribeInspectionProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionProgressResponse self = new DescribeInspectionProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionProgressResponse setBody(DescribeInspectionProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionProgressResponseBody getBody() {
        return this.body;
    }

}
