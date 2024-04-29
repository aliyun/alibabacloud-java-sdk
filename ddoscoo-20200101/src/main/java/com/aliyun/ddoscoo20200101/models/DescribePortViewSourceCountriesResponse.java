// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceCountriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortViewSourceCountriesResponseBody body;

    public static DescribePortViewSourceCountriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceCountriesResponse self = new DescribePortViewSourceCountriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceCountriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortViewSourceCountriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortViewSourceCountriesResponse setBody(DescribePortViewSourceCountriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortViewSourceCountriesResponseBody getBody() {
        return this.body;
    }

}
