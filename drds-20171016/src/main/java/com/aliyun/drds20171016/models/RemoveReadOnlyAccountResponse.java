// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class RemoveReadOnlyAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveReadOnlyAccountResponseBody body;

    public static RemoveReadOnlyAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveReadOnlyAccountResponse self = new RemoveReadOnlyAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveReadOnlyAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveReadOnlyAccountResponse setBody(RemoveReadOnlyAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveReadOnlyAccountResponseBody getBody() {
        return this.body;
    }

}
