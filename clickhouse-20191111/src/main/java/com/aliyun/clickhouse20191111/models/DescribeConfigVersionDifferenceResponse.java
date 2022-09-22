// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigVersionDifferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigVersionDifferenceResponseBody body;

    public static DescribeConfigVersionDifferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigVersionDifferenceResponse self = new DescribeConfigVersionDifferenceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigVersionDifferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigVersionDifferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfigVersionDifferenceResponse setBody(DescribeConfigVersionDifferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigVersionDifferenceResponseBody getBody() {
        return this.body;
    }

}
