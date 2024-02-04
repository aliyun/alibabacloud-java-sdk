// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyMinorVersionGreadeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMinorVersionGreadeTypeResponseBody body;

    public static ModifyMinorVersionGreadeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMinorVersionGreadeTypeResponse self = new ModifyMinorVersionGreadeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMinorVersionGreadeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMinorVersionGreadeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMinorVersionGreadeTypeResponse setBody(ModifyMinorVersionGreadeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMinorVersionGreadeTypeResponseBody getBody() {
        return this.body;
    }

}
