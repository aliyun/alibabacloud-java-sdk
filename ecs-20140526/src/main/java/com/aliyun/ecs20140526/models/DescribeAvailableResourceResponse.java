// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableResourceResponseBody body;

    public static DescribeAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponse self = new DescribeAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableResourceResponse setBody(DescribeAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
