// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdatePasswordForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePasswordForAccountResponseBody body;

    public static UpdatePasswordForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePasswordForAccountResponse self = new UpdatePasswordForAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePasswordForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePasswordForAccountResponse setBody(UpdatePasswordForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePasswordForAccountResponseBody getBody() {
        return this.body;
    }

}
