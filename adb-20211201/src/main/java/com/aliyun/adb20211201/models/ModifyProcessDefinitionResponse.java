// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProcessDefinitionResponseBody body;

    public static ModifyProcessDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessDefinitionResponse self = new ModifyProcessDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProcessDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProcessDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProcessDefinitionResponse setBody(ModifyProcessDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProcessDefinitionResponseBody getBody() {
        return this.body;
    }

}
