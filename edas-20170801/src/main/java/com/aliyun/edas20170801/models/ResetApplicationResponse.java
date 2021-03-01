// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ResetApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetApplicationResponseBody body;

    public static ResetApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetApplicationResponse self = new ResetApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ResetApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetApplicationResponse setBody(ResetApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetApplicationResponseBody getBody() {
        return this.body;
    }

}
