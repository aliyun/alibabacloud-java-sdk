// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostPasswordResponseBody body;

    public static ModifyDedicatedHostPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostPasswordResponse self = new ModifyDedicatedHostPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedHostPasswordResponse setBody(ModifyDedicatedHostPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostPasswordResponseBody getBody() {
        return this.body;
    }

}
