// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckSlrRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSlrRoleResponseBody body;

    public static CheckSlrRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSlrRoleResponse self = new CheckSlrRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckSlrRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSlrRoleResponse setBody(CheckSlrRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSlrRoleResponseBody getBody() {
        return this.body;
    }

}
