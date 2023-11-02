// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogTypeResponseBody body;

    public static DescribeLogTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogTypeResponse self = new DescribeLogTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogTypeResponse setBody(DescribeLogTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogTypeResponseBody getBody() {
        return this.body;
    }

}
