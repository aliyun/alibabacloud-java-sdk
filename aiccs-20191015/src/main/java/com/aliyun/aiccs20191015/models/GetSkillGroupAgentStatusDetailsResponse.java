// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillGroupAgentStatusDetailsResponseBody body;

    public static GetSkillGroupAgentStatusDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsResponse self = new GetSkillGroupAgentStatusDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAgentStatusDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupAgentStatusDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupAgentStatusDetailsResponse setBody(GetSkillGroupAgentStatusDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupAgentStatusDetailsResponseBody getBody() {
        return this.body;
    }

}
