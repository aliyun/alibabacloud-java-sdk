// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigurationRecorderResponseBody body;

    public static DescribeConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationRecorderResponse self = new DescribeConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigurationRecorderResponse setBody(DescribeConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
