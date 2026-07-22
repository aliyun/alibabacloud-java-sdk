// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTaskDispatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskDispatchStatusResponseBody body;

    public static DescribeTaskDispatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskDispatchStatusResponse self = new DescribeTaskDispatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskDispatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskDispatchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskDispatchStatusResponse setBody(DescribeTaskDispatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskDispatchStatusResponseBody getBody() {
        return this.body;
    }

}
