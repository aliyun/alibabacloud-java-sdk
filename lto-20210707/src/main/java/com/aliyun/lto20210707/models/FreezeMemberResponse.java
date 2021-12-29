// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class FreezeMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FreezeMemberResponseBody body;

    public static FreezeMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeMemberResponse self = new FreezeMemberResponse();
        return TeaModel.build(map, self);
    }

    public FreezeMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeMemberResponse setBody(FreezeMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeMemberResponseBody getBody() {
        return this.body;
    }

}
