// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifyTrafficControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrafficControlResponseBody body;

    public static ModifyTrafficControlResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficControlResponse self = new ModifyTrafficControlResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrafficControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrafficControlResponse setBody(ModifyTrafficControlResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrafficControlResponseBody getBody() {
        return this.body;
    }

}
