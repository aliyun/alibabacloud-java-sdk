// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class SetDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDomainResponseBody body;

    public static SetDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainResponse self = new SetDomainResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainResponse setBody(SetDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainResponseBody getBody() {
        return this.body;
    }

}
