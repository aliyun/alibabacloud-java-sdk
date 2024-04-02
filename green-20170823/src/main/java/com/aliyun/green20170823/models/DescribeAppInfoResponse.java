// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppInfoResponseBody body;

    public static DescribeAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInfoResponse self = new DescribeAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppInfoResponse setBody(DescribeAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppInfoResponseBody getBody() {
        return this.body;
    }

}
