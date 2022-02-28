// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRoleResponseBody body;

    public static CheckRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRoleResponse self = new CheckRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRoleResponse setBody(CheckRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRoleResponseBody getBody() {
        return this.body;
    }

}
