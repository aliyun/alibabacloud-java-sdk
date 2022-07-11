// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyForwardEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyForwardEntryResponseBody body;

    public static ModifyForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardEntryResponse self = new ModifyForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyForwardEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyForwardEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyForwardEntryResponse setBody(ModifyForwardEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyForwardEntryResponseBody getBody() {
        return this.body;
    }

}
