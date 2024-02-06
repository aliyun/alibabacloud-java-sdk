// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImageSharePermissionResponseBody body;

    public static ModifyImageSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionResponse self = new ModifyImageSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageSharePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageSharePermissionResponse setBody(ModifyImageSharePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageSharePermissionResponseBody getBody() {
        return this.body;
    }

}
