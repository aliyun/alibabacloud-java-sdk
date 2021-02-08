// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDnsCacheDomainRemarkResponseBody body;

    public static UpdateDnsCacheDomainRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainRemarkResponse self = new UpdateDnsCacheDomainRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsCacheDomainRemarkResponse setBody(UpdateDnsCacheDomainRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsCacheDomainRemarkResponseBody getBody() {
        return this.body;
    }

}
