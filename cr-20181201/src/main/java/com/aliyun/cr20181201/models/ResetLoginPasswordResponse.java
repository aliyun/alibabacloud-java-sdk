// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ResetLoginPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetLoginPasswordResponseBody body;

    public static ResetLoginPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetLoginPasswordResponse self = new ResetLoginPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetLoginPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetLoginPasswordResponse setBody(ResetLoginPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetLoginPasswordResponseBody getBody() {
        return this.body;
    }

}
