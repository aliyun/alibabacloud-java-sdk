// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeTraceByConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeTraceByConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTraceByConfigurationResponse setBody(DescribeTraceByConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceByConfigurationResponseBody getBody() {
        return this.body;
    }

}
