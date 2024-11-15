// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCallbackResponseBody body;

    public static ModifyCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallbackResponse self = new ModifyCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCallbackResponse setBody(ModifyCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCallbackResponseBody getBody() {
        return this.body;
    }

}
