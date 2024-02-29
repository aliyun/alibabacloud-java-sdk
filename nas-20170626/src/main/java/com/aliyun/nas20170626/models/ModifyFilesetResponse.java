// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFilesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFilesetResponseBody body;

    public static ModifyFilesetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFilesetResponse self = new ModifyFilesetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFilesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFilesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFilesetResponse setBody(ModifyFilesetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFilesetResponseBody getBody() {
        return this.body;
    }

}
