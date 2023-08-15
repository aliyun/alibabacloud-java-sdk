// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreSchemaDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreSchemaDetailsResponseBody body;

    public static DescribeRestoreSchemaDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreSchemaDetailsResponse self = new DescribeRestoreSchemaDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreSchemaDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreSchemaDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreSchemaDetailsResponse setBody(DescribeRestoreSchemaDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreSchemaDetailsResponseBody getBody() {
        return this.body;
    }

}
