// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmAccessStrategyResponseBody body;

    public static DescribeDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyResponse self = new DescribeDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmAccessStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmAccessStrategyResponse setBody(DescribeDnsGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
