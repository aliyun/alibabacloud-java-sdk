// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCommandResponseBody body;

    public static ModifyCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandResponse self = new ModifyCommandResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCommandResponse setBody(ModifyCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCommandResponseBody getBody() {
        return this.body;
    }

}
