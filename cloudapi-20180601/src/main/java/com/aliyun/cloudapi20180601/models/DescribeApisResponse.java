// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApisResponseBody body;

    public static DescribeApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisResponse self = new DescribeApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisResponse setBody(DescribeApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisResponseBody getBody() {
        return this.body;
    }

}
