// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyUserPasswordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserPasswordsResponse setBody(ModifyUserPasswordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserPasswordsResponseBody getBody() {
        return this.body;
    }

}
