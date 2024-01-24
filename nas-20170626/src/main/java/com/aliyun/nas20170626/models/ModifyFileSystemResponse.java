// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFileSystemResponseBody body;

    public static ModifyFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemResponse self = new ModifyFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFileSystemResponse setBody(ModifyFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFileSystemResponseBody getBody() {
        return this.body;
    }

}
