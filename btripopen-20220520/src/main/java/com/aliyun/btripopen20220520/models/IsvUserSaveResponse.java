// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvUserSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IsvUserSaveResponseBody body;

    public static IsvUserSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        IsvUserSaveResponse self = new IsvUserSaveResponse();
        return TeaModel.build(map, self);
    }

    public IsvUserSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsvUserSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsvUserSaveResponse setBody(IsvUserSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public IsvUserSaveResponseBody getBody() {
        return this.body;
    }

}
