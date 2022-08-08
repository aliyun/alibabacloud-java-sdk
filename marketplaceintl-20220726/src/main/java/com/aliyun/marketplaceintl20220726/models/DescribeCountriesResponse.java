// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCountriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCountriesResponseBody body;

    public static DescribeCountriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountriesResponse self = new DescribeCountriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCountriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCountriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCountriesResponse setBody(DescribeCountriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCountriesResponseBody getBody() {
        return this.body;
    }

}
