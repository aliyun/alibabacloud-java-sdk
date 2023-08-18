// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ModifyInstanceStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceStateResponseBody body;

    public static ModifyInstanceStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStateResponse self = new ModifyInstanceStateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceStateResponse setBody(ModifyInstanceStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceStateResponseBody getBody() {
        return this.body;
    }

}
