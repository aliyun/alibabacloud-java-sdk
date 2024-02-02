// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyManagedInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyManagedInstanceResponseBody body;

    public static ModifyManagedInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyManagedInstanceResponse self = new ModifyManagedInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyManagedInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyManagedInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyManagedInstanceResponse setBody(ModifyManagedInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyManagedInstanceResponseBody getBody() {
        return this.body;
    }

}
