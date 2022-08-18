// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomLineResponseBody body;

    public static DescribeCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineResponse self = new DescribeCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomLineResponse setBody(DescribeCustomLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomLineResponseBody getBody() {
        return this.body;
    }

}
