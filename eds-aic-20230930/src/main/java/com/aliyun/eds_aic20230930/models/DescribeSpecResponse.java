// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSpecResponseBody body;

    public static DescribeSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecResponse self = new DescribeSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpecResponse setBody(DescribeSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpecResponseBody getBody() {
        return this.body;
    }

}
