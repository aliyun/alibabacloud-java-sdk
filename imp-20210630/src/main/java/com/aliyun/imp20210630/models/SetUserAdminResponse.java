// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SetUserAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetUserAdminResponseBody body;

    public static SetUserAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserAdminResponse self = new SetUserAdminResponse();
        return TeaModel.build(map, self);
    }

    public SetUserAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserAdminResponse setBody(SetUserAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserAdminResponseBody getBody() {
        return this.body;
    }

}
