// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePackResponseBody body;

    public static DescribePackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackResponse self = new DescribePackResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePackResponse setBody(DescribePackResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackResponseBody getBody() {
        return this.body;
    }

}
