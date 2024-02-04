// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountDescriptionResponseBody body;

    public static ModifyAccountDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponse self = new ModifyAccountDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountDescriptionResponse setBody(ModifyAccountDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountDescriptionResponseBody getBody() {
        return this.body;
    }

}
