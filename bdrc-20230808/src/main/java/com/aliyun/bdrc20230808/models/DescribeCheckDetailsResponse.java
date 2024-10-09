// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeCheckDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckDetailsResponseBody body;

    public static DescribeCheckDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckDetailsResponse self = new DescribeCheckDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckDetailsResponse setBody(DescribeCheckDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckDetailsResponseBody getBody() {
        return this.body;
    }

}
