// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPortResponseBody body;

    public static ModifyPortResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortResponse self = new ModifyPortResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPortResponse setBody(ModifyPortResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPortResponseBody getBody() {
        return this.body;
    }

}
