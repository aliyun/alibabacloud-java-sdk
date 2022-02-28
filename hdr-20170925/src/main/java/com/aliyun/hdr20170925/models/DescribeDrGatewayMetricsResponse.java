// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrGatewayMetricsResponseBody body;

    public static DescribeDrGatewayMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayMetricsResponse self = new DescribeDrGatewayMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrGatewayMetricsResponse setBody(DescribeDrGatewayMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrGatewayMetricsResponseBody getBody() {
        return this.body;
    }

}
