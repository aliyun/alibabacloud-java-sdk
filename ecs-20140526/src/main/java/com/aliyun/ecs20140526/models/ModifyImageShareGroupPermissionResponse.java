// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageShareGroupPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImageShareGroupPermissionResponseBody body;

    public static ModifyImageShareGroupPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareGroupPermissionResponse self = new ModifyImageShareGroupPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageShareGroupPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageShareGroupPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageShareGroupPermissionResponse setBody(ModifyImageShareGroupPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageShareGroupPermissionResponseBody getBody() {
        return this.body;
    }

}
