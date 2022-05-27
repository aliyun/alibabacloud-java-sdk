// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainHttpCodeDataByLayerResponseBody body;

    public static DescribeDomainHttpCodeDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataByLayerResponse self = new DescribeDomainHttpCodeDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainHttpCodeDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainHttpCodeDataByLayerResponse setBody(DescribeDomainHttpCodeDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainHttpCodeDataByLayerResponseBody getBody() {
        return this.body;
    }

}
