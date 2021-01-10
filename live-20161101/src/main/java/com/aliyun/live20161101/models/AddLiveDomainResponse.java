// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveDomainResponseBody body;

    public static AddLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainResponse self = new AddLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveDomainResponse setBody(AddLiveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveDomainResponseBody getBody() {
        return this.body;
    }

}
