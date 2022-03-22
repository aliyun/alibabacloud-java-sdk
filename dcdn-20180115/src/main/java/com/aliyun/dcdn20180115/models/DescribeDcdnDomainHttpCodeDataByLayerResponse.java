// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHttpCodeDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainHttpCodeDataByLayerResponseBody body;

    public static DescribeDcdnDomainHttpCodeDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHttpCodeDataByLayerResponse self = new DescribeDcdnDomainHttpCodeDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHttpCodeDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainHttpCodeDataByLayerResponse setBody(DescribeDcdnDomainHttpCodeDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainHttpCodeDataByLayerResponseBody getBody() {
        return this.body;
    }

}
