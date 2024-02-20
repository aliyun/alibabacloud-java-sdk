// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class ModifyTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTagResponseBody body;

    public static ModifyTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagResponse self = new ModifyTagResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTagResponse setBody(ModifyTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTagResponseBody getBody() {
        return this.body;
    }

}
