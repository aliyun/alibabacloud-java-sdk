// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetDefaultDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultDomainResponseBody body;

    public static SetDefaultDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultDomainResponse self = new SetDefaultDomainResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultDomainResponse setBody(SetDefaultDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultDomainResponseBody getBody() {
        return this.body;
    }

}
