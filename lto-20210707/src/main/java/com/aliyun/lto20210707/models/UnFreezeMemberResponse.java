// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UnFreezeMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnFreezeMemberResponseBody body;

    public static UnFreezeMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UnFreezeMemberResponse self = new UnFreezeMemberResponse();
        return TeaModel.build(map, self);
    }

    public UnFreezeMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnFreezeMemberResponse setBody(UnFreezeMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UnFreezeMemberResponseBody getBody() {
        return this.body;
    }

}
