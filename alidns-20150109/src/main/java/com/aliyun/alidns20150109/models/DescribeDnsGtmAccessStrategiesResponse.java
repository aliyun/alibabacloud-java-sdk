// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDnsGtmAccessStrategiesResponse setBody(DescribeDnsGtmAccessStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAccessStrategiesResponseBody getBody() {
        return this.body;
    }

}
