// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreFullDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRestoreFullDetailsResponseBody body;

    public static DescribeRestoreFullDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreFullDetailsResponse self = new DescribeRestoreFullDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreFullDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreFullDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreFullDetailsResponse setBody(DescribeRestoreFullDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreFullDetailsResponseBody getBody() {
        return this.body;
    }

}
