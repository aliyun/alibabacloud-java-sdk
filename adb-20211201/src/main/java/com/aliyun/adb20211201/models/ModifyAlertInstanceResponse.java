// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAlertInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAlertInstanceResponseBody body;

    public static ModifyAlertInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlertInstanceResponse self = new ModifyAlertInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAlertInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAlertInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAlertInstanceResponse setBody(ModifyAlertInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAlertInstanceResponseBody getBody() {
        return this.body;
    }

}
