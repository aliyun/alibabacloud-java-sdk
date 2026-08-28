// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyForwardSqlLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyForwardSqlLogConfigResponseBody body;

    public static ModifyForwardSqlLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardSqlLogConfigResponse self = new ModifyForwardSqlLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyForwardSqlLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyForwardSqlLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyForwardSqlLogConfigResponse setBody(ModifyForwardSqlLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyForwardSqlLogConfigResponseBody getBody() {
        return this.body;
    }

}
