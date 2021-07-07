// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloseSipAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseSipAccountResponseBody body;

    public static CloseSipAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseSipAccountResponse self = new CloseSipAccountResponse();
        return TeaModel.build(map, self);
    }

    public CloseSipAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseSipAccountResponse setBody(CloseSipAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseSipAccountResponseBody getBody() {
        return this.body;
    }

}
