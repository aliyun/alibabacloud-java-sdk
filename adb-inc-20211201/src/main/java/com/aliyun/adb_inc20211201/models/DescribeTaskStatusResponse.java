// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskStatusResponseBody body;

    public static DescribeTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskStatusResponse self = new DescribeTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskStatusResponse setBody(DescribeTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskStatusResponseBody getBody() {
        return this.body;
    }

}
