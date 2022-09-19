// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProcessInstanceResponseBody body;

    public static ModifyProcessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessInstanceResponse self = new ModifyProcessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProcessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProcessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProcessInstanceResponse setBody(ModifyProcessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProcessInstanceResponseBody getBody() {
        return this.body;
    }

}
