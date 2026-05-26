// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class GetSkillContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillContentResponseBody body;

    public static GetSkillContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillContentResponse self = new GetSkillContentResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillContentResponse setBody(GetSkillContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillContentResponseBody getBody() {
        return this.body;
    }

}
