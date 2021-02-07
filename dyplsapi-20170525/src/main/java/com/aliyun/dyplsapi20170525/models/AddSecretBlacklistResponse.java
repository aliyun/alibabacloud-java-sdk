// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSecretBlacklistResponseBody body;

    public static AddSecretBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSecretBlacklistResponse self = new AddSecretBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public AddSecretBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSecretBlacklistResponse setBody(AddSecretBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSecretBlacklistResponseBody getBody() {
        return this.body;
    }

}
