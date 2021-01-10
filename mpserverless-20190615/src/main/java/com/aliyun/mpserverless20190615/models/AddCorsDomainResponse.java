// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddCorsDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCorsDomainResponseBody body;

    public static AddCorsDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCorsDomainResponse self = new AddCorsDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddCorsDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCorsDomainResponse setBody(AddCorsDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCorsDomainResponseBody getBody() {
        return this.body;
    }

}
