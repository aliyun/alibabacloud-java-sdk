// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeniedMemberAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeniedMemberAccessResponseBody body;

    public static DeniedMemberAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeniedMemberAccessResponse self = new DeniedMemberAccessResponse();
        return TeaModel.build(map, self);
    }

    public DeniedMemberAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeniedMemberAccessResponse setBody(DeniedMemberAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeniedMemberAccessResponseBody getBody() {
        return this.body;
    }

}
