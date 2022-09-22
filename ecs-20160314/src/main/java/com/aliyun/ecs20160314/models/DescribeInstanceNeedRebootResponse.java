// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceNeedRebootResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceNeedRebootResponseBody body;

    public static DescribeInstanceNeedRebootResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNeedRebootResponse self = new DescribeInstanceNeedRebootResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNeedRebootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceNeedRebootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceNeedRebootResponse setBody(DescribeInstanceNeedRebootResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceNeedRebootResponseBody getBody() {
        return this.body;
    }

}
