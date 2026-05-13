// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVscsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVscsResponseBody body;

    public static DescribeVscsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscsResponse self = new DescribeVscsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVscsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVscsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVscsResponse setBody(DescribeVscsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVscsResponseBody getBody() {
        return this.body;
    }

}
