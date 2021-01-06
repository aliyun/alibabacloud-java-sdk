// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TranslateMedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TranslateMedResponseBody body;

    public static TranslateMedResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateMedResponse self = new TranslateMedResponse();
        return TeaModel.build(map, self);
    }

    public TranslateMedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateMedResponse setBody(TranslateMedResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateMedResponseBody getBody() {
        return this.body;
    }

}
