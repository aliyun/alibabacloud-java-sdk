// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSystemPropertyTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemPropertyTemplatesResponseBody body;

    public static DescribeSystemPropertyTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemPropertyTemplatesResponse self = new DescribeSystemPropertyTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemPropertyTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemPropertyTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemPropertyTemplatesResponse setBody(DescribeSystemPropertyTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemPropertyTemplatesResponseBody getBody() {
        return this.body;
    }

}
