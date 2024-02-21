// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainQpsDataByLayerResponseBody body;

    public static DescribeDomainQpsDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataByLayerResponse self = new DescribeDomainQpsDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainQpsDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainQpsDataByLayerResponse setBody(DescribeDomainQpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainQpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
