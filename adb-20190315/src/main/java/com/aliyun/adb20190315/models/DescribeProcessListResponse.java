// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeProcessListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProcessListResponseBody body;

    public static DescribeProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListResponse self = new DescribeProcessListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessListResponse setBody(DescribeProcessListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessListResponseBody getBody() {
        return this.body;
    }

}
