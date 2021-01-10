// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RefreshCdnDomainConfigsCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshCdnDomainConfigsCacheResponseBody body;

    public static RefreshCdnDomainConfigsCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshCdnDomainConfigsCacheResponse self = new RefreshCdnDomainConfigsCacheResponse();
        return TeaModel.build(map, self);
    }

    public RefreshCdnDomainConfigsCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshCdnDomainConfigsCacheResponse setBody(RefreshCdnDomainConfigsCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshCdnDomainConfigsCacheResponseBody getBody() {
        return this.body;
    }

}
