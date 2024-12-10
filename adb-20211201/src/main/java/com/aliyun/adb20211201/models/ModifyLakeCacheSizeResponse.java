// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyLakeCacheSizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLakeCacheSizeResponseBody body;

    public static ModifyLakeCacheSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakeCacheSizeResponse self = new ModifyLakeCacheSizeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLakeCacheSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLakeCacheSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLakeCacheSizeResponse setBody(ModifyLakeCacheSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLakeCacheSizeResponseBody getBody() {
        return this.body;
    }

}
