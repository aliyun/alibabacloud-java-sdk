// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeConfigurationResponse setBody(DescribeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigurationResponseBody getBody() {
        return this.body;
    }

}
