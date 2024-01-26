// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBundleResponseBody body;

    public static ModifyBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBundleResponse self = new ModifyBundleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBundleResponse setBody(ModifyBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBundleResponseBody getBody() {
        return this.body;
    }

}
