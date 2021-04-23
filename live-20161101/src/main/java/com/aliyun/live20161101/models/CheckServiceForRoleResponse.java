// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckServiceForRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceForRoleResponseBody body;

    public static CheckServiceForRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceForRoleResponse self = new CheckServiceForRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceForRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceForRoleResponse setBody(CheckServiceForRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceForRoleResponseBody getBody() {
        return this.body;
    }

}
