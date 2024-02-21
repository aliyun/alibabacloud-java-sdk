// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainBpsDataByLayerResponseBody body;

    public static DescribeDomainBpsDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByLayerResponse self = new DescribeDomainBpsDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainBpsDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainBpsDataByLayerResponse setBody(DescribeDomainBpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
