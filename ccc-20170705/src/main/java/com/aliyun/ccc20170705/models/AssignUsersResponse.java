// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AssignUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssignUsersResponseBody body;

    public static AssignUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignUsersResponse self = new AssignUsersResponse();
        return TeaModel.build(map, self);
    }

    public AssignUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignUsersResponse setBody(AssignUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignUsersResponseBody getBody() {
        return this.body;
    }

}
