// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeProductCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductCodeResponseBody body;

    public static DescribeProductCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductCodeResponse self = new DescribeProductCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductCodeResponse setBody(DescribeProductCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductCodeResponseBody getBody() {
        return this.body;
    }

}
