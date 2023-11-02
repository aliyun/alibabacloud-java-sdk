// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogFieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogFieldsResponseBody body;

    public static DescribeLogFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogFieldsResponse self = new DescribeLogFieldsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogFieldsResponse setBody(DescribeLogFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogFieldsResponseBody getBody() {
        return this.body;
    }

}
