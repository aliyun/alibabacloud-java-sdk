// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskSpecResponseBody body;

    public static ModifyDiskSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecResponse self = new ModifyDiskSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskSpecResponse setBody(ModifyDiskSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskSpecResponseBody getBody() {
        return this.body;
    }

}
