// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewSourceProvincesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainViewSourceProvincesResponseBody body;

    public static DescribeDomainViewSourceProvincesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewSourceProvincesResponse self = new DescribeDomainViewSourceProvincesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewSourceProvincesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainViewSourceProvincesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainViewSourceProvincesResponse setBody(DescribeDomainViewSourceProvincesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainViewSourceProvincesResponseBody getBody() {
        return this.body;
    }

}
