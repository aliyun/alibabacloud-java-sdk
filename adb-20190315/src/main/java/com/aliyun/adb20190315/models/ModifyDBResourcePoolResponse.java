// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBResourcePoolResponseBody body;

    public static ModifyDBResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourcePoolResponse self = new ModifyDBResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBResourcePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBResourcePoolResponse setBody(ModifyDBResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBResourcePoolResponseBody getBody() {
        return this.body;
    }

}
