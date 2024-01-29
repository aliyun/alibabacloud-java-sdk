// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohAccountStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDohAccountStatisticsResponseBody body;

    public static DescribeDohAccountStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohAccountStatisticsResponse self = new DescribeDohAccountStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohAccountStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohAccountStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDohAccountStatisticsResponse setBody(DescribeDohAccountStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohAccountStatisticsResponseBody getBody() {
        return this.body;
    }

}
