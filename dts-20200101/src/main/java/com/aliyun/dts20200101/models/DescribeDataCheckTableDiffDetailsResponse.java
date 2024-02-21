// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDiffDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataCheckTableDiffDetailsResponseBody body;

    public static DescribeDataCheckTableDiffDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDiffDetailsResponse self = new DescribeDataCheckTableDiffDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDiffDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCheckTableDiffDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataCheckTableDiffDetailsResponse setBody(DescribeDataCheckTableDiffDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCheckTableDiffDetailsResponseBody getBody() {
        return this.body;
    }

}
