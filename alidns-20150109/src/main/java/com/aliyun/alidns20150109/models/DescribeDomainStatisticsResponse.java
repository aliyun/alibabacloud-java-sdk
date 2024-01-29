// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainStatisticsResponseBody body;

    public static DescribeDomainStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsResponse self = new DescribeDomainStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainStatisticsResponse setBody(DescribeDomainStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainStatisticsResponseBody getBody() {
        return this.body;
    }

}
