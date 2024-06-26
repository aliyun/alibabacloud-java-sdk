// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeAccountPasswordResponseBody body;

    public static ChangeAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountPasswordResponse self = new ChangeAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAccountPasswordResponse setBody(ChangeAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
