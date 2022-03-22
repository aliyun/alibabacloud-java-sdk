// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainBpsDataByLayerResponse setBody(DescribeDcdnDomainBpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
