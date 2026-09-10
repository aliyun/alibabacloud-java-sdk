// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecSqlTransSingleScriptTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecSqlTransSingleScriptTranslateResponseBody body;

    public static ExecSqlTransSingleScriptTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecSqlTransSingleScriptTranslateResponse self = new ExecSqlTransSingleScriptTranslateResponse();
        return TeaModel.build(map, self);
    }

    public ExecSqlTransSingleScriptTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecSqlTransSingleScriptTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecSqlTransSingleScriptTranslateResponse setBody(ExecSqlTransSingleScriptTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecSqlTransSingleScriptTranslateResponseBody getBody() {
        return this.body;
    }

}
