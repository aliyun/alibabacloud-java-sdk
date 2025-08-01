// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCasterLayoutResponseBody body;

    public static ModifyCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterLayoutResponse self = new ModifyCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCasterLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCasterLayoutResponse setBody(ModifyCasterLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterLayoutResponseBody getBody() {
        return this.body;
    }

}
