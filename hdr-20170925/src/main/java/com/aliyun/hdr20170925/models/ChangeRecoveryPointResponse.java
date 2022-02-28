// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ChangeRecoveryPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeRecoveryPointResponseBody body;

    public static ChangeRecoveryPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeRecoveryPointResponse self = new ChangeRecoveryPointResponse();
        return TeaModel.build(map, self);
    }

    public ChangeRecoveryPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeRecoveryPointResponse setBody(ChangeRecoveryPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeRecoveryPointResponseBody getBody() {
        return this.body;
    }

}
