// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseOrgMembershipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLangfuseOrgMembershipResponseBody body;

    public static ModifyLangfuseOrgMembershipResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseOrgMembershipResponse self = new ModifyLangfuseOrgMembershipResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseOrgMembershipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLangfuseOrgMembershipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLangfuseOrgMembershipResponse setBody(ModifyLangfuseOrgMembershipResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLangfuseOrgMembershipResponseBody getBody() {
        return this.body;
    }

}
