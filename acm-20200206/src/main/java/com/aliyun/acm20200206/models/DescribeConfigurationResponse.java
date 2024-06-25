// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConfigurationResponseBody body;

    public static DescribeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationResponse self = new DescribeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfigurationResponse setBody(DescribeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigurationResponseBody getBody() {
        return this.body;
    }

}
