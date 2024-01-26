// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImagePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImagePermissionResponseBody body;

    public static ModifyImagePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImagePermissionResponse self = new ModifyImagePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImagePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImagePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImagePermissionResponse setBody(ModifyImagePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImagePermissionResponseBody getBody() {
        return this.body;
    }

}
