// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDataCorrectExecSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDataCorrectExecSQLResponseBody body;

    public static ModifyDataCorrectExecSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataCorrectExecSQLResponse self = new ModifyDataCorrectExecSQLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataCorrectExecSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataCorrectExecSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataCorrectExecSQLResponse setBody(ModifyDataCorrectExecSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataCorrectExecSQLResponseBody getBody() {
        return this.body;
    }

}
