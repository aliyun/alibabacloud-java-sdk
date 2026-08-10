// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseSecurityIPListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLangfuseSecurityIPListResponseBody body;

    public static ModifyLangfuseSecurityIPListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseSecurityIPListResponse self = new ModifyLangfuseSecurityIPListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseSecurityIPListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLangfuseSecurityIPListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLangfuseSecurityIPListResponse setBody(ModifyLangfuseSecurityIPListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLangfuseSecurityIPListResponseBody getBody() {
        return this.body;
    }

}
