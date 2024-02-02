// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserResponseBody body;

    public static ModifyUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserResponse self = new ModifyUserResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserResponse setBody(ModifyUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserResponseBody getBody() {
        return this.body;
    }

}
