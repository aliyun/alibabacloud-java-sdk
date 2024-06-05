// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class ModifyDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatabaseResponseBody body;

    public static ModifyDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseResponse self = new ModifyDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatabaseResponse setBody(ModifyDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseResponseBody getBody() {
        return this.body;
    }

}
