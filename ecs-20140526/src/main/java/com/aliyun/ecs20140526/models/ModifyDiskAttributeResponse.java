// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskAttributeResponseBody body;

    public static ModifyDiskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskAttributeResponse self = new ModifyDiskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskAttributeResponse setBody(ModifyDiskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskAttributeResponseBody getBody() {
        return this.body;
    }

}
