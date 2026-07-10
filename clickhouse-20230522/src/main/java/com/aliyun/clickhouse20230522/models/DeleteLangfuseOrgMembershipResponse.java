// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseOrgMembershipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLangfuseOrgMembershipResponseBody body;

    public static DeleteLangfuseOrgMembershipResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseOrgMembershipResponse self = new DeleteLangfuseOrgMembershipResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseOrgMembershipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLangfuseOrgMembershipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLangfuseOrgMembershipResponse setBody(DeleteLangfuseOrgMembershipResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLangfuseOrgMembershipResponseBody getBody() {
        return this.body;
    }

}
