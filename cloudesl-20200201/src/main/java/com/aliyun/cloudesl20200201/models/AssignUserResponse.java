// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AssignUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssignUserResponseBody body;

    public static AssignUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignUserResponse self = new AssignUserResponse();
        return TeaModel.build(map, self);
    }

    public AssignUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignUserResponse setBody(AssignUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignUserResponseBody getBody() {
        return this.body;
    }

}
