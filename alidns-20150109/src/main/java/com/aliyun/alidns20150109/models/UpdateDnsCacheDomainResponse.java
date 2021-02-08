// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDnsCacheDomainResponseBody body;

    public static UpdateDnsCacheDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainResponse self = new UpdateDnsCacheDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsCacheDomainResponse setBody(UpdateDnsCacheDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsCacheDomainResponseBody getBody() {
        return this.body;
    }

}
