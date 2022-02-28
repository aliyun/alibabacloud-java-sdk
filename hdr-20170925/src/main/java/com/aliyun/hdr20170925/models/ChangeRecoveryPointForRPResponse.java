// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ChangeRecoveryPointForRPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeRecoveryPointForRPResponseBody body;

    public static ChangeRecoveryPointForRPResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeRecoveryPointForRPResponse self = new ChangeRecoveryPointForRPResponse();
        return TeaModel.build(map, self);
    }

    public ChangeRecoveryPointForRPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeRecoveryPointForRPResponse setBody(ChangeRecoveryPointForRPResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeRecoveryPointForRPResponseBody getBody() {
        return this.body;
    }

}
