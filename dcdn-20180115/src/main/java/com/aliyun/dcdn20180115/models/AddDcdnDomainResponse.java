// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class AddDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDcdnDomainResponseBody body;

    public static AddDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDcdnDomainResponse self = new AddDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDcdnDomainResponse setBody(AddDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
