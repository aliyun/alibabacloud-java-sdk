// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillGroupResponseBody body;

    public static GetSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupResponse self = new GetSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupResponse setBody(GetSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupResponseBody getBody() {
        return this.body;
    }

}
