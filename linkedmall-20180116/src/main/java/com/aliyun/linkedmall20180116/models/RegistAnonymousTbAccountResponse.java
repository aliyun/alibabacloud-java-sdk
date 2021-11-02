// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegistAnonymousTbAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegistAnonymousTbAccountResponseBody body;

    public static RegistAnonymousTbAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RegistAnonymousTbAccountResponse self = new RegistAnonymousTbAccountResponse();
        return TeaModel.build(map, self);
    }

    public RegistAnonymousTbAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegistAnonymousTbAccountResponse setBody(RegistAnonymousTbAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RegistAnonymousTbAccountResponseBody getBody() {
        return this.body;
    }

}
