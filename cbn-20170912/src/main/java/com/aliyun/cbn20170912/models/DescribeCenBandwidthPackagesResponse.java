// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenBandwidthPackagesResponseBody body;

    public static DescribeCenBandwidthPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesResponse self = new DescribeCenBandwidthPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenBandwidthPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenBandwidthPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenBandwidthPackagesResponse setBody(DescribeCenBandwidthPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

}
