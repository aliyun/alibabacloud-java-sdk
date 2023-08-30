// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class ModifySynchronizationObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySynchronizationObjectResponseBody body;

    public static ModifySynchronizationObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySynchronizationObjectResponse self = new ModifySynchronizationObjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifySynchronizationObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySynchronizationObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySynchronizationObjectResponse setBody(ModifySynchronizationObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySynchronizationObjectResponseBody getBody() {
        return this.body;
    }

}
