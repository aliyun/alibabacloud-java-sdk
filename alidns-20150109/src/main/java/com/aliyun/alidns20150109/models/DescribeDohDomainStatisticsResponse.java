// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohDomainStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDohDomainStatisticsResponse setBody(DescribeDohDomainStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohDomainStatisticsResponseBody getBody() {
        return this.body;
    }

}
