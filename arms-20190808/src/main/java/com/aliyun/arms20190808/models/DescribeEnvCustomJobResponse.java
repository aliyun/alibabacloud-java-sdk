// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvCustomJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnvCustomJobResponseBody body;

    public static DescribeEnvCustomJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvCustomJobResponse self = new DescribeEnvCustomJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvCustomJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvCustomJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnvCustomJobResponse setBody(DescribeEnvCustomJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvCustomJobResponseBody getBody() {
        return this.body;
    }

}
