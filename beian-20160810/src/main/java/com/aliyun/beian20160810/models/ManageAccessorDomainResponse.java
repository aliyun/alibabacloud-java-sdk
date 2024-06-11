// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ManageAccessorDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageAccessorDomainResponseBody body;

    public static ManageAccessorDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageAccessorDomainResponse self = new ManageAccessorDomainResponse();
        return TeaModel.build(map, self);
    }

    public ManageAccessorDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageAccessorDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageAccessorDomainResponse setBody(ManageAccessorDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageAccessorDomainResponseBody getBody() {
        return this.body;
    }

}
