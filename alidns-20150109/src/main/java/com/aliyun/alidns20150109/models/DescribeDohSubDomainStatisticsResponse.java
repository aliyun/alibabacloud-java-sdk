// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDohSubDomainStatisticsResponseBody body;

    public static DescribeDohSubDomainStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohSubDomainStatisticsResponse self = new DescribeDohSubDomainStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohSubDomainStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohSubDomainStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDohSubDomainStatisticsResponse setBody(DescribeDohSubDomainStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohSubDomainStatisticsResponseBody getBody() {
        return this.body;
    }

}
