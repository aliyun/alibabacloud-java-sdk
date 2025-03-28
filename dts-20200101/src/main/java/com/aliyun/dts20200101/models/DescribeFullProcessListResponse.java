// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeFullProcessListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFullProcessListResponseBody body;

    public static DescribeFullProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullProcessListResponse self = new DescribeFullProcessListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFullProcessListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFullProcessListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFullProcessListResponse setBody(DescribeFullProcessListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFullProcessListResponseBody getBody() {
        return this.body;
    }

}
