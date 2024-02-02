// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEmptyNumberResponseBody body;

    public static DescribeEmptyNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmptyNumberResponse self = new DescribeEmptyNumberResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEmptyNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEmptyNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEmptyNumberResponse setBody(DescribeEmptyNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmptyNumberResponseBody getBody() {
        return this.body;
    }

}
