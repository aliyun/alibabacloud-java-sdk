// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCdsFileResponseBody body;

    public static ModifyCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileResponse self = new ModifyCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCdsFileResponse setBody(ModifyCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdsFileResponseBody getBody() {
        return this.body;
    }

}
