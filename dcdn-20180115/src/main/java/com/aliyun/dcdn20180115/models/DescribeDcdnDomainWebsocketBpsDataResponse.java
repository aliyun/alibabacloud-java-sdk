// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainWebsocketBpsDataResponse setBody(DescribeDcdnDomainWebsocketBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainWebsocketBpsDataResponseBody getBody() {
        return this.body;
    }

}
