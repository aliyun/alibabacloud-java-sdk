// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmAccessStrategiesResponseBody body;

    public static DescribeDnsGtmAccessStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategiesResponse self = new DescribeDnsGtmAccessStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmAccessStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmAccessStrategiesResponse setBody(DescribeDnsGtmAccessStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAccessStrategiesResponseBody getBody() {
        return this.body;
    }

}
