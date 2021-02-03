// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainStatisticsResponse setBody(DescribeDomainStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainStatisticsResponseBody getBody() {
        return this.body;
    }

}
