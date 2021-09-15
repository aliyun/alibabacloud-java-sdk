// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetAccountPasswordResponseBody body;

    public static ResetAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponse self = new ResetAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountPasswordResponse setBody(ResetAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
