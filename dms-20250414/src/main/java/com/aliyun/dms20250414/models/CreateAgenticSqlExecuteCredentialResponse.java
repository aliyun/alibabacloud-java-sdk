// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAgenticSqlExecuteCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgenticSqlExecuteCredentialResponseBody body;

    public static CreateAgenticSqlExecuteCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticSqlExecuteCredentialResponse self = new CreateAgenticSqlExecuteCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgenticSqlExecuteCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgenticSqlExecuteCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgenticSqlExecuteCredentialResponse setBody(CreateAgenticSqlExecuteCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgenticSqlExecuteCredentialResponseBody getBody() {
        return this.body;
    }

}
