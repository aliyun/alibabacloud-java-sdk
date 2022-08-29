// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyPrivateIdJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPrivateIdJobResponseBody body;

    public static ModifyPrivateIdJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivateIdJobResponse self = new ModifyPrivateIdJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrivateIdJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrivateIdJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrivateIdJobResponse setBody(ModifyPrivateIdJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrivateIdJobResponseBody getBody() {
        return this.body;
    }

}
