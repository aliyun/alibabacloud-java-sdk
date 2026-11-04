// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySkillGroupOutboundNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySkillGroupOutboundNumbersResponseBody body;

    public static ModifySkillGroupOutboundNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupOutboundNumbersResponse self = new ModifySkillGroupOutboundNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupOutboundNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySkillGroupOutboundNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySkillGroupOutboundNumbersResponse setBody(ModifySkillGroupOutboundNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySkillGroupOutboundNumbersResponseBody getBody() {
        return this.body;
    }

}
