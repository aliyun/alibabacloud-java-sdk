// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CheckDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDomainResponseBody body;

    public static CheckDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponse self = new CheckDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDomainResponse setBody(CheckDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDomainResponseBody getBody() {
        return this.body;
    }

}
