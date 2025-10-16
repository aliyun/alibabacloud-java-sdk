// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserSlsLogStorageTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserSlsLogStorageTimeResponseBody body;

    public static ModifyUserSlsLogStorageTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserSlsLogStorageTimeResponse self = new ModifyUserSlsLogStorageTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserSlsLogStorageTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserSlsLogStorageTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserSlsLogStorageTimeResponse setBody(ModifyUserSlsLogStorageTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserSlsLogStorageTimeResponseBody getBody() {
        return this.body;
    }

}
