// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogDispatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebAccessLogDispatchStatusResponseBody body;

    public static DescribeWebAccessLogDispatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogDispatchStatusResponse self = new DescribeWebAccessLogDispatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogDispatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessLogDispatchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebAccessLogDispatchStatusResponse setBody(DescribeWebAccessLogDispatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessLogDispatchStatusResponseBody getBody() {
        return this.body;
    }

}
