// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLangfuseOrgResponseBody body;

    public static CreateLangfuseOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseOrgResponse self = new CreateLangfuseOrgResponse();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLangfuseOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLangfuseOrgResponse setBody(CreateLangfuseOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLangfuseOrgResponseBody getBody() {
        return this.body;
    }

}
