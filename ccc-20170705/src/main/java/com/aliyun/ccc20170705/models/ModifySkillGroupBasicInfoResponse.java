// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySkillGroupBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySkillGroupBasicInfoResponseBody body;

    public static ModifySkillGroupBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupBasicInfoResponse self = new ModifySkillGroupBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySkillGroupBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySkillGroupBasicInfoResponse setBody(ModifySkillGroupBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySkillGroupBasicInfoResponseBody getBody() {
        return this.body;
    }

}
