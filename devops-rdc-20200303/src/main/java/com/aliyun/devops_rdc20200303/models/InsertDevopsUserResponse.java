// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertDevopsUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertDevopsUserResponseBody body;

    public static InsertDevopsUserResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertDevopsUserResponse self = new InsertDevopsUserResponse();
        return TeaModel.build(map, self);
    }

    public InsertDevopsUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertDevopsUserResponse setBody(InsertDevopsUserResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertDevopsUserResponseBody getBody() {
        return this.body;
    }

}
