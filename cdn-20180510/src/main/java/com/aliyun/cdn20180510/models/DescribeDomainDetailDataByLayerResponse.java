// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainDetailDataByLayerResponseBody body;

    public static DescribeDomainDetailDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailDataByLayerResponse self = new DescribeDomainDetailDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainDetailDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainDetailDataByLayerResponse setBody(DescribeDomainDetailDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainDetailDataByLayerResponseBody getBody() {
        return this.body;
    }

}
