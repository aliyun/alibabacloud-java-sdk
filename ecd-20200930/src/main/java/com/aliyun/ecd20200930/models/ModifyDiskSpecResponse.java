// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
