// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeTraceByConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTraceByConfigurationResponseBody body;

    public static DescribeTraceByConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceByConfigurationResponse self = new DescribeTraceByConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceByConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceByConfigurationResponse setBody(DescribeTraceByConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceByConfigurationResponseBody getBody() {
        return this.body;
    }

}
