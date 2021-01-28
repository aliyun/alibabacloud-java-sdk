// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainWebsocketTrafficDataResponseBody body;

    public static DescribeDcdnDomainWebsocketTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketTrafficDataResponse self = new DescribeDcdnDomainWebsocketTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponse setBody(DescribeDcdnDomainWebsocketTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainWebsocketTrafficDataResponseBody getBody() {
        return this.body;
    }

}
