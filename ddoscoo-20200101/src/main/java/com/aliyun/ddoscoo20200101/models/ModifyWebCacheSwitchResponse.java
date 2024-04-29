// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebCacheSwitchResponseBody body;

    public static ModifyWebCacheSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheSwitchResponse self = new ModifyWebCacheSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCacheSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebCacheSwitchResponse setBody(ModifyWebCacheSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCacheSwitchResponseBody getBody() {
        return this.body;
    }

}
