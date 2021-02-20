// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceCountriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePortViewSourceCountriesResponse setBody(DescribePortViewSourceCountriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortViewSourceCountriesResponseBody getBody() {
        return this.body;
    }

}
