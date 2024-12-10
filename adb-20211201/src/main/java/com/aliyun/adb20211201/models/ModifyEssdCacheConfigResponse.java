// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyEssdCacheConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEssdCacheConfigResponseBody body;

    public static ModifyEssdCacheConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEssdCacheConfigResponse self = new ModifyEssdCacheConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEssdCacheConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEssdCacheConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEssdCacheConfigResponse setBody(ModifyEssdCacheConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEssdCacheConfigResponseBody getBody() {
        return this.body;
    }

}
