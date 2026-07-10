// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseProjectMembershipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLangfuseProjectMembershipResponseBody body;

    public static ModifyLangfuseProjectMembershipResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseProjectMembershipResponse self = new ModifyLangfuseProjectMembershipResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseProjectMembershipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLangfuseProjectMembershipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLangfuseProjectMembershipResponse setBody(ModifyLangfuseProjectMembershipResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLangfuseProjectMembershipResponseBody getBody() {
        return this.body;
    }

}
