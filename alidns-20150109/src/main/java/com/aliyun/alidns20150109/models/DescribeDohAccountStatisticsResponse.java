// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohAccountStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDohAccountStatisticsResponse setBody(DescribeDohAccountStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohAccountStatisticsResponseBody getBody() {
        return this.body;
    }

}
