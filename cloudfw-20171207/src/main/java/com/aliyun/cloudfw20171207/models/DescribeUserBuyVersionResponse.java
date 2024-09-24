// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserBuyVersionResponseBody body;

    public static DescribeUserBuyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyVersionResponse self = new DescribeUserBuyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBuyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserBuyVersionResponse setBody(DescribeUserBuyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBuyVersionResponseBody getBody() {
        return this.body;
    }

}
