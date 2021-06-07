// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LockUsersResponseBody body;

    public static LockUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        LockUsersResponse self = new LockUsersResponse();
        return TeaModel.build(map, self);
    }

    public LockUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockUsersResponse setBody(LockUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public LockUsersResponseBody getBody() {
        return this.body;
    }

}
