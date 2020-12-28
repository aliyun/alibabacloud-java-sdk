// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUserPasswordsResponseBody body;

    public static ModifyUserPasswordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPasswordsResponse self = new ModifyUserPasswordsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserPasswordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserPasswordsResponse setBody(ModifyUserPasswordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserPasswordsResponseBody getBody() {
        return this.body;
    }

}
