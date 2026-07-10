// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseOrgMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLangfuseOrgMemberResponseBody body;

    public static CreateLangfuseOrgMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseOrgMemberResponse self = new CreateLangfuseOrgMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseOrgMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLangfuseOrgMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLangfuseOrgMemberResponse setBody(CreateLangfuseOrgMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLangfuseOrgMemberResponseBody getBody() {
        return this.body;
    }

}
