// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyUIProxyAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUIProxyAccountPasswordResponseBody body;

    public static ModifyUIProxyAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUIProxyAccountPasswordResponse self = new ModifyUIProxyAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUIProxyAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUIProxyAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUIProxyAccountPasswordResponse setBody(ModifyUIProxyAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUIProxyAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
