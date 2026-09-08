// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetTenantSkillEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTenantSkillEnabledResponseBody body;

    public static SetTenantSkillEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTenantSkillEnabledResponse self = new SetTenantSkillEnabledResponse();
        return TeaModel.build(map, self);
    }

    public SetTenantSkillEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTenantSkillEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTenantSkillEnabledResponse setBody(SetTenantSkillEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTenantSkillEnabledResponseBody getBody() {
        return this.body;
    }

}
