// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIndexResponseBody body;

    public static DescribeIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndexResponse self = new DescribeIndexResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIndexResponse setBody(DescribeIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIndexResponseBody getBody() {
        return this.body;
    }

}
