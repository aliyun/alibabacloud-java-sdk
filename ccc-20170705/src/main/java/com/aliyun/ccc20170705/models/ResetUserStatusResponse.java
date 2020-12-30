// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ResetUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetUserStatusResponseBody body;

    public static ResetUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetUserStatusResponse self = new ResetUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public ResetUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetUserStatusResponse setBody(ResetUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetUserStatusResponseBody getBody() {
        return this.body;
    }

}
