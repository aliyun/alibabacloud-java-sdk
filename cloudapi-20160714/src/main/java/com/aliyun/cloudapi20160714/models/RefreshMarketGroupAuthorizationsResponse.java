// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RefreshMarketGroupAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshMarketGroupAuthorizationsResponseBody body;

    public static RefreshMarketGroupAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshMarketGroupAuthorizationsResponse self = new RefreshMarketGroupAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public RefreshMarketGroupAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshMarketGroupAuthorizationsResponse setBody(RefreshMarketGroupAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshMarketGroupAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
