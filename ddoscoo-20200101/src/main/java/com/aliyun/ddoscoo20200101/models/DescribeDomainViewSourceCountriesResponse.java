// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewSourceCountriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainViewSourceCountriesResponseBody body;

    public static DescribeDomainViewSourceCountriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewSourceCountriesResponse self = new DescribeDomainViewSourceCountriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewSourceCountriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainViewSourceCountriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainViewSourceCountriesResponse setBody(DescribeDomainViewSourceCountriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainViewSourceCountriesResponseBody getBody() {
        return this.body;
    }

}
