// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClickhouseEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClickhouseEngineResponseBody body;

    public static ModifyClickhouseEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClickhouseEngineResponse self = new ModifyClickhouseEngineResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClickhouseEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClickhouseEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClickhouseEngineResponse setBody(ModifyClickhouseEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClickhouseEngineResponseBody getBody() {
        return this.body;
    }

}
