// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountAuthorityResponseBody body;

    public static DescribeAccountAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAuthorityResponse self = new DescribeAccountAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountAuthorityResponse setBody(DescribeAccountAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountAuthorityResponseBody getBody() {
        return this.body;
    }

}
