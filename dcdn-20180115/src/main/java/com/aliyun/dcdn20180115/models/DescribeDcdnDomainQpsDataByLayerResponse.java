// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainQpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainQpsDataByLayerResponseBody body;

    public static DescribeDcdnDomainQpsDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainQpsDataByLayerResponse self = new DescribeDcdnDomainQpsDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainQpsDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainQpsDataByLayerResponse setBody(DescribeDcdnDomainQpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainQpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
