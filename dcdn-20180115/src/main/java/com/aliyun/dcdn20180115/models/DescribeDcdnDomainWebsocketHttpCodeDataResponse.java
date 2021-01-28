// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody body;

    public static DescribeDcdnDomainWebsocketHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketHttpCodeDataResponse self = new DescribeDcdnDomainWebsocketHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponse setBody(DescribeDcdnDomainWebsocketHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
