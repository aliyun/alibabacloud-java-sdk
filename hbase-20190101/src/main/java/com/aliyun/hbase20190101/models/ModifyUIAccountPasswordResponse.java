// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyUIAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUIAccountPasswordResponseBody body;

    public static ModifyUIAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUIAccountPasswordResponse self = new ModifyUIAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUIAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUIAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUIAccountPasswordResponse setBody(ModifyUIAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUIAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
