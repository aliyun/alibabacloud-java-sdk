// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CheckUserIfAuthoriseMyBaseSystemRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserIfAuthoriseMyBaseSystemRoleResponseBody body;

    public static CheckUserIfAuthoriseMyBaseSystemRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserIfAuthoriseMyBaseSystemRoleResponse self = new CheckUserIfAuthoriseMyBaseSystemRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponse setBody(CheckUserIfAuthoriseMyBaseSystemRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserIfAuthoriseMyBaseSystemRoleResponseBody getBody() {
        return this.body;
    }

}
