// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySystemEventAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySystemEventAttributeResponseBody body;

    public static ModifySystemEventAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemEventAttributeResponse self = new ModifySystemEventAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySystemEventAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySystemEventAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySystemEventAttributeResponse setBody(ModifySystemEventAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySystemEventAttributeResponseBody getBody() {
        return this.body;
    }

}
