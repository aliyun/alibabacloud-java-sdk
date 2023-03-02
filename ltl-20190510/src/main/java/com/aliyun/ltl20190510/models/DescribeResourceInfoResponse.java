// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceInfoResponseBody body;

    public static DescribeResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceInfoResponse self = new DescribeResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceInfoResponse setBody(DescribeResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceInfoResponseBody getBody() {
        return this.body;
    }

}
