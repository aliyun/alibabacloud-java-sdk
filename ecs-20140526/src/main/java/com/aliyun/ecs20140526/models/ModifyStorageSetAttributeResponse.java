// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageSetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStorageSetAttributeResponseBody body;

    public static ModifyStorageSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageSetAttributeResponse self = new ModifyStorageSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageSetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStorageSetAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStorageSetAttributeResponse setBody(ModifyStorageSetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStorageSetAttributeResponseBody getBody() {
        return this.body;
    }

}
