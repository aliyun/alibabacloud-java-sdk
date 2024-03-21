// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainWebsocketBpsDataResponseBody body;

    public static DescribeDcdnDomainWebsocketBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketBpsDataResponse self = new DescribeDcdnDomainWebsocketBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponse setBody(DescribeDcdnDomainWebsocketBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainWebsocketBpsDataResponseBody getBody() {
        return this.body;
    }

}
