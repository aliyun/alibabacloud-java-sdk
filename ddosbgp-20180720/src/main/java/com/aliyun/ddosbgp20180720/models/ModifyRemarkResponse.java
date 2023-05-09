// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRemarkResponseBody body;

    public static ModifyRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemarkResponse self = new ModifyRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRemarkResponse setBody(ModifyRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRemarkResponseBody getBody() {
        return this.body;
    }

}
