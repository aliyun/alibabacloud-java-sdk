// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainBpsDataByLayerResponseBody body;

    public static DescribeDcdnDomainBpsDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainBpsDataByLayerResponse self = new DescribeDcdnDomainBpsDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainBpsDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainBpsDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainBpsDataByLayerResponse setBody(DescribeDcdnDomainBpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
