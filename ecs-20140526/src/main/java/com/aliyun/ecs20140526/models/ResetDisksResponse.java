// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDisksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetDisksResponseBody body;

    public static ResetDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDisksResponse self = new ResetDisksResponse();
        return TeaModel.build(map, self);
    }

    public ResetDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDisksResponse setBody(ResetDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDisksResponseBody getBody() {
        return this.body;
    }

}
