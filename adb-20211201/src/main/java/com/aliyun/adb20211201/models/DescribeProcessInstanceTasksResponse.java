// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProcessInstanceTasksResponseBody body;

    public static DescribeProcessInstanceTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceTasksResponse self = new DescribeProcessInstanceTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessInstanceTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessInstanceTasksResponse setBody(DescribeProcessInstanceTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessInstanceTasksResponseBody getBody() {
        return this.body;
    }

}
