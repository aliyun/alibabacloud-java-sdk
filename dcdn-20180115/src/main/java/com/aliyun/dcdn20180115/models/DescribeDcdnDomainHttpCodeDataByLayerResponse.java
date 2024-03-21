// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHttpCodeDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnDomainHttpCodeDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainHttpCodeDataByLayerResponse setBody(DescribeDcdnDomainHttpCodeDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainHttpCodeDataByLayerResponseBody getBody() {
        return this.body;
    }

}
