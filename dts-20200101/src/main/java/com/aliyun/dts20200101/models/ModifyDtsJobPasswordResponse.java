// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDtsJobPasswordResponseBody body;

    public static ModifyDtsJobPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobPasswordResponse self = new ModifyDtsJobPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobPasswordResponse setBody(ModifyDtsJobPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobPasswordResponseBody getBody() {
        return this.body;
    }

}
