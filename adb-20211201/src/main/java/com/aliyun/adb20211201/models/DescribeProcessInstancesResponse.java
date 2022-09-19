// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProcessInstancesResponseBody body;

    public static DescribeProcessInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstancesResponse self = new DescribeProcessInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessInstancesResponse setBody(DescribeProcessInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessInstancesResponseBody getBody() {
        return this.body;
    }

}
