// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class IsUserAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IsUserAdminResponseBody body;

    public static IsUserAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        IsUserAdminResponse self = new IsUserAdminResponse();
        return TeaModel.build(map, self);
    }

    public IsUserAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsUserAdminResponse setBody(IsUserAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public IsUserAdminResponseBody getBody() {
        return this.body;
    }

}
