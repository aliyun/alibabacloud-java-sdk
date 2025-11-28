// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribePackgeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePackgeInfoResponseBody body;

    public static DescribePackgeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackgeInfoResponse self = new DescribePackgeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackgeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackgeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePackgeInfoResponse setBody(DescribePackgeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackgeInfoResponseBody getBody() {
        return this.body;
    }

}
