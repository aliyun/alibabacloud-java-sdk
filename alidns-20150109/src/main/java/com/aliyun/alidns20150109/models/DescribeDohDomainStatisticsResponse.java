// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohDomainStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDohDomainStatisticsResponseBody body;

    public static DescribeDohDomainStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohDomainStatisticsResponse self = new DescribeDohDomainStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohDomainStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohDomainStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDohDomainStatisticsResponse setBody(DescribeDohDomainStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohDomainStatisticsResponseBody getBody() {
        return this.body;
    }

}
