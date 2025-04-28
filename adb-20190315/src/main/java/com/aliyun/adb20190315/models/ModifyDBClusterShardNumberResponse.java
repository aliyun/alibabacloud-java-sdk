// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterShardNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterShardNumberResponseBody body;

    public static ModifyDBClusterShardNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterShardNumberResponse self = new ModifyDBClusterShardNumberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterShardNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterShardNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterShardNumberResponse setBody(ModifyDBClusterShardNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterShardNumberResponseBody getBody() {
        return this.body;
    }

}
