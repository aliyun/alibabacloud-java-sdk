// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifySQAConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySQAConfigResponseBody body;

    public static ModifySQAConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySQAConfigResponse self = new ModifySQAConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifySQAConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySQAConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySQAConfigResponse setBody(ModifySQAConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySQAConfigResponseBody getBody() {
        return this.body;
    }

}
