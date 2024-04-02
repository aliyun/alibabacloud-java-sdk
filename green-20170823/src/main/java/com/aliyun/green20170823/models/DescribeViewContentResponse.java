// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeViewContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeViewContentResponseBody body;

    public static DescribeViewContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeViewContentResponse self = new DescribeViewContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeViewContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeViewContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeViewContentResponse setBody(DescribeViewContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeViewContentResponseBody getBody() {
        return this.body;
    }

}
