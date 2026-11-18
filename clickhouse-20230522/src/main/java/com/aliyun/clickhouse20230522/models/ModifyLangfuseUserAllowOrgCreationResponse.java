// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseUserAllowOrgCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLangfuseUserAllowOrgCreationResponseBody body;

    public static ModifyLangfuseUserAllowOrgCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseUserAllowOrgCreationResponse self = new ModifyLangfuseUserAllowOrgCreationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseUserAllowOrgCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLangfuseUserAllowOrgCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLangfuseUserAllowOrgCreationResponse setBody(ModifyLangfuseUserAllowOrgCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLangfuseUserAllowOrgCreationResponseBody getBody() {
        return this.body;
    }

}
