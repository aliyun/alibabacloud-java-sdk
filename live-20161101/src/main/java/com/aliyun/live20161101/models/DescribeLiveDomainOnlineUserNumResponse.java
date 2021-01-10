// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainOnlineUserNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainOnlineUserNumResponseBody body;

    public static DescribeLiveDomainOnlineUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainOnlineUserNumResponse self = new DescribeLiveDomainOnlineUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainOnlineUserNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainOnlineUserNumResponse setBody(DescribeLiveDomainOnlineUserNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainOnlineUserNumResponseBody getBody() {
        return this.body;
    }

}
