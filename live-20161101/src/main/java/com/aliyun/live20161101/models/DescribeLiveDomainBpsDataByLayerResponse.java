// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainBpsDataByLayerResponseBody body;

    public static DescribeLiveDomainBpsDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataByLayerResponse self = new DescribeLiveDomainBpsDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainBpsDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainBpsDataByLayerResponse setBody(DescribeLiveDomainBpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
