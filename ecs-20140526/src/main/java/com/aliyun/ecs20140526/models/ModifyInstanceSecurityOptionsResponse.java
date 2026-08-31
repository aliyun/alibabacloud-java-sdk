// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSecurityOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceSecurityOptionsResponseBody body;

    public static ModifyInstanceSecurityOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSecurityOptionsResponse self = new ModifyInstanceSecurityOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSecurityOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceSecurityOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceSecurityOptionsResponse setBody(ModifyInstanceSecurityOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceSecurityOptionsResponseBody getBody() {
        return this.body;
    }

}
