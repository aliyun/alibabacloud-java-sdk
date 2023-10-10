// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKvUsageDataResponseBody body;

    public static DescribeKvUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvUsageDataResponse self = new DescribeKvUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKvUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKvUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKvUsageDataResponse setBody(DescribeKvUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKvUsageDataResponseBody getBody() {
        return this.body;
    }

}
