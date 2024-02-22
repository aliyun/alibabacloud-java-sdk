// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDocResponseBody body;

    public static DescribeDocResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocResponse self = new DescribeDocResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDocResponse setBody(DescribeDocResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDocResponseBody getBody() {
        return this.body;
    }

}
