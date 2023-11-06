// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccountDescriptionResponseBody body;

    public static ModifyAccountDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponse self = new ModifyAccountDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountDescriptionResponse setBody(ModifyAccountDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountDescriptionResponseBody getBody() {
        return this.body;
    }

}
