// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataCheckTableDetailsResponseBody body;

    public static DescribeDataCheckTableDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDetailsResponse self = new DescribeDataCheckTableDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCheckTableDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataCheckTableDetailsResponse setBody(DescribeDataCheckTableDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCheckTableDetailsResponseBody getBody() {
        return this.body;
    }

}
