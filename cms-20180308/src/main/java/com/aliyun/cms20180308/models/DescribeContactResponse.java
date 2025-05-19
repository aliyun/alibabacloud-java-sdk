// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContactResponseBody body;

    public static DescribeContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactResponse self = new DescribeContactResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContactResponse setBody(DescribeContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactResponseBody getBody() {
        return this.body;
    }

}
