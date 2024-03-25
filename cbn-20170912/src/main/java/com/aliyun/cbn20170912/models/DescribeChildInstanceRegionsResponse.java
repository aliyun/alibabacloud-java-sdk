// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeChildInstanceRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChildInstanceRegionsResponseBody body;

    public static DescribeChildInstanceRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChildInstanceRegionsResponse self = new DescribeChildInstanceRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChildInstanceRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChildInstanceRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChildInstanceRegionsResponse setBody(DescribeChildInstanceRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChildInstanceRegionsResponseBody getBody() {
        return this.body;
    }

}
