// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateDnsCacheDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDnsCacheDomainResponse setBody(UpdateDnsCacheDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsCacheDomainResponseBody getBody() {
        return this.body;
    }

}
