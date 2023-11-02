// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogSourceResponseBody body;

    public static DescribeLogSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogSourceResponse self = new DescribeLogSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogSourceResponse setBody(DescribeLogSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogSourceResponseBody getBody() {
        return this.body;
    }

}
