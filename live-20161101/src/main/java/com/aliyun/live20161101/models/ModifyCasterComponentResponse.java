// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCasterComponentResponseBody body;

    public static ModifyCasterComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterComponentResponse self = new ModifyCasterComponentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCasterComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCasterComponentResponse setBody(ModifyCasterComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterComponentResponseBody getBody() {
        return this.body;
    }

}
