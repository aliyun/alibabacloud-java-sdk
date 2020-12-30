// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RemoveUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUsersResponseBody body;

    public static RemoveUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersResponse self = new RemoveUsersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUsersResponse setBody(RemoveUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUsersResponseBody getBody() {
        return this.body;
    }

}
