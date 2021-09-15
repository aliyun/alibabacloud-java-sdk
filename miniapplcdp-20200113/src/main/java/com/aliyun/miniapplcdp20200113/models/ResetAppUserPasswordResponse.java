// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ResetAppUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetAppUserPasswordResponseBody body;

    public static ResetAppUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppUserPasswordResponse self = new ResetAppUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppUserPasswordResponse setBody(ResetAppUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppUserPasswordResponseBody getBody() {
        return this.body;
    }

}
