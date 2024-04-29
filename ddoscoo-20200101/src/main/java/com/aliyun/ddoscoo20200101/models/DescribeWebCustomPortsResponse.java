// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCustomPortsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebCustomPortsResponseBody body;

    public static DescribeWebCustomPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCustomPortsResponse self = new DescribeWebCustomPortsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCustomPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCustomPortsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebCustomPortsResponse setBody(DescribeWebCustomPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCustomPortsResponseBody getBody() {
        return this.body;
    }

}
