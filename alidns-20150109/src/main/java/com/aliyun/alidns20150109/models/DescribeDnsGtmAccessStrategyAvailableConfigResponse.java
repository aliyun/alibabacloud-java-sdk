// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setBody(DescribeDnsGtmAccessStrategyAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
