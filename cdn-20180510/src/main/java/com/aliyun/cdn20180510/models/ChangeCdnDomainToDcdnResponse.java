// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ChangeCdnDomainToDcdnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeCdnDomainToDcdnResponseBody body;

    public static ChangeCdnDomainToDcdnResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeCdnDomainToDcdnResponse self = new ChangeCdnDomainToDcdnResponse();
        return TeaModel.build(map, self);
    }

    public ChangeCdnDomainToDcdnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeCdnDomainToDcdnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeCdnDomainToDcdnResponse setBody(ChangeCdnDomainToDcdnResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeCdnDomainToDcdnResponseBody getBody() {
        return this.body;
    }

}
