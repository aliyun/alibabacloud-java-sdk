// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourcePackInstancesResponseBody body;

    public static DescribeResourcePackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackInstancesResponse self = new DescribeResourcePackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePackInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcePackInstancesResponse setBody(DescribeResourcePackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePackInstancesResponseBody getBody() {
        return this.body;
    }

}
