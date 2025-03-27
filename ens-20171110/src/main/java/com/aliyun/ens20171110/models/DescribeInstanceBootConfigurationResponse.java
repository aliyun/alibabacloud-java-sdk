// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceBootConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceBootConfigurationResponseBody body;

    public static DescribeInstanceBootConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBootConfigurationResponse self = new DescribeInstanceBootConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBootConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceBootConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceBootConfigurationResponse setBody(DescribeInstanceBootConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceBootConfigurationResponseBody getBody() {
        return this.body;
    }

}
