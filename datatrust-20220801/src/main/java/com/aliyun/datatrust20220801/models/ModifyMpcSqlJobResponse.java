// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyMpcSqlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMpcSqlJobResponseBody body;

    public static ModifyMpcSqlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMpcSqlJobResponse self = new ModifyMpcSqlJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMpcSqlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMpcSqlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMpcSqlJobResponse setBody(ModifyMpcSqlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMpcSqlJobResponseBody getBody() {
        return this.body;
    }

}
