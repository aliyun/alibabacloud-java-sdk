// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody body;

    public static DescribeDnsGtmAccessStrategyAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyAvailableConfigResponse self = new DescribeDnsGtmAccessStrategyAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setBody(DescribeDnsGtmAccessStrategyAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
