// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class VoipAddAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VoipAddAccountResponseBody body;

    public static VoipAddAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        VoipAddAccountResponse self = new VoipAddAccountResponse();
        return TeaModel.build(map, self);
    }

    public VoipAddAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoipAddAccountResponse setBody(VoipAddAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public VoipAddAccountResponseBody getBody() {
        return this.body;
    }

}
